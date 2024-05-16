
class Student1 implements Comparable<Student1> {
    private String name;
    private int rn;
    private int totalMark;

    public Student1(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student1 other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }

    public static Student1 linearSearch(Student1[] students, int rn) {
        for (Student1 student : students) {
            if (student.getRn() == rn) {
                return student;
            }
        }
        return null; 
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student1[] students = {
                new Student1("Alice", 101, 85),
                new Student1("Bob", 102, 90),
                new Student1("Charlie", 103, 75),
        };

        int searchRollNumber = 102;
        Student1 foundStudent = Student1.linearSearch(students, searchRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.getName() + ", Roll Number: " + foundStudent.getRn() +  ", Total Marks: " + foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number " + searchRollNumber + " not found.");
        }
    }
}
