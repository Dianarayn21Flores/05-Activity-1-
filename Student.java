public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    public void Information() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.Information();

        Student studentB = new Student("Dianarayn", 19);
        studentB.Information();

        Student studentC = new Student("Flores", 19);
        studentC.Information();
    }
}


