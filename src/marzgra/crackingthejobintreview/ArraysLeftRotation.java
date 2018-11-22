/*
TASK:
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
For example, if left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a
single line of space-separated integers.
 */

package marzgra.crackingthejobintreview;

import java.util.Scanner;

public class ArraysLeftRotation {

    private static int[] arrayLeftRotation(int[] a, int n, int rotation) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int index;
            index = i - rotation;
            if (index < 0) index = n + index;
            tab[index] = a[i];
        }

        return tab;
    }

    private static int[] rotateArray(int[] a, int r){
        int[] rotatedEnd = Arrays.copyOfRange(a, 0, r);
        int[] rest = Arrays.copyOfRange(a, r, a.length);
        int[] result = new int[a.length];
        System.arraycopy(rest, 0, result, 0, rest.length);
        System.arraycopy(rotatedEnd, 0, result, rest.length, rotatedEnd.length);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rotation = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output;
        output = arrayLeftRotation(a, n, rotation);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
    }
}
