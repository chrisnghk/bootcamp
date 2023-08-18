public class DemoSwitch {
    // static final ( constat ) ( 0 -2 )
    // instance variable ( 1x)
    // static variable (1-2)
    // constructors
    // public instatnce methods // main logic
    // static methods // tools
    // private methods

    public static void main(String[] args) throws Exception {
        System.out.println(grade(90));
        Weekday weekday = Weekday.TUE;

        // Approach 1
        int result = switch (weekday) {
            case MON, TUE -> 1;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
            // default -> 0;
        };


           // Approach 2

        //    int result2 = switch (weekday){
        //     case MON,TUE:
        //     System.out.println("Monday or Tuesday");
        //     yield 1;
        //     case WED:
        //     System.out.println("Wednesday");
        //     yield 3;
        //     case THU:
        //     System.out.println("Thu");
        //     yield 4;            
        //     case FRI:
        //     System.out.println("Wednesday");
        //     yield 5;

        //    }
        // }
        String str = "Hello World !";
        String result3 = switch (str) {
            default -> {
                if (str.length() >= 5 ) {
                    yield "length than more 5 ";
                } else if (str.length()  < 5) {
                    yield "length than less 5";
                } else {
                    yield "default";
                }
            }
        };
        System.out.print(result3);
    }



    public static int getWeekday(Weekday weekday) {
        switch (weekday) {
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THU:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;

        }
    }

    public static char grade(int score) {
        char grade = ' ';
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
            default:
                grade = 'F';
                break;
        }
        return grade;
    }
}
