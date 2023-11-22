/*interface IShape {
    public double getArea();
    double getPerimeter();
}

class Rect {
    protected double width, height;
    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
class Rect2 extends Rect implements IShape {
    public Rect2(double width, double height) {
        super(width, height);
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class test {
    public static void main(String[] args) {
        IShape r = new Rect2(10., 20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}*/

/*class Dog implements Cloneable {
    int age;
    String name;
    String breed;
    public Dog(int age,
               String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getBreed() { return breed; }
    public void setBreed(String b) { breed = b; }
    @Override
    public Object clone() throws CloneNotSupportedException {
// 부모 클래스 객체의 복사본을 만들어서 저장
        Dog dog = (Dog) super.clone();
        dog.age = age; // 기본형은 값만 복사
        dog.name = name; // 문자열은 기본형처럼 처리
        dog.breed = breed;
// 그 외 참조형이 있다면 주의해서 복사
        return dog;
    }
}
class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog(2, "js", "Poodle");
        Dog dog2 = (Dog) dog1.clone();
        Dog dog3 = dog1;
    }
}*/

/*abstract class AbstractShape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
class ARectangle extends AbstractShape {
    private double width, height;
    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {return width * height;}
    @Override
    public double getPerimeter() {return 2*(width+height);}
}
class ACircle extends AbstractShape {
    private double radius;
    public ACircle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {return Math.PI * radius;}
    @Override
    public double getPerimeter() {return 2*Math.PI*radius;}
}
class test {
    public static void main(String[] args) {
        AbstractShape[] s = new AbstractShape[2];
        s[0] = new ARectangle(100, 50);
        s[1] = new ACircle(50);
        for(AbstractShape a:s) {
            if (a instanceof ARectangle) {
                ARectangle ar = (ARectangle) a;
                System.out.printf("%s area: %.2f\n", ar.getClass(), ar.getArea());
            } else if (a instanceof ACircle) {
                ACircle ac = (ACircle) a;
                System.out.printf("%s area: %.2f\n", ac.getClass(), ac.getArea());
            }
        }
        for(AbstractShape a:s) {
            System.out.printf("%s area: %.2f\n", a.getClass(), a.getArea());
        }
    }
}*/
/*class ShapeTag {
    private String tag;
    public ShapeTag(String tag) { this.tag = tag; }
    public String getShapeTag() { return tag; }
    @Override
    public String toString() {
        return "#" + tag;
    }
}
class RectangleTag extends ShapeTag {
    private String rectangleTag;
    public RectangleTag(String tag,
                        String rectangleTag) {
        super(tag);
        this.rectangleTag = rectangleTag;
    }
    public String getRectangleTag() {
        return rectangleTag;
    }
    @Override
    public String toString() {
        return "#" + rectangleTag + " " + super.toString();
    }
}
class CircleTag extends ShapeTag {
    private String circleTag;
    public CircleTag(String tag, String circleTag) {
        super(tag);
        this.circleTag = circleTag;
    }
    public String getCircleTag() { return circleTag; }
    @Override
    public String toString() {
        return "#" + circleTag + " " + super.toString();
    }
}
class test {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        System.out.println("Shape1 Tag: " + s1);
        ShapeTag s2 = new ShapeTag("shape2");
        System.out.println("Shape2 Tag: " + s2);
        RectangleTag r = new RectangleTag("shape", "rectangle");
        System.out.println("Rectangle Tags: " + r);
        CircleTag c = new CircleTag("shape", "circle");
        System.out.println("Circle Tags: " + c);
    }
}*/
/*abstract class Hello {
    private String toWhom;
    public Hello(String whom) {toWhom = whom;}
    public String getWhom() {return toWhom;}
    public abstract void sayHello();
}
class F extends Hello {
    public F(String towhom) {super(towhom);}
    @Override
    public void sayHello() {System.out.println("Bonjour " + getWhom());}
}
class S extends Hello {
    public S(String towhom) {super(towhom);}
    @Override
    public void sayHello() {System.out.println("Hola a todos " + getWhom());}
}
class K extends Hello {
    public K(String towhom) {super(towhom);}
    @Override
    public void sayHello() {System.out.println("안녕하세요 " + getWhom());}
}
class test {
    public static void main(String[] args) {
        Hello[] arr = new Hello[3];
        arr[0] = new F("js1");
        arr[1] = new S("js2");
        arr[2] = new K("js3");
        for(Hello h:arr) {h.sayHello();}
    }
}*/

abstract class Printer {
    String model;
    int printedCount = 0;
    int availableCount;
    abstract boolean print();
}

class InkjetPrinter extends Printer {
    String model;
    int printedCount = 0;
    int availableCount;
    public InkjetPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }
    public boolean print() {
        if (availableCount != 0) {
            printedCount++;
            availableCount--;
            return true;
        } else {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n",model, printedCount+1);
            return false;
        }
    }
}
class LaserPrinter extends Printer {
    String model;
    int printedCount = 0;
    int availableCount;
    public LaserPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }
    public boolean print() {
        if (availableCount != 0) {
            printedCount++;
            availableCount--;
            return true;
        } else {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n",model, printedCount+1);
            return false;
        }
    }
}
public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}