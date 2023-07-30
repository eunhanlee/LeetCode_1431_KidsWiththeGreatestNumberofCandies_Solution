# LeetCode 1431. Kids With the Greatest Number of Candies Java Solution

category: Algorithm Solving
Status: Request Complete
Tags: Algorithm, LeetCode, Java, Problem Solving, 1431. Kids With the Greatest Number of Candies
Created time: July 30, 2023 10:35 AM
Translate Link: LeetCode 1431. Kids With the Greatest Number of Candies 자바 문제 풀이 (https://www.notion.so/LeetCode-1431-Kids-With-the-Greatest-Number-of-Candies-aa65fc5309074a18b6dfa2367e7de78a?pvs=21)
Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-1431-kids-with-the-greatest-number-of-candies-java-solution
Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-1431-kids-with-greatest-number.html

## Problem

[Kids With the Greatest Number of Candies - LeetCode](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/)

### Approach

- Algorithm
    - First, find the maximum value in the given array.
    - Traverse each element in the array, and for each kid, check if adding the extra candies makes their candy count greater than or equal to the maximum count.
    - If it is greater, add `true` to the result list, otherwise add `false`.
- There is no need to put `candy + extraCandies` inside parentheses in the if statement (`if(candy + extraCandies < max)`). Java operator precedence will handle it correctly without the need for explicit grouping.
- The if statement can be replaced with the ternary operator:

```java
result.add(candy + extraCandies >= max ? true : false);
```

### References

[Java Operator Precedence](https://www.notion.so/Java-Operator-Precedence-b19da3d6abda42d7aa6e10d809eda687?pvs=21) 

[What is Java Ternary Operator(?:)](https://www.notion.so/What-is-Java-Ternary-Operator-ce52757a41fc45ffa648ebdca4eb61f8?pvs=21) 

## Github Link

[https://github.com/eunhanlee/LeetCode_1431_KidsWiththeGreatestNumberofCandies_Solution.git](https://github.com/eunhanlee/LeetCode_1431_KidsWiththeGreatestNumberofCandies_Solution.git)

## Time Complexity: O(n), Space Complexity: O(n)

```java
/**
 * Determines whether each kid can have the maximum number of candies considering the extra candies.
 *
 * @param candies       An integer array representing the number of candies each kid has.
 * @param extraCandies  The number of extra candies each kid can have.
 * @return              A list of booleans representing whether each kid can have the maximum number of candies.
 */
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    // Find the maximum number of candies in the given array.
    int max = 0;
    for (int candy : candies) {
        max = Math.max(max, candy);
    }

    // Check if each kid can have the maximum number of candies.
    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candy : candies) {
        // If adding the extra candies makes the current kid's candy count greater than or equal to the maximum count,
        // consider them able to have the maximum number of candies.
        result.add(candy + extraCandies >= max ? true : false);
    }

    return result;
}
```