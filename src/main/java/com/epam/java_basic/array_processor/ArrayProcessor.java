package com.epam.java_basic.array_processor;

/**
 *  Useful methods for array processing
 */
public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int a = 0;
        int b = 0;
        for (int i = 0; i <= 18; i++) {
            if (input[i] > input[i + 1]) {
                if (input[i] < 0) {
                    a = i;
                    b = input[i];

                }
            }
        }
        int c = 0;
        int d = 99;
        for (int i = 0; i <= 18; i++) {
            if (input[i] < input[i + 1]) {
                if (input[i] < d) {
                    if (input[i] > 0) {
                        c = i;
                        d = input[i];
                    }
                }
            }
        }
        // System.out.println("number of max c: " + c);
        // System.out.println("max d: " + d);
        input[a] = d;
        input[c] = b;
        System.out.println(" ");
        System.out.println("1) Exchange max negative and min positive elements:");
        for (int i = 0; i <= 19; i++) {
            System.out.print(input[i] + " ");
        }
        return input;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i <= 19; i++)
        {
            if (input[i] > 0)
            {
                if ((i+1) % 2 ==0)
                {
                    sum = sum + input[i];
                }
            }
        }
        System.out.println("2) Sum of elements on even positions:");


        return sum;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        for (int i = 0; i <= 19; i++) {
            if (input[i] < 0){
                input[i] = 0;
            }
        }
        System.out.println("3) Replace negative values with 0");
        for (int i = 0; i <=19; i++) {
            System.out.print(input[i]+ " ");
        }
        return input;
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        int a = 0;
        for (int i = 0; i <= 18; i++)
        {
            if (input[i+1] < 0)
            {
                if (input[i] >0)
                {
                    a = input[i] * 3;
                    input[i] = a;
                }
            }
        }
        System.out.println("4) Multiply by 3 each positive element standing before negative one");
        for (int i = 0; i <= 19; i++)
        {
            System.out.print(input[i] + " ");
        }


        return input;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        int a = 0;
        int b = 0;
        for (int i = 0; i <= 18; i++) {
            if (input[i] < input[i + 1]) {
                if (input[i] < 0) {
                    if (input[i] < b) {
                        a = i;
                        b = input[i];
                    }
                }
            }
        }
        float sum = 0;
        for (int i = 0; i <= 19; i++)
        {
            sum = sum + input[i];
        }
        System.out.println("5) Difference between average and min element in array: ");
        sum = sum / 20 ;
        float result = 0;
        //  System.out.println("number of min a: " + a);
        //  System.out.println("min b: " + b);
        result = sum - b;
        return result;
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        System.out.println("6) Elements which present more than one time and stay on odd index");
        String result = new String();
        String simvol = new String();
        int h = -1;
        for ( int i = 0 ; i <= 19; i++ ){
            for ( int j = 0 ; j <= 19; j++ ){
                if (input[i] == input[j]){
                    if (i % 2 !=0 || j % 2 !=0) {
                        if (i != j) {
                            //   String b = String.valueOf(input[i]);
                            // int index = result.compareTo(b);
                            //  System.out.println("index" + index);
                            h = result.indexOf(input[i]);
                            if (h < 0) {
                                result = result + input[i] + " ";
                            }
                        }
                    }
                    //  {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
                }
            }
        }
        /*
        StringBuilder sb = new StringBuilder();
        int idx;
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            idx = result.indexOf(c, i + 1);
            if (idx == -1) {
                sb.append(c);
            }
        }
        String nun = new String();
        for (int i = 0; i <= result.length(); i++ ){
            String answer = result.charAt(i) + " ";
            nun = answer;
        }
        System.out.println(nun);
*/
        System.out.println(result);
        return input;

    }

}
