import java.util.Scanner;

public class Hellos {
    public static void main(String[] args) {
        Scanner insertName = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Podaj 5 imion");

        for (int i = 0; i < names.length; i++) {
            names[i] = insertName.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            int kolejnosc = names.length - i - 1;
            System.out.println("Cześć " + names[kolejnosc]);
        }
    }
}