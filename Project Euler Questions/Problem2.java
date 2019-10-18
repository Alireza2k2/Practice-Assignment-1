public class Problem2{

    static int n = 1;
    static int n1 = 2;
    static int n2 = 3;
    static int total = 2;
    public static void main(){

        while(n2<4000000){

            n2 = n + n1;
            if(n2%2 == 0){
                total = total + n2;
            }

            n = n1;
            n1 = n2;

        }

        System.out.println("Answer :" + total);
    }   
}