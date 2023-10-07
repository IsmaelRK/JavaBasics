package Calculator;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int num;


        for (int i = 0; i < 2; i++)
        {
            System.out.print("\nEnter With a Number: ");
            num = scan.nextInt();
            numbers.add(num);
        }



        int opt;
        System.out.print("\n[1] Sum");
        System.out.print("\n[2] Sub");
        System.out.print("\nEnter the Option: ");
        opt = scan.nextInt();

        int response = calc(opt, numbers);

        if (response != Integer.MIN_VALUE)
        {
            System.out.print("\nYour Result: " + response);
        }

        scan.close();

    }

    public static int calc(int opt, ArrayList<Integer> nums){

        int result;

        if (opt == 1)
        {
            result = nums.get(0) + nums.get(1);
        }

        else if (opt == 2)
        {
            result = nums.get(0) - nums.get(1);
        }
        else
        {
            System.out.println("Invalid Option!");
            result = Integer.MIN_VALUE;
        }


        return result;
    }

}