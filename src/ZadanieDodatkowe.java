import java.util.Scanner;

public class ZadanieDodatkowe {

    public static void main(String[] args) {

        Scanner dataFromUser = new Scanner(System.in);
        int[][] twoDimensions = new int[3][3];

        System.out.println("Podaj 9 liczb całkowitych");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDimensions[i][j] = dataFromUser.nextInt();
            }
        }

        int sum1 = twoDimensions[0][0] + twoDimensions[0][1] + twoDimensions[0][2];
        int sum2 = twoDimensions[1][0] + twoDimensions[1][1] + twoDimensions[1][2];
        int sum3 = twoDimensions[2][0] + twoDimensions[2][1] + twoDimensions[2][2];

        int max = Math.max(Math.max(sum1, sum2), sum3);

        int sum = 0;
        if (max == sum1) {
            sum = 1;
        } else if (max == sum2) {
            sum = 2;
        } else {
            sum = 3;
        }

        System.out.println("Największa suma liczb jest w wierszu " + sum + " i wynosi " + max + ".");

    }

}
