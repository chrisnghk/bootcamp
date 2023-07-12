public class Operators {
    public static void main(String[] args) {
        int a = 1;
        a = a + 1;
        a = a - 2;
        int b = 10 / 5;
        b = b * 3 + 5;
        System.out.println("a append b=" + a + b);

        int x = 1;
        x = x + 1;
        x++;
        ++x;
        x += 1;
        System.out.println("x=" + x);

        int y = 10;
        y = y - 1;
        y--;
        --y;
        y -= 1;
        System.out.println("y=" + y);

        // other +,-,*,/
        int z = 4;
        z = z + 2;
        z += 2;
        int i = 6;
        i = i - 3;
        i -= 3;
        int w = 9;
        w = w * 3;
        w *= 3;
        int u = 81;
        u = u / 9;
        u /= 9;
        int integer = 12 % 5;
        int integer2 = 12;
        integer2 %= 5;

        System.out.println("i = " + i + ", z = " + z + ",w = " + w + ",u = " + u
                + ",integer = " + integer + ", integer2 = " + integer2);

        // ++, --
        int m = 3;
        m++;
        int preIncrement = ++m;
        System.out.println("preIncrement = " + preIncrement);
        int postIncrement = m++;
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("m = " + m);

        int n = 3;
        n--;
        int preIncrement2 = --n;
        System.out.println("preIncrement 2 = " + preIncrement2);
        int postIncrement2 = n--;
        System.out.println("postIncrement 2 = " + postIncrement2);
        System.out.println("n = " + n);

    }
}
