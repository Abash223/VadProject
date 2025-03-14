import java.util.*;
public class example{
    public void add(int a,int b){
        int c =a+b;
        System.out.println(c);
    }
    public void add(int x,int y ,int u){
        int z=x+y+u;
        System.out.println(z);
    }
    public static void main(String args[]){
        example o=new example();
        o.add(1,3);
        o.add(12,34,56);
    }
}