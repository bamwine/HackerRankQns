package bamwine.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Functions {

     String function(String a, String b) {

        /*the fuction forms word by taking first charater from each string and just
        and just appends the last chareters if one of the string is longer than the other   */

        int len_a = a.length();
        int len_b = b.length();
        int longest = 0;
        String hold = "";


        if (len_a > len_b) {
            longest = len_a;
        } else {
            longest = len_b;
        }


        for (int k = 0; k < longest; k++) {

            if (k <= a.length() - 1) {
                hold += a.charAt(k);
            }
            if (k <= b.length() - 1) {
                hold += b.charAt(k);
            }


        }
        return hold;

    }

     void countFreq(int k, List<Integer> arr) {
        Map<Integer, Integer> mp = new HashMap<>();


        for (int i = 0; i < k; i++) {
            mp.put(arr.get(k), mp.get(i) == null ? 1 : mp.get(i) + 1);
        }


        for (int i = 0; i < k; i++) {
            if (mp.get(i) != -1) {
                System.out.println(mp.get(i) + " " + mp.get(i));
                mp.put(mp.get(i), -1);
            }
        }
    }

     Boolean sumIsPower(int arr[]) {

       /* Boolean sumIsPower(int arr[])
        which outputs true if the sum of the elements in the input array arr is a power of 2, false otherwise
        Recall that the powers of 2 are 1, 2, 4, 8,16, and so on.
        In general a number is a power of 2 if and only if it ts of the form 2" for some non negative integer n.
        You may assume (without verifying in your code that all elements in the array are positive integers.
        If the input array arr is null, the return value should be false.
        Examples: sumfsPower({8,8,8,8}) is true since 8 + 8 + 8 + 8 = 32 = 25.
        sumIsPower({8,8,8}} is false, since 8 + 8 +8 = 24, not a power of 2.
*/

        int sum = 0;
        if (arr.length % 2 == 0 && arr.length != 0) {

            for (int k = 0; k < arr.length; k++) {

                if (arr[k] % 2 != 0 || arr[k] < 0) {

                    return false;
                } else {
                    sum += arr[k];

                }

            }
            System.out.println(sum);
            if (sum > 9) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }


    }

     int[] fill(int arr[], int k, int n) {
        /*
         *
         * int[] fill(int arr[],int k,int n)
         * which does the following: It returns an integer array arr2 of length n whose first k elements are the same as the first k elements of arr,
         * and whose remaining elements consist of repeating blocks of the first k elements.
         * You can assume array arr has at least k elements. The function should return null if either k or n Is not positive.
         * Examples:fill({1,2,3,5,9, 12,-2,-1}, 3, 10)returns {1,2,3,l,2,3,l,2,3,1}.
         * Fill({4,2,-3,12},1,5)returs {4,4,4,4,4).fill({2, 6, 9, 0,-3}, 0, 4) returns	null.
         * int arr[] = {1, 2, 3, 5, 9, 12, -2, -1};
        *  int k = 3;
        *  int n = 10;

         * */


        int arr2[] = new int[n];
        int i, p;
        if (k < 0 || n < 0 || k == 0) {
            return null;

        } else {
            for (i = 0, p = 0; i < k || p < n - 1; i++, p++) {
                if (i != k) {
                    arr2[p] = arr[i];
                }
//                if(i==k){
                if (i % k == 0) {
                    i = 0;
                    arr2[p] = arr[i];

                }


            }

        }
        return arr2;

    }

     int isHollow(int arr[]) {
       /* An array is said to be hollow if it contains 3 or more zeros in the middle that
        are preceded and followed by the same number of non-zero elements.
                Write a function named isHoliow that accepts an integer array and returns 1 If it is a hollow array, otherwise it returns 0.
        The function signature int isHollow(int arr[])

        isHollow({1,2,4,0,0,0,3,4,5}) returns true.
                isHollow ({1,2,0,0,0,3,4,5}) returns false.
                isHollow ({1,2,4,9,0,0,0,3,4,5) returns false
        isHollow ({1,2,0,0,3,4}) returns false

        int arr[]
        int arr[]={1,2,4,0,0,0,3,4,5};
        int arr[]={1,2,0,0,0,3,4,5};
        int arr[]={1,2,4,9,0,0,0,3,4,5};
        int arr[]={1,2,0,0,3,4};*/

        int mid = arr.length / 2;
        int left = 0;
        int rigt = 0;

        for (int v = 0; v < mid; v++) {
            left += 1;
        }
        for (int v = mid + 1; v < arr.length; v++) {
            rigt += 1;

        }

        if (left == rigt) {
            return 1;
        } else {
            return 0;
        }

    }

     int[] removeFromArray() {
        int arr[] = {1, 2, 3, 4};

        int arr2[] = new int[arr.length - 1];
        for (int j = 0; j < arr.length - 1; j++) {
            arr2[j] = arr[j];
        }
        return arr2;
    }

     int[] addToarray() {
        int arr[] = {1, 2, 3, 4, 5};
        int g = 5;
        int toadd[] = {1, 2, 3, 4};
        int ttlen = arr.length + toadd.length;

        int arr2[] = new int[ttlen];
        for (int j = 0, h = 0; j < ttlen; j++, h++) {
            if (j < arr.length) {
                arr2[j] = arr[j];
            }
            if (j == arr.length) {
                h = 0;
            }
            if (h < toadd.length) {
                arr2[j] = toadd[h];
            }


        }
        return arr2;
    }
     int[] sortedArray() {
        int arr[] = {3, 2, 4, 1};

        int sorted[] = new int[arr.length];
        int tem[] = new int[5];
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
//                swap
                tem[j] = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = tem[j];

//                System.out.println("temp"+tem[j]);
            }

            sorted[j] = arr[j];
        }
        return sorted;
    }

      int findString(String arr[], int pos, String n) {


       /* input :["apple","ball","cat","dog"],2,dog returns 1
        input :["aaa","bbb","ccc","ddd","eee"],1,eee returns 3

        String arr[]={"apple","ball","cat","dog"};
        String arr[]={"aaa","bbb","ccc","ddd","eee"};
        int pos =1;
        String n ="eee";
        */

        int out=0;
        for(int d=pos,f=0;d<arr.length;d++,f++){
            if(arr[d]==n){
                out=f;
            }

        }
   return out;
    }
}
