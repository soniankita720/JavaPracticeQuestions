public class ShallowCopyExample {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ankita";
        s1.rollno = 123;
        s1.arr[0] = 91;
        s1.arr[1] = 92;
        s1.arr[2] = 93;
        System.out.println(s1.name + " " + s1.rollno);
        for(int i=0;i<3;i++) {
            System.out.println(s1.arr[i]);
        }
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.rollno);
        s1.arr[2] = 100;
        for(int i=0;i<3;i++) {
            System.out.println(s2.arr[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    int arr[];
    Student(Student s1) {
        arr = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.arr = s1.arr;
    }
    Student(String name) {
        arr = new int[3];
        this.name = name;
    }
    Student(int rollno) {
        arr = new int[3];
        this.rollno = rollno;
    }
    Student() {
        arr = new int[3];
        System.out.println("Constructor is called");
    }
}