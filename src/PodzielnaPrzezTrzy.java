import java.util.Scanner;

public class PodzielnaPrzezTrzy {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int numberIns = guess.nextInt();

        for (int number = numberIns; ; ) {

            while (number >= 100 && number <= 200) {
                if (number % 3 != 0) {
                    System.out.println("Towja liczba nie jest podzielna przez 3");
                } else {
                    System.out.println("Twoja liczba jest ok");
                    break;
                }
            }

            while (number < 100 || number > 200) {
                if (number > 200) {
                    System.out.println("Twoja liczba jest za duża");
                } else {
                    System.out.println("Twoja liczba jest za mała");
                }

                System.out.println("Podaj liczbę");
                guess.nextInt();

            }
            guess.close();
        }
    }
}



