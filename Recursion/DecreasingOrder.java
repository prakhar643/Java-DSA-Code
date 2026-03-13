package Recursion;
public class DecreasingOrder{
    public static void Decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        Decreasing(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        Decreasing(n);
    }
}