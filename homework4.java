import java.util.Scanner;
class Gcd {
    //재귀호출
    /*int gcd(int n1, int n2) {
        if(n1 == 0) {return n2;}
        else if(n1 % n2 == 0) {return n2;}
        else {
            n1 = n1 % n2;
            return gcd(n2, n1);
        }
    }*/
    //반복문
    int gcd(int n1, int n2) {
        while(true){
            if (n1 == 0) {return n2;}
            else if(n1 % n2 == 0) {return n2;}
            else {
                n1 = n1 % n2;
                int i = n1;
                n1 = n2; n2 = i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Gcd g = new Gcd();
        System.out.printf("두 수의 최대공약수는 %d입니다", g.gcd(n1, n2));
    }
}


