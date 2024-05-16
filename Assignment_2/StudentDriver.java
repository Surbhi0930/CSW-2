
class Student<T> {
    private String name;
    private T rollNumber; 
    private int age;

    public Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Student<String> student1 = new Student<>("Alice", "S123", 20);
        Student<Integer> student2 = new Student<>("Bob", 456, 21);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}
