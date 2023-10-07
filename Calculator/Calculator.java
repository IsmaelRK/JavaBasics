package Calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = new int[2];



        for (int i = 0; i < 2; i++)
        {
            System.out.print("\nEnter With a Number: ");
            num[i] = scan.nextInt();

        }


        System.out.print("\nThe numbers are: " + num[0] + "And" + num[1]);

        int opt;
        System.out.print("\n[1] Sum");
        System.out.print("\n[2] Sub");
        System.out.print("\nEnter the Option: ");
        opt = scan.nextInt();

        int response = calc(opt, num[0], num[1]);
        System.out.print("\nYour Result: " + response);

    }

    public static int calc(int opt, int n, int n2){

        if (opt == 1)
        {
            return n + n2;
        }

        else if (opt == 2)
        {
            return n - n2;
        }


        System.out.print("\nSomething Went Wrong!");
        return 0;
    }

}