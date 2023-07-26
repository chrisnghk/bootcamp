public class App {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello"); // Constructor
        // s-> address ( reference )
        s.append(" World");

        System.out.println(s);
        System.out.println(s.toString());
        s.append(1.3f);
        System.out.println(s.toString());

        // Hello Word 1.3 true 4000
        System.out.println(s.append(true).append(4000L).length()); // 22

        String str = "  he llo ";
        String[] strs = str.trim().replace('h', 'e').split(" ");
        System.out.println(strs.length);

        StringBuilder s2 = new StringBuilder("start");
        // Approach 1
        System.out.println(s2.append('a').toString().charAt(3)); // three data type
        // Approach 2
        StringBuilder s3 = s2.append('a');
        String s4 = s3.toString();
        s4.charAt(3); // r

        // insert
        String s10 = "hello"; // how to insert a space between ll
        StringBuilder s11 = new StringBuilder("hello");
        s11.insert(3, ' '); // return string builder
        System.out.println(s11);
        s11.insert(0, "world").append(" world"); // worldhel lo world
        System.out.println(s11);

        System.out.println(s11.deleteCharAt(3).toString()); // wordhel lo world
        System.out.println("abc");

        Integer a = 10;
        System.out.println(a + 10); // 20
        // a= 10;

        s11.setCharAt(4, 'J');
        System.out.println(s11.toString()); // wordJel lo world
    }
}
