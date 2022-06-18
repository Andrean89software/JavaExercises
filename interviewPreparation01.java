import java.util.Scanner;


public class interviewPreparation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip(("(\r\n|[\n\r\u2028\u2029\u0085])?"));

        if (n % 2 == 1 || n % 2 == 0 && n >= 6 && n <= 20) {

            System.out.println("Weird");
        } else if (n % 2 == 0 && n == 2 || n == 4 || n == 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n > 20 && n <= 100) {
            System.out.println("Not Weird");
        }


        scanner.close();
    }


}
