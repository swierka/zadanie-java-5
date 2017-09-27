import java.util.Scanner;

public class PodzielnaPrzezTrzy {

    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = guess.nextInt();

        while (number < 100 || number > 200 || (number >= 100 && number <= 200 && number % 3 != 0)) {
            if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number >= 100 && number <= 200 && number % 3 != 0) {
                System.out.println("Towja liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Towja liczba jest za duża");
            }

            System.out.println("Podaj liczbę");
            guess.nextInt();
        }
        System.out.println("Twoja liczba jest ok");
        guess.close();
    }
}

