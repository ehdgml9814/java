/*class Parent {
    private String name;
    public Parent(String n) {
        System.out.println("Parent constructor");
        name = n;
    }
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}
class Child extends Parent {
    private int value;
    public Child(String n, int v) {
        super(n); // Parent(String n) 호출
        System.out.println("Child constructor");
        value = v;
    }
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}*/
/*class CoffeeBean {
    private String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    protected void setSpecies(String s) {
        species = s;
    }
    public String getSpecies() {return species;}
}
class Robusta extends CoffeeBean {
    @Override
    void print() {
        System.out.println("Robusta coffee...");
    }
    void print(String s) {
        System.out.printf("%s: %s\n", getSpecies(), s);
    }
}*/
/*class Turtle {
    private int limbs = 4;
    protected String food;
    public void setFood(String f) { this.food = f; }
    public void eat() {
        System.out.println("Turtle eats " + food);
    }
    public int getLimbs() {return limbs;}
}
class SeaTurtle extends Turtle {
    public void swim() {
        System.out.println("A sea turtle swims...");
    }
}
class LandTurtle extends Turtle {
    public void walk() {
        System.out.println("A land turtle walks...");
    }
}*/
/*class Point {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    @Override
    public String toString() {
        String msg = "(" + x + ", " + y + ")";
        return msg;
    }
}
class Circle {
    private double radius;
    private Point point;
    public Circle(){}
    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }
    public Circle(int x, int y, double radius) {
        point = new Point(x, y);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public int getX() {return point.getX();}
    public int getY() {return point.getY();}
}*/
class Course {
    private String code;
    private String name;
    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() {return code;}
    public String getName() {return name;}
}
class OnlineCourse extends Course {
    private String code;
    private String name;
    public OnlineCourse(String code, String name) {
        super(code, name);
        this.code = code;
        this.name = name;
    }
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}
class OfflineCourse extends Course {
    private String code;
    private String name;
    public OfflineCourse(String code, String name) {
        super(code, name);
        this.code = code;
        this.name = name;
    }
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}
public class homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}

