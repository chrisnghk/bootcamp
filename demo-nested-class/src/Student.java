// Outer class
// Can Access static nested class attribute

import java.util.List;

public class Student {
    private String name;

    // constructor , getter , setter , static method
    Bag bag;
    Grade grade;

    public Student(String name) {
        this.name = name;
        bag = new Student.Bag();
    }

    public Student() {

    }

    public int getBagSize() {
        return this.bag.getSize();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void clearBag() {
        Bag.clear(this.bag);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    @Override
    public String toString(){
        return "Student[name=" + this.name //
        + ",Grade{"+ this.bag +}"]" //
        +"]";
    }
    // method -> Bag.method, instance variable

    // Static nested class Bag
    // Cannot Access Outer Class Attribute
    private static class Bag {
        private int size;
        List<String> strings;

        // constuctor
        private Bag() {

        }

        // getter , setter
        public void setSize(int size) {
            this.size = size;
        }

        // instance method
        public int getSize() {
            return this.size;
        }

        // static method

        public static void clear(Bag bag) {
            bag.strings.clear();
            // add ( 1, 3) // can't access outter class
        }
    }

    // Iner class (non-static nested class)
    public class Grade {
        private int score;

        public int getScore(){
            return this.score;
        }

        public char getGarde() {
            switch (this.score) {
                case 90:
                    return 'A';
                    break;
                case 80:
                    return 'B';
                    break;
                case 70:
                    return 'C';
                    break;
                default:
                    return 'F';
            }
        }

        public Grade(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(); // Student's constructor
        Student.Bag bag = new Student.Bag();// Bag's constructor
        Student.Grade grade = new Student("Peter").new Grade(70);//
        Student.Grade grade2 = student.new Grade(70);//

    }

