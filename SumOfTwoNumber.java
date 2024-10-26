import java.util.Scanner;

public class SumOfTwoNumber {
    public static int Sum(int n, int m){
        return n+m;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the second Number: ");
        int Num2 = input.nextInt();
        int Sum = Sum(Num1, Num2);
        System.out.println("The Sum: " + Sum);
        input.close();
    }
}
