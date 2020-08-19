

import java.util.*;

    class gfg2 {

        // The main function that prints the
        // arrangement with the largest value.
        // The function accepts a vector of strings
        static void printLargest(String arr[]){

            Arrays.sort(arr, new Comparator<String>(){

                // A comparison function which is used by
                // sort() in printLargest()
                @Override
                public int compare(String X, String Y) {

                    // first append Y at the end of X
                    String XY=X + Y;

                    // then append X at the end of Y
                    String YX=Y + X;

                    // Now see which of the two formed numbers
                    // is greater
                    return XY.compareTo(YX) > 0 ? -1:1;
                }
            });

            for(String s:arr)
                System.out.print(s);

        }

        // driver program
        public static void main (String[] args) {
String[] arr ={"54","546","548","60"};

            printLargest(arr);
        }
    }
