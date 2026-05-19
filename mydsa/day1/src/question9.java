import java.util.Scanner;

public class question9 {

    public static void main(String[] args) {
        // to find the armstrong number bw two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int x = count(num);
        boolean y = isArmstrong(num,x);
        if (y){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("The number is not an armstrong number");
        }




    }
    public static int count (int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;


    }


    public static boolean isArmstrong(int num, int count) {
        int originalNum = num; // Keep a copy of the original number
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            // Just add the powered digit directly to the sum
            sum += (int) Math.pow(rem, count);
            num /= 10;
        }

        // Compare the accumulated sum to the original number
        return sum == originalNum;
    }
}
