1  import java.util.*;
2  import java.lang.*;
3  import java.io.*;

4  class Codechef {
5      public static void main (String[] args) throws java.lang.Exception {
6          Scanner sc = new Scanner(System.in);
7          int T = sc.nextInt();

8          while (T-- > 0) {
9              int N = sc.nextInt();
10             HashMap<String, Integer> freq = new HashMap<>();

11             for (int i = 0; i < N; i++) {
12                 String word = sc.next();
13                 freq.put(word, freq.getOrDefault(word, 0) + 1);
14             }

15             if (freq.size() == 1) {
16                 System.out.println(-1);
17                 continue;
18             }

19             List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
20             list.sort((a, b) -> b.getValue() - a.getValue());
21             System.out.println(list.get(1).getKey());
22         }
23     }
24 }
