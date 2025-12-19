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

    public static void main(String[] args) {
        System.out.println(reverseNumber(999999999));
    }
}
