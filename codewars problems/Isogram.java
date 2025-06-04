//Platform: Codewars
//Problem name: Isograms
//Difficulty: 7kyu
//Source: https://www.codewars.com/kata/54ba84be607a92aa900000f1
//Solved: 2025.06.04

public class isogram {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase(); // ignore case
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return false; // if letter used more than 1 time
            }
        }
        return true; // is isogram!
    }
}