class Debug{
    public static void main(String[] args){
        //System.out.println("The number of arguments: " + args.length);
        if (args.length < 1) {
            System.out.println("No keyword is given"); 
        }
        else if (args[0].substring(0,2).equals("--")) {
            String keyword = args[0].substring(2);
            // System.out.println("Keyword: " + keyword);
            int count = 0;
            for (int i = 1; i < args.length; i++) {
                // System.out.println("Current i: " + i);
                if(keyword.equals(args[i])) {
                    count += 1;
                }
                // System.out.println("Current count: " + count);
            }
            System.out.println("The answer is " + count);
        }
        else { 
            System.out.println("Write a keyword with the prefix --");
        }
    }
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


    // here we could do for (boolean element : arr) { if (element) {return true}}