import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        //Checking weather a number is odd or even//
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        if(n%2 == 0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
    }
}
