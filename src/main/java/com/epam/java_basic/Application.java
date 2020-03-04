package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        int arr[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int arr1[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int arr2[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int arr3[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int arr4[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int arr5[] = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};


        System.out.println("Original array:");

        for (int i = 0; i <= 19; i++) {
            System.out.print(arr[i] + " ");
        }
        ArrayProcessor Arr = new ArrayProcessor();
        System.out.println(Arr.swapMaxNegativeAndMinPositiveElements(arr));
        System.out.println(Arr.countSumOfElementsOnEvenPositions(arr1));
        System.out.println(Arr.replaceEachNegativeElementsWithZero(arr2));
        System.out.println(Arr.multiplyByThreeEachPositiveElementStandingBeforeNegative(arr3));
        System.out.println(Arr.calculateDifferenceBetweenAverageAndMinElement(arr4));
        System.out.println(Arr.findSameElementsStandingOnOddPositions(arr5));

    }
}
