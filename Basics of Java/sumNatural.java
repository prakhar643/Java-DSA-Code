import java.util.*;
public class sumNatural{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the sum of natural number you want");
        int n = sc.nextInt();
        int sum = 0;
        while (i<=n){
             sum += i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}