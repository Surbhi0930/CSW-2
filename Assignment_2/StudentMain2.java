
class Student2 implements Comparable<Student2> {
    private String name;
    private int rn;
    private int totalMark;

    public Student2(String name, int rn, int totalMark) {
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
    public int compareTo(Student2 other) {
        return Integer.compare(this.rn, other.rn);
    }

    public static void bubbleSort(Student2[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student2 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class StudentMain2 {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2("Alice", 103, 85),
                new Student2("Bob", 102, 90),
                new Student2("Charlie", 105, 75),
                new Student2("David", 101, 80)
        };

        Student2.bubbleSort(students);

        System.out.println("Sorted Array of Students by Roll Number (rn):");
        for (Student2 student : students) {
            System.out.println("Name: " + student.getName() +  ", Roll Number: " + student.getRn() + ", Total Marks: " + student.getTotalMark());
        }
    }
}
