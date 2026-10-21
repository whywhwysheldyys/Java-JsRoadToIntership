package second_practice.oop02.encapsulaiton.practice;

public class Student {
    private String fullname;
    private int course;
    private double gpa;

    public Student(String fullname, int course, double gpa) {
        this.fullname = fullname;
        setCourse(course);
        setGpa(gpa);
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1 || course > 6) {
            System.out.println("Введите корректный курс!");
        } else {
            this.course = course;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 5.0) {
            System.out.println("Введите корректный средний балл!");
        } else {
            this.gpa = gpa;
        }
    }

    @Override
    public String toString() {
        return "Полное имя студента: " + fullname + "\n"
                + "Курс: " + course + "\n"
                + "Средний балл: " + gpa;
    }
}