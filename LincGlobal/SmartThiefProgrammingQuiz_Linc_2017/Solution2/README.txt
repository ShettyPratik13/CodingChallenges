Explanation: 

The question is how to rob a circular row of houses. If we rob the first house, we cannot rob the last. If we rob the last house, we cannot rob the first.

I ensure this by making two calls to rob(), one with the last house excluded, one with the first house excluded.

For example, 1 -> 2 -> 3 -> 1 becomes 2 -> 3 if 1 is not robbed.

Since every house is either robbed or not robbed and at least half of the houses are not robbed, the solution is simply the larger of two cases with consecutive houses, i.e. house i not robbed, break the circle, solve it, or house i + 1 not robbed. Hence, the following solution.

I print the sequence of houses stolen and the maximum profit obtained.

To trace the houses stolen, I create four VarArray objects, each for i,e,include and exclude (having maximum sum and array of houses stolen for that sum). include hold the maximum running cost including the current house, exclude holds the maximum running cost excluding the current house;

Time and space complexity:

This algorithm runs in O(n) time as it needs only 2 passes through the json/array. It uses O(n) space since four arrays are created of size n each.