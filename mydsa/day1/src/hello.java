import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
//        1. Write a program to print whether a number is even or odd, also take
//        input from the user.
//        2. Take name as input and print a greeting message for that particular name.
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.
//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
//        5. Take 2 numbers as input and print the largest number.
//        6. Input currency in rupees and output in USD.
//        7. To calculate Fibonacci Series up to n numbers.
//        8. To find out whether the given String is Palindrome or not.
//        9. To find Armstrong Number between two given number.
        Scanner sc = new Scanner(System.in);
        // program one
        System.out.print("Enter the number to check whether it's even or odd:");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("The Number is even");
        }
        else if(a==0) {
            System.out.println("The number is 0");

        }else {
            System.out.println("the number is odd");
        }

        //question 8 to find out whether the string is palindrome or not
        System.out.print("Enter a string to check if it's palindrome or not");
        String x = sc.nextLine();
        for (int i = 0;i< x.length()/2;i++){
            if (x.charAt(i)==x.charAt(x.length()-1-i)){
                continue;
            }else{
                System.out.print("The string is not palindrome");
                break;

            }


        }




    }
}
