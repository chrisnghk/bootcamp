public class Methods {

    public static void print() { // method name:print()
        System.out.println("Hello in print() method.");
    }

    public static int sum(int a, int b) { // left in = return type
        // the int inside the bracket are paremeters
        int c = a + b;
        return c;
    }

    public static void main(String[] args) { // method
        String str = "Hello";
        str += " world"; // append operation

        // Approach 1
        System.out.println("Hello in print() method. 2 ");
        // approach 2 : by method
        print(); // print" Hello in print() method."

        // Approach 1
        int x = 10, y = 100, m = x + y;

        // Approach 2
        int z = sum(x, y);
        int i = sum(1000, -30);
        System.out.println(i);

        method2("hello"); // print string = hello
        method2("Github"); // print string = Github

        double circleArea = 5 * 5 * pi();
        System.out.println("Circle Area = " + circleArea);

    }

    public static int substract(int x, int y) {
        return x - y; // execute x - y first, hten return the result
    }

    public static void method2(String str) {
        if (str == null || "".equals(str)) { // null is not empty,empty
            return;
        }
        System.out.println("string = " + str);
    }

    public static double pi() {
        return 3.14159;
    }
}
