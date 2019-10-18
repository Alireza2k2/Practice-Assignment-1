public class Problem3{

    static int n = 1;
    static int SumOfSquares = 0;
    static int SquareOfSum = 0;
    static int Sum = 0;
    static int answer = 0;

    public static void main(){
        while(n<=100){
            SumOfSquares = SumOfSquares + (n*n);
            n++;
        }
        n = 1;
        while(n<=100){
            Sum = Sum+n; 
            n++;
        }
        SquareOfSum = (int) (Sum*Sum);
        answer = SquareOfSum - SumOfSquares;
        System.out.println(SquareOfSum + " - " + SumOfSquares + " = " + answer);

    }
}