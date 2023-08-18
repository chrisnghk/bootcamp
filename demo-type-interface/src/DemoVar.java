import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {

    // var age; // Not Alloweed

    public static void main(String[] args) throws Exception {
        var s = "Hello";
        // s= 3;// error, compile-check -> string
        var i = 2;
        var c = 'a';

        // var[] x = new int[3]; // Not Allowed 

        // Loop
        List<String> strings = Arrays.asList("abc", "def");
        for (var str : strings) {
            System.out.println(str);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("a", 2);
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        var result = getString();
        result.add(Arrays.asList("dev", "xyz"));
        result.add(Arrays.asList("ijk"));

    }

    public static List<List<String>> getString() {
        return Arrays.asList(Arrays.asList("abc"));

    }

    // Not Allowed
    // public static var add ( int x , int y ){
    // return x + y ;
    // }

    // Not Allowed
    // public static String add(var x, var y) {
    // return x + y;
    // }

}
