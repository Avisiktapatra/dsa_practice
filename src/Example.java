
import java.util.*;

    public class Example {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            PriorityQueue<Student> pq = new
                    PriorityQueue<Student>(5, new StudentComparator());

            Student student1 = new Student("Nandini", 3.2);

            pq.add(student1);
            Student student2 = new Student("Anmol", 3.6);
            pq.add(student2);
            Student student3 = new Student("Palak", 4.0);
            pq.add(student3);
            Student student4 = new Student("vivian", 12.0);
            pq.add(student4);
            Student student5 = new Student("hedge", 2.0);
            pq.add(student5);

            System.out.println("Students served in their priority order");

            while (!pq.isEmpty()) {
                System.out.println(pq.poll().getName());
            }
        }
    }

    class StudentComparator implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            if (s1.cgpa > s2.cgpa)
                return -1;
            else if (s1.cgpa < s2.cgpa)
                return 1;
            return 0;
        }
    }

    class Student {
        public String name;
        public double cgpa;

        // A parameterized student constructor
        public Student(String name, double cgpa) {

            this.name = name;
            this.cgpa = cgpa;
        }

        public String getName() {
            return name;
        }
    }

