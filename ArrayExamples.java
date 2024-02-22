class Pair {
    int a;
    int b;
    
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    String pairToString() {
        return this.a +  ", " + this.b;
    }
}


class ArrayExamples {
    
    String reverseJoinWith(String[] arr, String separator) {
        if (arr.length < 1) {
            return "";
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            String output = "";
            for (int i = arr.length - 1; i > 0; i--) {
                    output += arr[i] + separator;
                }
                return output + arr[0];
            } 
        }

    public static boolean logicalOr(boolean[] arr) {
        if (arr.length == 0) {
            return false;
        } else {
            for (int i = 0; i < arr.length - 1; i++) { // here we could do for (boolean element : arr) { if (element) {return true}}
                if (arr[i] == true) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean allOutsideRange(double[] arr, double high, double low) {
        if (arr.length == 0) {
            return false;
        }
        for (double val : arr) {
            if (val >= low && val <= high) {
                return false;
            }
        }
        return true;
    }

    public static Pair addMulti(int[] arr) {
        int a = 0;
        int b = 1;
        for (int num : arr) {
            a += num;
        }
        for (int num : arr) {
            b *= num;
        }
        return new Pair(a, b);
    } 

    // public static String lastSortedString(String[] arr) {
    //     if (arr.length == 1) {
    //         return arr[0];
    //     } else {                              Inefficient and redundant
    //         String output = "";
    //         for (int i = 0; i < arr.length - 1; i++) {
    //             String compareMe = arr[i];
    //             for (String str : arr) {
    //                 if (compareMe.compareTo(str) > 0) {
    //                     output = compareMe;
    //                 }
    //             }
    //         }
    //         return output;
    //     }
    // }

    public static String lastSortedString(String[] arr) {
        String output = arr[0];
        for (String str : arr) {
            if (str.compareTo(output) > 0) {
                output = str;
            }
        }
        return output;
    }

    public static int lookup(String[] keys, int[] values, String key) {
        for (int i = 0; i < keys.length; i++) { // just use keys.length here :D
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String[] strlst1 = {"a","b","c"};
        // String[] strlst2 = {"a"};
        // String[] strlst3 = {};
        // System.out.println(reverseJoinWith(strlst1, ":"));
        // System.out.println(reverseJoinWith(strlst2, ":"));
        // System.out.println(reverseJoinWith(strlst3, ":"));

        // boolean[] boolarr1 = {true, true, true, false};
        // boolean[] boolarr2 = {false, false, false, false};
        // boolean[] boolarr3 = {true, true, true, true};
        // boolean[] boolarr4 = {};

        // System.out.println(logicalOr(boolarr1));
        // System.out.println(logicalOr(boolarr2));
        // System.out.println(logicalOr(boolarr3));
        // System.out.println(logicalOr(boolarr4));

        // double[] doubleArr1 = {1.1, 5.2, 6.1, 1.9, 5.1};
        // double[] doubleArr2 = {4.1, 5.2, 6.1, 3.9, 5.1};
        // double[] doubleArr3 = {1.0, 5.2, 6.1, 1.9, 5.0};
        // double[] doubleArr4 = {};

        // System.out.println(allOutsideRange(doubleArr1, 5.0, 2.0));
        // System.out.println(allOutsideRange(doubleArr2, 5.0, 2.0));
        // System.out.println(allOutsideRange(doubleArr3, 5.0, 1.0));
        // System.out.println(allOutsideRange(doubleArr4, 5.0, 2.0));

        // int[] intArr1 = {1,2,3,4,5};
        // int[] intArr2 = {5};
        // int[] intArr3 = {-1,2,-3,4,-5};
        // int[] intArr4 = {-1,-2,-3,-4,-5};

        // System.out.println(addMulti(intArr1).pairToString());
        // System.out.println(addMulti(intArr2).pairToString());
        // System.out.println(addMulti(intArr3).pairToString());
        // System.out.println(addMulti(intArr4).pairToString());

        // String[] lexi1 = {"bye", "hello", "goodbye"};
        // System.out.println(lastSortedString(lexi1));

        // String[] schools = {"UCSD", "UCLA", "UCI"};
        // int[] values = {36000, 44900, 33467};

        // System.out.println(lookup(schools, values, "UCI"));

    }
}