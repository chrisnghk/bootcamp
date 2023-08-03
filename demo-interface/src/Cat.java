public class Cat extends GameMember implements Move {

  String name;

  @Override
  public void jump(){
    super.addScore(4);
  }

  @Override
  public void up() {
    System.out.println("Moving up ");
    super.addScore(1);
    // GameMember.up(this);
  }

  @Override
  public void down() {
    System.out.println("a dog is down");
  }

  @Override
  public void left() {
    System.out.println("a dog is left");
  }

  @Override
  public void right() {
    System.out.println("a dog is right");
  }
}
