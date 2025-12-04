class Nokia{
    static int mic;
    static int cam;

    static void setValue(){
        mic = 3;
        cam = 40;
    }
    static void dispaly(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
class Nokia1{
    static int mic;
    static int cam;

    static void setValue(){
        mic = 3;
        cam = 40;
    }
    static void dispaly(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
public class JavaThirdProgram {
    public static void main(String[] args) {
        Nokia.setValue();
        Nokia.dispaly();
        System.out.println();
        Nokia1.dispaly();
        Nokia1.setValue();
        Nokia1.dispaly();

        int x = Integer.parseInt("456");
        Double y = Double.valueOf("00110");
        double z = y.doubleValue();
        System.out.println(x);
        System.out.println(z);

    }
}
