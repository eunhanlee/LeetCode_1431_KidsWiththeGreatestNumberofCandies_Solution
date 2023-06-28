import java.util.*;

class Solution {
    /**
     * Determines if each kid can have the maximum number of candies by adding extra candies.
     *
     * @param candies      an array of integers representing the number of candies each kid has
     * @param extraCandies the additional candies each kid can have
     * @return a list of booleans indicating whether each kid can have the maximum number of candies
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies in the given array
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check if each kid can have the maximum number of candies
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            // Add a boolean value indicating whether the kid can have the maximum number of candies
            result.add((candy + extraCandies >= max));
        }

        return result;
    }

}