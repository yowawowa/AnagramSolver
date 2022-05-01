import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ask for two words
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter second word: ");
        String s2 = scanner.nextLine();
//      For ease of testing
//        String s1 = "flow";
//        String s2 = "wolf";

        //Check length of words
        if (s2.length() != s1.length()) {
            System.out.println("Words not equal in length, hence not anagram!");
            System.exit(0);
        }
        //Check letter frequency in each word
        //Create int array for each string frequency
        int[] freqOfFirstString = new int[s1.length()];
        int[] freqOfSecondString = new int[s2.length()];
        //Create char array of each string
        char[] charArray1 = s1.toCharArray();
        Arrays.sort(charArray1);
        for (int i = 0; i < s1.length(); i++) {
            freqOfFirstString[i] = 1;
            for (int j = i + 1; j < s1.length(); j++) {
                if (charArray1[i] == charArray1[j]) {
                    freqOfFirstString[i]++;
                    //Set charArray1[j] to 0 to avoid printing visited character
                    charArray1[j] = '0';
                }
            }
        }
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray2);
        for (int i = 0; i < s2.length(); i++) {
            freqOfSecondString[i] = 1;
            for (int j = i + 1; j < s2.length(); j++) {
                if (charArray2[i] == charArray2[j]) {
                    freqOfSecondString[i]++;
                    //Set charArray2[j] to 0 to avoid printing visited character
                    charArray2[j] = '0';
                }
            }
        }
        //Compare result arrays
        System.out.println(Arrays.toString(freqOfFirstString));
        System.out.println(Arrays.toString(freqOfSecondString));
        if (Arrays.equals(freqOfFirstString, freqOfSecondString)) {
            System.out.println("These words are anagram!");
        } else {
            System.out.println("Not anagram enough!");
        }



        //Print result
//        System.out.println("Characters and their corresponding frequencies");
//        for (int i = 0; i < freqOfFirstString.length; i++) {
//            if (charArray1[i] != ' ' && charArray1[i] != '0')
//                System.out.println(charArray1[i] + "-" + freqOfFirstString[i]);
//        }
//        for (int i = 0; i < freqOfSecondString.length; i++) {
//            if (charArray2[i] != ' ' && charArray2[i] != '0')
//                System.out.println(charArray2[i] + "-" + freqOfSecondString[i]);
//
//
//        }
    }
}

