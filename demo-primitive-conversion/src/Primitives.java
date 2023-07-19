public class Primitives {
    public static void main(String[] args) {
        // Correct Syntax
        // upcasting ( implicit conversion )
        // byte -> short -> int -> long -> float -> double
        // char -> int
        byte b = 127;
        short s = b; // byte -> short. upcasting ( promotion )
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        // char -> int
        char c = 'A';
        int j = c;

        // Downcasting
        double d2 = 10.3d;
        // float f2 = d2; // cann't not assign , due to double precision is larger than float
        float f2 = (float) d2;

        short s2 = 128;
        byte b2 = (byte) s2;
        System.out.println("b2 = " + b2);// -128

        // for (byte k = 127; k < 129; k++) { // 128 -> -128
        // System.out.println("hello");d
        // }

        // int[] arr = new int[Integer.MAX_VALUE];
        // for ( int n =0;n < arr.length;n++){

        // }

        char c2 = 'B'; // 66
        if (c2 == 66) {
            System.out.println("c2 is 66");
        }

        char c3 = 'C';
        if (c3 == 67) {
            System.out.println("c3 is 67");
        }

        System.out.println("" + c3 + " is " + (int) c3);


        // ASCII (int) to char
        int g = 'a';
        int g2 = 10;
        char k = (char) g; // downcasting , explicit conversion
        char k2 = 66; // 66 is ASCII code

        // error result as below.
        // int h =(int)1000L; // downcasting, explicit conversion
        // short s10 = 128;
        // byte o = (byte) s10;
        // byte o2 = 128; // error

        char character = 'a' + 1;
        if (character == 'b') {
            System.out.println("character = " + character);
        }
        if (character == 98) {
            System.out.println("character = " + character);
        }
        if (character > 'a') {
            System.out.println("character = " + character);
        }

    }
}
