import java.util.*;

public class Priority {
   
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        
        @Override 
        public int compareTo(Student s2){
            // Sorting by rank in ascending order
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // Create a PriorityQueue of Student objects
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 2));

        // Output students according to their ranks
        while(!pq.isEmpty()){
            Student s = pq.poll();  // Remove and return the head of the queue
            System.out.println(s.name + " -> " + s.rank);
        }
    }
}
