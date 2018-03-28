//
// Created by haibo on 3/28/18.
//

#include "MaxChunks.h"
#include <iostream>

// see https://leetcode.com/problems/max-chunks-to-make-sorted
// Given an array arr that is a permutation of [0, 1, ..., arr.length - 1], we split the array into some number of
// "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.
// What is the most number of chunks we could have made?
// Example 1:
// Input: arr = [4,3,2,1,0]
// Output: 1
// Explanation:
// Splitting into two or more chunks will not return the required result.
// For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
// Example 2:
// Input: arr = [1,0,2,3,4]
// Output: 4
// Explanation:
// We can split into two chunks, such as [1, 0], [2, 3, 4].
// However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
// Note:
// arr will have length in range [1, 10].
// arr[i] will be a permutation of [0, 1, ..., arr.length - 1].
int MaxChunks::maxChunksToSorted() {
    vector<int> asc;

    asc.push_back(arr[0]);

    for (int i = 1; i < arr.size(); i++) {
        int m = arr[i];
        while (asc.size() > 0 &&  arr[i] < asc[asc.size() - 1]) {
            m = max(m, asc[asc.size() - 1]);
            asc.pop_back();
        }
        asc.push_back(m);
    }

    return asc.size();
}