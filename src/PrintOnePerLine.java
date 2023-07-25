// ****************************************************************************************************************
// PrintOnePerLine.java
//
// Application that reads a string, printing it back to user one character per line.
// ****************************************************************************************************************
import java.util.Scanner;

public class PrintOnePerLine
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome, please enter a string, and this program will print it single " +
                "line by single line:");
        String input = scan.nextLine();
        int nameLength = input.length();

        for (char i = 0; i < nameLength; i++)
        {
            char nameChar = input.charAt(i);
            System.out.println(" - " + nameChar + " - ");
        }
    }
}