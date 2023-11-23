/*class Numbers {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int min, max;
    public Numbers(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public void setNumbers() {
        for(int x = min ; x <= max ; x++) {
            if(x%4==0 && x%5!=0) {
                arr.add(x);
            }
        }
    }
    public int sumList() {
        int sum = 0;
        for(int i : arr) {
            System.out.printf("%d..", i);
            sum += i;
        }
        return sum;
    }
}
class a {
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 100);
        n.setNumbers();
        System.out.println("\nSum: " + n.sumList());
    }
}*/
/*class a {
    String str;
    a(String s) {str = s;}
    Map<Character, Integer> countChars() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] letters = str.toCharArray();
        for(char c:letters) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        a t = new a("sangmyung university");
        Map<Character, Integer> m = t.countChars();
        System.out.println(m);
    }
}*/
/*class CountWordsInText {
    String[] str;
    private Map<String, Integer> wordMap;
    private ArrayList<String> wordList;
    public CountWordsInText(String[] s) {str = s;
        wordMap = new HashMap<String, Integer>();
        wordList = new ArrayList<String>();
    }
    public void countWords() {
        for(String sentence : str) {
            String[] words = sentence.split("(\\,|\\!|\\.|\\s+)+");
            for(String word : words) {
                if(wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                }
                else {
                    wordList.add(word);
                    wordMap.put(word, 1);
                }
            }
        }
    }
    public void printWordsShownMoreThan(int n) {
        for(String word : wordList) {
            int num = wordMap.get(word);
            if(num >= n) {System.out.printf("%s : %d\n", word, num);}
        }
    }
    public static void main(String[] args) {
        String doc[] = {
                "Hear the sledges with the bells",
                "Silver bells!",
                "What a world of merriment their melody foretells!",
                "How they tinkle, tinkle, tinkle,",
                "In the icy air of night!",
                "While the stars, that oversprinkle",
                "All the heavens, seem to twinkle",
                "With  a crystalline delight;",
                "Keeping time, time, time,",
                "In a sort if Runic rhyme,",
                "To the tintinabulation that so musically wells",
                "From the bells, bells, bells, bells,",
                "Bells, bells, bells,",
                "From the jingling and the tinkling of the bells."
        };

        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);
    }
}*/
/*class main {
    public static void main(String[] args) {
        String[] arrToSort = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
        Arrays.sort(arrToSort);
        for(int i = 0;i<arrToSort.length;i++) {
            System.out.print(arrToSort[i] + " ");
        }
    }
}*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Homework8 {
    static Map<String, String> setMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");
        return map;
    }
    static boolean checkId(Map map, String id) {
        if(map.containsKey(id)) {
            return true;
        }
        else {return false;}
    }
    static boolean checkPass(Map map, String pass) {
        if(map.containsValue(pass)) {
            return true;
        }
        else {return false;}
    }
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m = setMap();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.printf("id: ");
            String id = sc.next();
            if(!checkId(m, id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.printf("password: ");
            String pass = sc.next();
            if(!checkPass(m, pass)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }

}