package List;

public class StudentRecord {
    public String name;
    public String surname;
    public int studentNo;
    public float averageMark;

    @Override
    public String toString() {
        return "Surname: " + this.surname + "\n" + "Name: " + this.name + "\n" + "Student Number: "
                + this.studentNo + "\n" + "Average mark: " + this.averageMark + "\n";
    }
    public StudentRecord(String surname, String name, int studentNo, float averageMark) {
        this.name = name;
        this.surname = surname;
        this.studentNo = studentNo;
        this.averageMark = averageMark;
    }
    public StudentRecord(String surname, String name, int studentNo) {
        this.name = name;
        this.surname = surname;
        this.studentNo = studentNo;
        this.averageMark = 0;
    }

    public StudentRecord() {
        this.name = null;
        this.surname = null;
        this.studentNo = 0;
        this.averageMark = 0;}
}
