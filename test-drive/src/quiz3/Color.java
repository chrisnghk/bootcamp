// Question 4

enum Color{
  RED (1),YELLOW(2),BLACK(3);

  static int counter = 0;
  int value;

  Color(int i ){
    this.value = i;
    counter++;
  }


  public static void main(String[] args){
    System.out.println(Color.counter);
  }
}