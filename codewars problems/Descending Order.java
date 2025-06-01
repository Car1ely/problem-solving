//Platform: Codewars
//Problem name: Descending Order
//Difficulty: 7kyu
//Source: https://www.codewars.com/kata/5467e4d82edf8bbf40000155
//Solved: 2025.06.01

public class DescendingOrder {
    public static int sortDesc(final int num) {

        String numStr = String.valueOf(num);  //int to String

        //create an int array to store digits separately
        int[] digits = new int[numStr.length()]; //from Str creating an array of int
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // char to int
        }


        for (int i = 0; i < digits.length; i++) { //current number pretending to be largest
            for (int j = i + 1; j < digits.length; j++) { //every index after i to check if there is larger number
                if (digits[j] > digits[i]) {
                    // swapping values
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }


        int result = 0;
        //multiplies the current number by 10 (to shift the digits to the left), and adds the new digit to the right.
        for (int digit : digits) {
            result = result * 10 + digit;
        }


        return result;
    }
}