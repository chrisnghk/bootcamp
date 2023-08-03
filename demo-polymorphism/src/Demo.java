public class Demo {
    public static void main(String[] args) {
        // Dynamic Polymorphism ( RUn-time )
        Building building = new House(); //
        // Compile-tome checks
        // building.getCapacity(); // compile error
        // building.print(); // compile error

        building.print(); // Compile-tome confirm you can call print() method
        // Run-time decide which print() is going to call
        // So, "Building" variable call House's print() method

        building.print2(); // I am House

        building.print3(); // I am Building

        // Static Polymorphsim ( compile-time )
        // Method Signature ( metho dname + parameters )
        // Constructor Signature
        House house = new House();
        house.print("hello");
        house.print();
        System.out.println();
        House house2 = new House(3.0d);
        house2.print("Hello");
        house2.print();
        // House house3 = new House("String"); // constructer not found
        // house2.print(3L); // method not found


        long l1 = Long.valueOf(1L); // wrapper class -> unbox
        Long l3 = 3L; // wrapper class -> auto-box

        long l2 = 2;// upcasting
        int i2 = (int)3L;// down

        // downcast ( Run-time Polymorphism )
        Object obj = new Container();
        if (obj instanceof Cube) { // false
            Cube cube = (Cube) obj; // downcast : Object -> Cube
            System.out.println("obj is instance of Cube");
        }

        Object obj2 = new Cube();
        if (obj2 instanceof Cube) { // true
            Container cube = (Container) obj2; // downcast : Object -> Container
            System.out.println("obj2 is instance of Cube");
        }

        Container obj3 = new Clone();
        // Cube cube2 = (Cube) obj3; // Java.lang.ClassCastException
        // runtime exception : Run-time pilymorphism;

        //Number number = Integer.valueOf(3);
        //Double d1 = (Double) number;// java.lang.ClassCastException


    }
}
