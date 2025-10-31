/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Input Format

First line is the length of the array
Second line is the elements of the array

Constraints

1 <= arr.length <= 3 * 104
-100 <= arr[i] <= 100
arr is sorted in non-decreasing order.

Output Format

Return length of array after removing duplicates
*/


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicates {

    public static int remove_dupli(List<Integer> arr) {
        // Write your code here
        int i = 0, j = 1;
        while(j < arr.size()) {
            if(!Objects.equals(arr.get(i), arr.get(j))){
                i++;
                if(i!=j){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
            j++;
        }

        return i+1;
    }
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 0, 0, 5, 6));
        int result = remove_dupli(arr);
        System.out.println(result);

    }
}
