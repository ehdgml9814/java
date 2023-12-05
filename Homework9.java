import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        try {
            Scanner sc = new Scanner(new FileInputStream("db.txt"));
            while(sc.hasNext()) {
                String id = sc.next();
                id.trim();
                String pass = sc.next();
                pass.trim();
                m.put(id, pass);
            }
            sc.close();
            Scanner sc2 = new Scanner(System.in);
            while(true) {
                System.out.println("id와 password를 입력해주세요.");
                System.out.print("id : ");
                String i = sc2.next();
                if (m.containsKey(i)) {
                    System.out.print("password : ");
                    String p = sc2.next();
                    if (m.containsValue(p)) {
                        System.out.println("id와 비밀번호가 일치합니다.\n");
                        break;
                    }
                    else {
                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                    }
                }
                else {
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 존재하지 않습니다.");
        }
    }
}
