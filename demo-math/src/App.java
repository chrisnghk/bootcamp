public class App {
    public static void main(String[] args)  {
        System.out.println(Math.round(5.4)); // Result : 5
        System.out.println(Math.round(5.5));// Result : 6
        System.out.println(Math.round(5.44));// Result : 5
        System.out.println(Math.round(5.45));// Result : 5

        Math.random(); // 0.0 - 1.0;

        System.out.println(Math.log10(1000)); //3.0

        int[] nums = new int []{-100,100,90,50};
        // -100 -> 100
        // 100 + 100 + 90 + 50
        int sum = 0;
        for (int i = 0 ; i< nums.length;i++){
            sum += Math.log(nums[i]);
        }
        System.out.printf( "The sum of abs value %s \n", sum);

        double[] arr = new double[] { -5.64,5.23,9.800,6.55};
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            total += Math.round(Math.abs(arr[i]));
        }
        System.out.println(total);

        int cubeLength = 3;
        double volume = Math.pow(cubeLength, 3); //9

        int[] bases = new int[]{2,3,4,5};
        int[] index = new int[]{3,4,5,6};
        int[] result = new int[]{bases.length};
        for (int i=0;1< bases.length;i++){
            result[i] = (int) Math.pow(bases[i], index[i]);
        }

    }
}
