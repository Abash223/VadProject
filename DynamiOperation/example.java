import java.util.*;
public class example{
    public static void main(String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the operation you want to perform");
        System.out.println("1.addition/n 2.subtraction/n 3.Multiplication/n 4.Division");
        int choose=input.nextInt();
        if (choose==1)
        { System.out.println("Enter the number");
          int num1=input.nextInt();
          int num2=input.nextInt();
          int num3=num1+num2;
          System.out.println(num3);
        }
        if(choose==2){
            System.out.println("Enter the number");
            int num1=input.nextInt();
          int num2=input.nextInt();
          int num3=num1-num2;
          System.out.println(num3);
        }
        if(choose==3){
            System.out.println("Enter the number");
            int num1=input.nextInt();
          int num2=input.nextInt();
          int num3=num1*num2;
          System.out.println(num3);
        }
        if(choose==4){
            System.out.println("Enter the number");
            int num1=input.nextInt();
          int num2=input.nextInt();
          int num3=num1/num2;
          System.out.println(num3);
        }

    }
}