package school.management.system;
    //This class is responsible for keep the track of school: teachers, students, money spend & earn.
    //The school can have many teachers, students.


import java.util.List;

public class School {
        /**
         * Implements teachers and students using array list[].
         */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    /**
     * new school object is created.
     * @param teachers - list of teachers in the school.
     * @param students - list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpend = 0;
    }
    // returns the list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }
    // adds teacher to the school
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    // return the list of students in the school.
    public List<Student> getStudents() {
        return students;
    }
    // adds student to the school
    public void setStudents(Student student) {
        students.add(student);
    }
    // return total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // adds total money earned by the school.
    public static void setTotalMoneyEarned(int MoneyEarned) { // static
        totalMoneyEarned += MoneyEarned;
    }
    // return total money spend.
    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }
    // update total money spend by the school ( salary of the teachers ).
    public static void setTotalMoneySpend(int moneySpent) {
        // totalMoneyEarned = totalMoneyEarned - moneySpent;
        totalMoneyEarned -= moneySpent;
    }
}
