import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Exercitiul 1

        List<String> listaLucrurilor = new ArrayList<>();
        listaLucrurilor.add("Ducem copilul la gradinita");
        listaLucrurilor.add("Plecam la serviciu");
        listaLucrurilor.add("Muncim toata ziua");
        listaLucrurilor.add("Mergem sa luam copilul de la gradinita");
        listaLucrurilor.add("Facem mincare");
        listaLucrurilor.add("Altele");
        System.out.println(listaLucrurilor);

        System.out.println("..................................");

        // Exercitiul 2

        List<String> zileleSaptaminii = new ArrayList<>();
        zileleSaptaminii.add("Luni");
        zileleSaptaminii.add("Marti");
        zileleSaptaminii.add("Miercuri");
        zileleSaptaminii.add("Joi");

        List<String> zileleSaptaminii1 = new ArrayList<>();
        zileleSaptaminii1.add("Vineri");
        zileleSaptaminii1.add("Simbata");
        zileleSaptaminii1.add("Duminica");
        zileleSaptaminii.addAll(zileleSaptaminii1);
        System.out.println(zileleSaptaminii);

        System.out.println("..................................");

        // Exercitiul 3

        List<String> engleza = new ArrayList<>();
        engleza.add("January");
        engleza.add("February");
        engleza.add("March");
        engleza.add("April");
        engleza.add("May");
        engleza.add("June");
        engleza.add("July");
        engleza.add("August");
        engleza.add("September");
        engleza.add("October");

        List<String> roman = new ArrayList<>();
        roman.add("Ianuarie");
        roman.add("Februarie");
        roman.add("Martie");
        roman.add("Aprilie");
        roman.add("Mai");
        roman.add("Iunie");
        roman.add("Iulie");
        roman.add("August");
        roman.add("Septembrie");
        roman.add("Octombrie");

        System.out.println(engleza.get(0) + " - " + roman.get(0));
        System.out.println(engleza.get(1) + " - " + roman.get(1));
        System.out.println(engleza.get(2) + " - " + roman.get(2));
        System.out.println(engleza.get(3) + " - " + roman.get(3));
        System.out.println(engleza.get(4) + " - " + roman.get(4));
        System.out.println(engleza.get(5) + " - " + roman.get(5));
        System.out.println(engleza.get(6) + " - " + roman.get(6));
        System.out.println(engleza.get(7) + " - " + roman.get(7));
        System.out.println(engleza.get(8) + " - " + roman.get(8));
        System.out.println(engleza.get(9) + " - " + roman.get(9));

    }
}