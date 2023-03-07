public class ConstructorExample { 
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Ankita");
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int rollno;
    Student() {
        System.out.println("Constructor is called");
    }
    Student(String name) {
        this.name = name;
    }
}