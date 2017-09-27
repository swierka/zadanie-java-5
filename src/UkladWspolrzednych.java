import java.util.Scanner;

public class UkladWspolrzednych {
    public static void main(String[] args) {
        Scanner podajWspolrzedne = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = podajWspolrzedne.nextInt();
        System.out.println("Podaj Y");
        int y = podajWspolrzedne.nextInt();


        if (x >0 && y > 0) {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w I ćwiartce układu współrzędnych.");
        } else if (x <0 && y < 0) {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w III ćwiartce układu współrzędnych.");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt (" + x + ", " + y + ") znajduje się w IV ćwiartce układu współrzędnych.");
        } else{
                System.out.println("Punkt (" + x + ", " + y + ") znajduje się w II ćwiartce układu współrzędnych.");
            }
        }
    }
