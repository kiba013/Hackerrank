/*
 Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
 */
import java.io.*;
import java.util.*;

public class outputformat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String myStr = scanner.next();
            int myInt = scanner.nextInt();
            System.out.printf("%-14s %03d\n", myStr, myInt);
        }
        System.out.println("================================");
    }
}
