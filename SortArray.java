/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Input Format

Integer N.
Integer Array of size N.

Constraints

1 <= N <= 10^6
0 <= A[i] <= 2

*/

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SortArray {

    /*
     * Complete the 'sort_an_array' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> sort_an_array(int n, List<Integer> arr) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            int val = arr.get(mid);
            if (val == 0) {
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            } else if (val == 1) {
                mid++;
            } else { 
                Collections.swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> result = sort_an_array (arr.size(), arr);
       bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
