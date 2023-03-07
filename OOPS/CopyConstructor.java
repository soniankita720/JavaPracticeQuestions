public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ankita";
        s1.rollno = 123;
        System.out.println(s1.name + " " + s1.rollno);
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.rollno);
    }
}

class Student {
    String name;
    int rollno;
    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
    }
    Student(String name) {
        this.name = name;
    }
    Student(int rollno) {
        this.rollno = rollno;
    }
    Student() {
        System.out.println("Constructor is called");
    }
}