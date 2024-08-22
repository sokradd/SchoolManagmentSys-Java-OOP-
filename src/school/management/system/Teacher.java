package school.management.system;
// This class is responsible for keep the track of teachers: id, name, salary .
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a teacher object;
     * @param id - id of the teacher.
     * @param name - name of the teacher.
     * @param salary - salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }
    // returns the all values.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    // set the salary.
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // adds to the salaryEarned.
    // removes from total money earned by SHS.
    public void recieveSalary(int salary) {
    salaryEarned += salary;
    School.setTotalMoneySpend(salary);
    }
}

