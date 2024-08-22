package school.management.system;

// This class is responsible for keep the track of students: id, name, grade, fees & paid fees.
public class Student {
    //fields.
    private int id;
    private String name;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    /**
     *
     * Fees for every student $4000 per yr.
     * Fees paid initially is $0.
     * @param id - id of student. Unique value.
     * @param name - name of student. Unique value.
     * @param grade - grade of the student.
     */

    public Student(int id, String name, int grade) { //constructor
        // initializing all the values.
        this.feesPaid = 0;
        this.feesTotal = 4000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    // we're not able to change student's name & id.


    /**
     * Used to upgrade the students grade.
     * @param grade is the new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding fees to feesPaid field | 1000 + 2000 + 1000.
     * Add the fees to feesPaid.
     * The school is going to receive the funds.
     *
     * @param fees the fees that student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees; // keep adding fees.
        School.setTotalMoneyEarned(feesPaid);
    }

    // return all values of student.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }
    // return the remaining fees.
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "- Student's name: "+ name +
                "\n- Total fees paid: $" +feesPaid;
    }
}
