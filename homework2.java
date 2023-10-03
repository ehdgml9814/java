import java.util.Scanner;
class Student {
    int stunum;
    String name;
    String major;
    int stutel;
    int getNum() {return stunum;}
    void setNum(int stunum) {
        this.stunum = stunum;
    }
    String getName() {return name;}
    void setName(String name) {
        this.name = name;
    }
    String getMajor() {return major;}
    void setMajor(String major) {
        this.major = major;
    }
    int getTel() {return stutel;}
    void setTel(int stutel) {
        this.stutel = stutel;
    }
}

public class homework2 {
    public static void main(String[] args) {
        Scanner stu = new Scanner(System.in);
        Student[] students = new Student[3];
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        int stunum = Integer.parseInt(stu.next());
        String name = stu.next();
        String major = stu.next();
        int stutel = Integer.parseInt(stu.next());
        Student stu1 = new Student();
        stu1.setNum(stunum);
        stu1.setName(name);
        stu1.setMajor(major);
        stu1.setTel(stutel);
        students[0] = stu1;
        Student stu2 = new Student();
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        stu2.setNum(Integer.parseInt(stu.next()));
        stu2.setName(stu.next());
        stu2.setMajor(stu.next());
        stu2.setTel(Integer.parseInt(stu.next()));
        students[1] = stu2;
        Student stu3 = new Student();
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        stu3.setNum(Integer.parseInt(stu.next()));
        stu3.setName(stu.next());
        stu3.setMajor(stu.next());
        stu3.setTel(Integer.parseInt(stu.next()));
        students[2] = stu3;
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다");
        for(int i = 0;i<3;i++) {
            StringBuilder newtel = new StringBuilder("0");
            newtel.append((Integer.toString(students[i].getTel())).substring(0, 2));
            newtel.append("-");
            newtel.append((Integer.toString(students[i].getTel())).substring(2, 6));
            newtel.append("-");
            newtel.append((Integer.toString(students[i].getTel())).substring(6, 10));
            System.out.printf("첫 번째 학생: %d %s %s %s\n", students[i].getNum(), students[i].getName(), students[i].getMajor(), newtel);
        }
    }
}
/*class Subway {
    int line;
    void run(){
        System.out.println("Line " + line + " runs.");
    }
    void setline(int l) {line = l;}
}
class testsubway {
    public static void main(String[] args) {
        Subway mysub = new Subway();
        mysub.setline(3);
        mysub.run();
    }
}*/
/*class Coffee {
    String origin;
    int degreeOfRoast;
    String grade;
    Coffee(String o) {origin = o;}
    Coffee(String o, String g) {
        origin = o; grade = g;
    }
    public void roast(int d) {
        System.out.println("roasting... " + origin + " " + grade);
        degreeOfRoast = d;
    }
    public void grind() {
        System.out.println("grinding... degree of roast is " + degreeOfRoast);
    }
    public void brew() {
        System.out.println("brewing...");
    }
}

class testCoffee {
    public static void main(String[] args) {
        Coffee c = new Coffee("Kenya", "AA");
        c.roast(1);
        c.grind();
        c.brew();
    }
}*/
/*class Hello {
    String towhom = "world";
    Hello() {}
    Hello(String whom) {setwhom(whom);}
    void setwhom(String whom) {towhom = whom;}
    void sayHello() {
        System.out.println("hello " + towhom);
    }
}
class testHello {
    public static void main(String[] args) {
        Hello[] harr = new Hello[3];
        harr[0] = new Hello();
        harr[1] = new Hello("홍길동");
        harr[2] = new Hello("허균");
        harr[0].sayHello();
        harr[1].sayHello();
        harr[2].sayHello();
    }
}*/
/*class Student {
    String name;
    double grade;
    int income;
    Student(String name, double grade, int income) {
        this.name = name;
        this.grade = grade;
        this.income = income;
    }
    String getName() {return name;}
    double getGrade() {return grade;}
    int getIncome() {return income;}
}
class testStudent {
    public static void main(String[] args) {
        Student s1 = new Student("김규상", 4.1, 3);
        Student s2 = new Student("김민재", 3.71, 5);
        Student s3 = new Student("김용하", 3.93, 7);
        if(s1.getGrade()>=3.5 && s1.getIncome()<=5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s1.getName());
        }
        if(s2.getGrade()>=3.5 && s2.getIncome()<=5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s2.getName());
        }
        if(s3.getGrade()>=3.5 && s3.getIncome()<=5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s3.getName());
        }
    }
}*/
/*class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력: ");
        String zone = sc.next();
        if(zone.compareTo("prime") == 0) {
            System.out.println("프라임은 11000원입니다");
        }
        else if(zone.compareTo("standard") == 0) {
            System.out.println("스텐다드는 10000원입니다");
        }
        else if(zone.compareTo("economy") == 0) {
            System.out.println("이코노미는 9000원입니다");
        }
        else {
            System.out.println("잘못 입력하셨습니다");
        }
    }
}*/
