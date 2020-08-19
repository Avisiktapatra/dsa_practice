

class gfg1 {

    // Function to find maximum product subarray
    static int maxProduct(int arr[], int n)
    {
        int length =1;
        int minVal = arr[0];
        int maxVal = arr[0];

        int maxProduct = arr[0];

        for (int i = 1; i < n; i++)
        {
            if (arr[i] < 0)
            {
                int temp = maxVal;
                maxVal = minVal;
                minVal =temp;

            }
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            int initialmp = maxProduct;
            maxProduct = Math.max(maxProduct, maxVal);
            if(initialmp != maxProduct)
                length ++;
        }

        // Return maximum product found in array.
        return length;
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = { 1,-3,-10,0,60 };
        int n = arr.length;

        System.out.println( "Maximum Subarray product is "
                + maxProduct(arr, n));
    }
}

// This code is contributed by anuj_67.
