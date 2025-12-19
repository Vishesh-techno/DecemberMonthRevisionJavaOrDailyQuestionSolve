import java.util.HashMap;
import java.util.Map;

public class NinteenDecember {
    public static int reverseNumber(int num) {
        long rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            if (rev <= Integer.MIN_VALUE || rev >= Integer.MAX_VALUE) {
                return 0;
            }
            num = num / 10;
        }
        return (int) rev;
    }

    public static int findUniqueCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int track[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            track[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            track[t.charAt(i) - 'a']--;
        }

        for (int j : track) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(999999999));
        System.out.println(findUniqueCharacter("InfobeansFoundation"));
        System.out.println(isAnagram("anagram", "naagram"));
    }
}
