package Stack;

import java.util.Stack;

/*
* Great question! Let me break down the thought process step by step, without diving into code. This is exactly how you should approach these problems.

## Understanding the Problem First

**What is 132 pattern?**
- We need three numbers: first < third < second
- BUT they appear in positions: i < j < k
- So position-wise: i, j, k but value-wise: small, BIG, medium

Take a moment to really visualize this - it's counterintuitive because the "biggest" number comes in the middle position!

## The Intuition Journey

**First attempt (like yours):**
"Let me just check consecutive elements" - This is natural but wrong because the pattern can span across the entire array.

**Second realization:**
"I need to check ALL possible triplets" - This leads to O(n³) brute force. Not efficient, but it works and helps you understand the pattern.

**Third insight:**
"Can I optimize this?" - Here's where you start thinking about what information you can precompute or maintain as you scan.

**The key breakthrough:**
"What if I fix one element and see what I need for the other two?"

## The Mental Model for Stack Solution

Think of it like this:

1. **Scan right to left** (this is the key insight!)
2. **Maintain potential "3" values** (the biggest numbers that could be our middle element)
3. **Keep track of the best "2" candidate** (numbers that were kicked out by bigger numbers)

## Why Right to Left?

This is the crucial insight! When you scan right to left:
- You encounter the "k" position first
- Then you encounter the "j" position
- Finally you encounter the "i" position

This natural order helps you build up the pattern piece by piece.

## The Stack Mental Model

Think of the stack as "candidates for being the biggest number (3) in our pattern."

When you see a new number that's bigger than what's on top of your stack, it means:
- The new number could be a better "3" candidate
- The old number that got kicked out could be a perfect "2" candidate
- Why? Because new_number > old_number, so old_number could be our middle value!

## Questions to Build This Intuition

**Easy warmups:**
1. Find any increasing subsequence of length 3
2. Find any decreasing subsequence of length 3
3. Two Sum using stack

**Building to 132:**
4. 321 pattern (decreasing)
5. 123 pattern (increasing)
6. Now 132 pattern

**Stack pattern recognition:**
7. Next Greater Element
8. Daily Temperatures
9. Largest Rectangle in Histogram

**Similar "maintain the best candidate" problems:**
10. Longest Increasing Subsequence
11. Russian Doll Envelopes

## The General Pattern

Many stack problems follow this template:
1. **Scan in one direction** (often right to left gives cleaner logic)
2. **Stack maintains candidates** for something (usually in some sorted order)
3. **When you pop from stack, it gives you useful information** about relationships
4. **Keep track of additional state** (like our "third" variable) based on what you pop

## Key Questions to Ask Yourself

Before coding ANY stack problem:
- What direction should I scan?
- What does my stack represent?
- When should I pop from the stack?
- What information do I get when I pop?
- What additional state do I need to maintain?

## The "Aha!" Moment

The real insight is: "When I kick out a smaller number from my stack because I found a bigger one, that smaller number becomes a perfect candidate for the middle value in my pattern!"

This is the core of many stack problems - the act of popping gives you valuable information about relationships between elements.

Does this help clarify the thinking process? The key is to build this intuition gradually through practice, not jump straight to the optimal solution!
* */
public class pattern132 {
    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[j] > nums[i] && nums[j] > nums[k] && nums[k] > nums[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean find132patternOpt(int[] nums) {
        int min = nums[0];

        for (int j = 1; j < nums.length - 1; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (min < nums[k] && nums[k] < nums[j]) {
                    return true;

                }

                min = Math.min(min, nums[j]);
            }
        }
        return false;
    }

    public static boolean pattern132(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[]nums={1,2,4,3};


        System.out.println(pattern132(nums));

    }
}
