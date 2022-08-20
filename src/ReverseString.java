import java.io.*;
import java.util.Scanner;

class ReverseString
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str= sc.nextLine();
        String nstr="";
        char ch;
        System.out.println("Original word: " +str);
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

