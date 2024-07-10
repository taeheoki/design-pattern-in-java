package shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student taeheoki = new Student("taeheoki");
        Student poscodx = new Student("poscodx");
        ArrayList<Student> students = new ArrayList<>();
        students.add(taeheoki);
        students.add(poscodx);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
