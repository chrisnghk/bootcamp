public class Cow implements Move {

  @Override
  public void print() {
    System.out.println("I am Java 8 Cow");
  }
  @Override
  public void bigJump(){};

  @Override
  public void jump() {}

  @Override
  public void up() {
    System.out.println("Moving up ");
  }

  @Override
  public void down() {}

  @Override
  public void left() {}

  @Override
  public void right() {}
}
