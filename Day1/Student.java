class Student {
    private String name;
    private double score;

    // Constructor
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for score
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

class StudentAverageCalculator {
    private Student[] students;

    // Constructor
    public StudentAverageCalculator(Student[] students) {
        this.students = students;
    }

    // Getter and Setter for students array
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    // Method to calculate the average score
    public double calculateAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        return students.length > 0 ? sum / students.length : 0;
    }


    public static void main(String[] args) {
        // Creating student objects with name and score
        Student[] students = {
                new Student("Alice", 85),
                new Student("Bob", 90),
                new Student("Charlie", 78),
                new Student("Daisy", 92)
        };

        // Creating a StudentAverageCalculator object
        StudentAverageCalculator calculator = new StudentAverageCalculator(students);

        // Output each student's details
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Score: " + student.getScore());
        }

        // Calculate and print the average score
        double average = calculator.calculateAverage();
        System.out.println("Average score of students: " + average);
    }

}