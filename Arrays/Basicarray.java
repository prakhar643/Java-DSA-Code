

public class Basicarray {

    public static void update(int marks[]){
        for (int i =0; i <marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {55,66,77,88};
        // int number[] = {1,2,3};
        // String fruits[] = {"apple","Prakhar"};
        // System.out.println(marks[0]);
        // System.out.println(number[0]);
        // System.out.println(fruits[0]);
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // System.out.println("Physics marks " + marks[0]);
        // sc.close();
        update(marks);
    }
}