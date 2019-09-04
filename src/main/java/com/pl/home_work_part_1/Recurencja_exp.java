package HomeWork;

public class Recurencja_exp {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        a *= b;
        int d = 4;
        int r = funct(4);
        System.out.println(r);
    }


    public static int funct(int d) {
        int rezult;
        if (d == 20) {
            return 20;
        } else {
            rezult = funct(d + 1) * 10;
            System.out.println(rezult);
            return rezult;
        }

    }
}


