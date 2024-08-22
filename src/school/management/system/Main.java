package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher anastassia = new Teacher(1, "Anastassia", 500);
        Teacher alice = new Teacher(2, "Alice", 500);
        Teacher ryan = new Teacher(3, "Ryan", 300);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(anastassia);
        teacherList.add(alice);
        teacherList.add(ryan);

        Student oleksii = new Student(1, "Oleksii", 11);
        Student aleksander = new Student(2, "Aleksander", 12);
        Student gosling = new Student(3,"Gosling", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(oleksii);
        studentList.add(aleksander);
        studentList.add(gosling);

        School shs = new School (teacherList, studentList);


        oleksii.payFees(4000);
        aleksander.payFees(3000);
        System.out.println("School Account Statistics:");
        System.out.println("- Sokrad Secondary School has earned: $"+ shs.getTotalMoneyEarned());
        anastassia.recieveSalary(anastassia.getSalary());
        System.out.println("- SHS has spend for salary to " + anastassia.getName() + " $" + shs.getTotalMoneyEarned());
        System.out.println("Oleksii Account Statistics:");
        System.out.println(oleksii);
    }
}
