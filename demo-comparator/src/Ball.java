public class Ball implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  // Yellow come first, if color same, id ascending order
  // if not Yellow, id descending order
  @Override
  public int compareTo(Ball ball) {
    //return ball.id > this.id ? 1 : -1;
    if (ball.color.equals(Color.YELLOW) )
      return ball.id > this.id ? 1 : 1;
    else return ball.id > this.id ? -1 : -1;
  }

  @Override
  public String toString() {
    return "[id=" + this.id + " & Color = "+ this.color+"] \n";
  }
}
