import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileCharCount {
    public static void main(String[] args) {
        char charToCount = 'c';
        int count = 0;
        if (args.length > 1) {
            System.out.println("Please enter one paramater only");
            System.exit(1);
        } else if (args.length == 1) {
            if (args[0].length() == 1) {
                charToCount = args[0].charAt(0);
            } else {
                System.out.println("the parmater length can't be longer than one character");
                System.exit(2);
            }
        } else if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the character to count : ");
            charToCount = sc.nextLine().charAt(0);
            sc.close();
        }

        try {
            File myObj = new File("sample1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for (char ch : data.toCharArray()) {
                    if (ch == charToCount)  count++;
                }
            }
            System.out.println("the number of times character " + charToCount + " appears in the file is " + count);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
