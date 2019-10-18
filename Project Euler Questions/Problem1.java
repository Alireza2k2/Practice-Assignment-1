import java.util.Scanner;

public class Problem1{

    static int n = 0;
    static int total = 0;

    public static void main(){
        while(n<1000){
            if(n%3 == 0 || n%5 == 0){
                total = total + n;  
            }
            n++;
        }
        System.out.println("Answer :" + total);

    }
}