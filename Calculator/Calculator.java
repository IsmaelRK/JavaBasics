package Calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = scan.nextInt();

        System.out.print("The number is: " + num);

        itsNotAmain();

    }

    public static void itsNotAmain(){

        System.out.print("\nAnother Main o_o");

    }

}