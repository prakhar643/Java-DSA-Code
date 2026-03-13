import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        System.out.println("Hello World");
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = c+d;
        System.out.println(sum);

        sc.close();
    }
}