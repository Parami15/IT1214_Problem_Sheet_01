public class Main5 {
    public static void main(String[] args) {
        try {
            Student student = new Student("John", 75, 110, 90); // invalid score: 110
            System.out.println("Student: " + student.getName());
            System.out.printf("Average: %.2f\n", student.calculateAverage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
