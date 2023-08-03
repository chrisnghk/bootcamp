public class Ball {
  
  private Color color; // String -> "RE D"," RED","red",

  public Ball(Color color){
    this.color = color;
  }

  public Color getColor(){
   return this.color;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
      return true;
    if ( !(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }

  public static void main(String[] args){
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());

    Color c1 = Color.GREEN;
    System.out.println(c1.getHexCode());
  }
}
