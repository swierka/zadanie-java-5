import java.util.Scanner;

public class UkladWspolrzednych {
    public static void main(String[] args) {
        Scanner podajWspolrzedne = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = podajWspolrzedne.nextInt();
        System.out.println("Podaj Y");
        int y = podajWspolrzedne.nextInt();

        System.out.print("Punkt (" + x + ", " + y + ") znajduje się w ");
        if (x >0 && y > 0) {
            System.out.print("I");
        } else if (x <0 && y < 0) {
            System.out.print("III");
        } else if (x < 0 && y > 0) {
            System.out.print("IV");
        } else{
                System.out.print("II");
            }
        System.out.println(" ćwiartce układu współrzędnych.");
        }
    }
