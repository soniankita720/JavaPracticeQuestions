public class ClassesAndObjectsExample {
    public static void main(String args[]) {
        Pen p = new Pen();
        p.setColor("pink");
        System.out.println(p.color);
        p.setTip(3);
        System.out.println(p.tip);
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}