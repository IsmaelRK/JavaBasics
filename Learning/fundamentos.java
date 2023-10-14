package Learning;

import java.util.Date;
import java.util.Locale;

import java

public class fundamentos {



    public static void main(String[] args) {

        int inteiro = 16;
        double flutuante = 3.1415;
        char caracter = 'I';
        boolean falso = false;

        System.out.println(inteiro);
        System.out.println(falso);

        time();
        locale();
    }

    public static void time() {

        Date data = new Date();
        System.out.println("Its -> " + data.toString());

    }

    public static void locale() {
        Locale deafult = Locale.getDefault();
        System.out.println("Sys Langauge -> " + deafult);

        String lang = deafult.getLanguage();
        System.out.println("Sys Langauge -> " + lang);
    }



}
