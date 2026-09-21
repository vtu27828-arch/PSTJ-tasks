import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();
            map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

Input
5
java
python
java
ai
python
Output
java 2
python 2
ai 1
