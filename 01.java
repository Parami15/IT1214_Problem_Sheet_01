public class Student {
    private int studentId;
    private String name;
    private int daysAttended;

    public Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getDaysAttended() { return daysAttended; }

    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setName(String name) { this.name = name; }
    public void setDaysAttended(int daysAttended) { this.daysAttended = daysAttended; }

    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended;
    }
}

public class Classroom {
    private Student[] students = new Student[10];
    private int count = 0;

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        } else {
            System.out.println("Classroom is full.");
        }
    }

    public void updateAttendance(int id, int newDays) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == id) {
                students[i].setDaysAttended(newDays);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student ID " + id + " not found.");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent(new Student(101, "Alice Smith", 12));
        classroom.addStudent(new Student(102, "Bob Jones", 15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.updateAttendance(102, 16);
        classroom.updateAttendance(104, 5); // Not found

        classroom.displayStudents();
    }
}



