public class MinNum {

        // Prints the minimum number that can be formed from
        // input sequence of I's and D's
        static int PrintMinNumberForPattern(String arr){

            int curr_max = 0;
            int last_entry = 0;
            int j;
            String str="";
            for (int i = 0; i < arr.length(); i++)
            {
                int noOfNextD = 0;
                switch (arr.charAt(i))
                {
                    case 'N':

                        j = i + 1;
                        while (j < arr.length() && arr.charAt(j) == 'M')
                        {
                            noOfNextD++;
                            j++;
                        }

                        if (i == 0)
                        {
                            curr_max = noOfNextD + 2;

                            str = str + ++last_entry;
                            str= str + curr_max;
                            last_entry = curr_max;
                        }
                        else
                        {
                            curr_max = curr_max + noOfNextD + 1;
                            last_entry = curr_max;
                            str=str+ last_entry;
                        }

                        for (int k = 0; k < noOfNextD; k++)
                        {
                            str+= --last_entry;
                            i++;
                        }
                        break;


                    case 'M':
                        if (i == 0)
                        {
                            j = i + 1;
                            while (j < arr.length()&&arr.charAt(j) == 'M')
                            {
                                noOfNextD++;
                                j++;
                            }

                            curr_max = noOfNextD + 2;

                            str+= curr_max + ""+ (curr_max - 1);

                            last_entry = curr_max - 1;
                        }
                        else
                        {
                            str+= (last_entry - 1);
                            last_entry--;
                        }
                        break;
                }
            }
            int ans =Integer.parseInt(str);
            return ans;
        }


        // Driver code
        public static void main(String[] args)
        {
          System.out.println(PrintMinNumberForPattern("M"));

        }
    }

// This code is contributed by Princi Singh
