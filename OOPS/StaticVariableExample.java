public class StaticVariableExample {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolname = "JMV";
        Student s2 = new Student();
        System.out.println(s2.schoolname);
    }
}

class Student {
    String name;
    int rollno;
    static String schoolname;
    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
}