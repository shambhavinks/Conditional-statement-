import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n = input.nextInt();
        //Checking the divisibilty of 5//
        if(n%5 == 0){
            System.out.println("It is divisible by 5");
        }
        else{
            System.out.println("It is not divisible by 5");
        }
        //Checking the divisibility of 3//
        if(n%3 == 0){
            System.out.println("It is divisible by 3");
        }
        else{
            System.out.println("It is not divisible by 3");
        }

    }
}
