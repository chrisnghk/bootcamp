import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
    public static void main(String[] args)  {

        

        //System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(-100);
        arrayList.add(-88);
        arrayList.add(4);
        Collections.sort(arrayList); // nlogn, ascending sorting
        System.out.println(arrayList); // [-100, -88, 4, 100]

        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(4, Color.BLUE));
        balls.add(new Ball(1,Color.YELLOW));
        balls.add(new Ball(5,Color.RED));
        balls.add(new Ball(100,Color.YELLOW));
        Collections.sort(balls);
        System.out.println(balls);
    }
}
