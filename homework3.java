import java.util.Scanner;
import java.lang.*;
/*class Hello{
    String towhom = "world";
    Hello() {
    }
    void setwhom(String whom) {
        towhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + towhom);
    }
}*/
enum Color {
    RED(30), AMBER(10), GREEN(30);
    int sec;
    Color(int sec) {this.sec = sec;}
    int getsec() {return sec;}
}
public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요? ");
        int much = sc.nextInt();
        int arr[] = new int[much];
        System.out.println("수를 입력하세요: ");
        for(int i = 0;i<much;i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = max;
        for(int i = 1;i<much;i++) {
            if(max<arr[i]) { max = arr[i];}
        }
        for(int i = 1;i<much;i++) {
            if(min>arr[i]) { min = arr[i];}
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
        /*for(Color c : Color.values()) {
            System.out.printf("색: %s, 시간: %d\n", c, c.getsec());
        }*/
    }
}
