
class Student {

    public int RollNo;
    public String Name;
    public String courses;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double averages() {
        return (float) total() / 3;
    }

    public String grade() {
        if (averages() > 75) {
            return "A";
        } else {
            return "B";
        }
    }

    public String DataPrint() {
        return "Roll No : " + RollNo + "\n" + "Name : " + Name + "\n" + "Course : " + courses + "\n" + "Total Marks : " + total() + "\n" + "Distinct With Grade : " + grade() + "\n";
    }

}

public class StudentTest {

    public static void main(String[] args) {
        Student s=new Student();
        s.RollNo=18;
        s.Name="Bhuvan";
        s.courses="CS";
        s.m1=85;
        s.m2=75;
        s.m3=60;
        System.out.println("Marksheet \n"+s.DataPrint());
    }
}
