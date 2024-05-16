
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ArrayListUser {
    private ArrayList<User> userList;

    public ArrayListUser() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void printUsers() {
        System.out.println("List of Users:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

    public void sortUsersByAge() {
        Collections.sort(userList, Comparator.comparingInt(User::getAge));
    }
}

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();

        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 30));
        arrayListUser.addUser(new User("Charlie", 20));

        arrayListUser.printUsers();

        arrayListUser.sortUsersByAge();

        System.out.println("\nSorted List of Users by Age:");
        arrayListUser.printUsers();
    }
}

