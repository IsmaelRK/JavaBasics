package Learning;

import java.util.Date;

public class fundamentos {



    public static void main(String[] args) {

        int inteiro = 16;
        double flutuante = 3.1415;
        char caracter = 'I';
        boolean falso = false;

        System.out.println(inteiro);
        System.out.println(falso);

        time();
    }

    public static void time() {

        Date data = new Date();
        System.out.println(data.toString());

    }



}
