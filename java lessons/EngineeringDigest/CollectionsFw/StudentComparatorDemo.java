package CollectionsFw;

import java.util.*;

// 4 fi, 3 si
// 3 - 4
//fi - when -ve is returned
class StudentsGpaComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getGpa() - o1.getGpa();
    }
}

class Student implements Comparable<Student>{
    public String name;
    public int gpa;

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class StudentComparatorDemo {
    public static void main(String[] args) {
        Student a = new Student("Atul", 3);
        Student b = new Student("Anupam", 4);
        Student c = new Student("Gaurav", 2);
        Student d = new Student("Animesh", 2);

        List<Student> students = new ArrayList<>(Arrays.asList(a,b,c,d));
        // here the sorting is based on natural ordering but there Students aren't ordered
        //To make students ordered we have to implement Comparable - compareTo the Student class as
        students.sort(null);
        System.out.println(students);
        students.sort(new StudentsGpaComparator());
        System.out.println(students);

        // Using Comparator we have to implement comparable in Student class
        Comparator<Student> gpaCompare = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort(gpaCompare);
//        System.out.println(students);
//
        //We can use Collections utility
        Collections.sort(students,gpaCompare);
        System.out.println(students);


    }
}
