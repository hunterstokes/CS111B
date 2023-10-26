import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        System.out.print(userNum / divNum + " ");
        System.out.print(userNum / divNum / divNum + " ");
        System.out.println(userNum / divNum / divNum / divNum);
    }
}