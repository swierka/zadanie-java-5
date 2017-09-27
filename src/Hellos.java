import java.util.Scanner;

public class Hellos {
    public static void main(String[] args) {
        Scanner insertName = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Podaj 5 imion");
        names[0] = insertName.nextLine();
        names[1] = insertName.nextLine();
        names[2] = insertName.nextLine();
        names[3] = insertName.nextLine();
        names[4] = insertName.nextLine();

        System.out.println("Cześć " + names[4]);
        System.out.println("Cześć " + names[3]);
        System.out.println("Cześć " + names[2]);
        System.out.println("Cześć " + names[1]);
        System.out.println("Cześć " + names[0]);
    }
}