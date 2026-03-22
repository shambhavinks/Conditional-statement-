import java.util.Scanner;

public class NumType {
    public static void main(String[] args) {
        //A rpogram to check weather the number is negative or positive//
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        if(num<0){
            System.out.println("NEGATIVE");
        }
        else if (num>0) {
            System.out.println("POSITIVE");
            
        }
        else{
            System.out.println("ZERO");
        }
             

    }
}
