
import java.util.Scanner;

public class StringInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter you name");
        do {
            name = sc.nextLine();
            String[] nameParts = name.split(" ", 0);
            for (String string : nameParts) {
                System.out.print(string.charAt(0));
            }
            System.out.println("");
        } while (!name.equals("exit"));
        sc.close();
    }
}
