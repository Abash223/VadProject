import java.util.*;
public class example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sum");
        int n=input.nextInt();
        int sum = 0;
        System.out.println("Enter the number");
        int num[]=new int[n+1];
        int i = 1;
        while(i<=n){
            num[i] = input.nextInt();
            i++;
        }
        int j = 1;
        while(j<=n){
            sum = sum + num[i-1];
            j++;
        }
    System.out.println("The total sum of" + n +"number is"+sum);
    }

}
