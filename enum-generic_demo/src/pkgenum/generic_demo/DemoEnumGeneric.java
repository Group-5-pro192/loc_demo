package demoenumgeneric;

// ENUM
enum StudentStatus {
    ACTIVE,
    INACTIVE,
    GRADUATED
}

// Class Student
class Student {

    private String name;
    private StudentStatus status;

    public Student(String name, StudentStatus status) {
        this.name = name;
        this.status = status;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
    }
}

// GENERIC CLASS
class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// Main class
public class DemoEnumGeneric {

    public static void main(String[] args) {

        // 1. T = Student
        Student student = new Student(
                "Nguyen Van A",
                StudentStatus.ACTIVE
        );

        Box<Student> studentBox = new Box<>(student);

        System.out.println("--- STUDENT ---");
        studentBox.getValue().showInfo();

        // 2. T = String
        Box<String> stringBox = new Box<>("Hello Java");

        System.out.println("\n--- STRING ---");
        System.out.println(stringBox.getValue());

        // 3. T = Integer
        Box<Integer> numberBox = new Box<>(100);

        System.out.println("\n--- INTEGER ---");
        System.out.println(numberBox.getValue());
    }
}
