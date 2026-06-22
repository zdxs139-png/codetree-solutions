import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        Double num3 = sc.nextDouble();

        System.out.printf("%.3f\n%.3f\n%.3f\n", num1 , num2, num3);    
    }
}