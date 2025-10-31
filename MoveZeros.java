/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Input Format

First line is length of the array Next line is the elements of the array

Constraints

1 <= arr.length <= 104
0 <= arr[i] <= 231 - 1

 */


import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class MoveZeros {

    public static List<Integer> move_func(int n, List<Integer> arr) {
        // Write your code here
        int lastNonZeroIdx = 0;

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != 0) {
                // Swap only if needed
                if (i != lastNonZeroIdx) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(lastNonZeroIdx));
                    arr.set(lastNonZeroIdx, temp);
                }
                lastNonZeroIdx++;
            }
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 0, 0, 5, 6));
        List<Integer> result = move_func(8, arr);
        System.out.println(result);

    }
}
