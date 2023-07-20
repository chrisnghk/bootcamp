public class FroEach {
    public static void main(String[] args) {
        // badic for-loop
        for (int i = 0; i < 3; i++) {
            System.out.println("basic for-loop Hello");
        }
        // For-each
        int[] arr = new int[] {200, 100, 3, 4};
        // for ( Type Element :Dateset)
        // Difference of for-sach;
        // 1. for-each fo not have stop condition / counter in loop signature
        // 2. 
        for (int x : arr) { // loop through all elements
            System.out.println("for-each: Hello, x = " + x);
            System.out.println(arr[0]);
            //modification
            arr[0]=8;
        }
        for (int i = 0; i < arr.length; i++) { // counter
            System.out.println("for-each: hello");
        }
        // 

        String[] strs = new String[] {"Hello","world"};
        for ( String y : strs){
            System.out.println(y);
        } 

        // Integer , Character ( Wrapper Class)
        Character[] chars = new Character[]{'L','a','!','('};
        for (Character c : chars){
            System.out.println(c);
        }

    }
}
