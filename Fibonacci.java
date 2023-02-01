public class Fibonacci {
    public static void main(String[] args){
        double i = 1, n = 100, firstItem = 0, secondItem = 1;
        while(i <= n){
            System.out.print(Math.round(firstItem) + "," );
            double nextItem= firstItem + secondItem;
            firstItem = secondItem;
            secondItem = nextItem;

            i++;
        }
    }
}
