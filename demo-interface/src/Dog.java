public class Dog extends GameMember implements Move {

  // int score = 0;
  String name;

  @Override
  public void jump() {
    super.addScore(3);
  }

  @Override
  public void bigJump() {};

  @Override
  public void up() {
    System.out.println("Moving up ");
    super.addScore(2);
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

  public static void main(String[] args) {

    Dog dog = new Dog();
    dog.print();// print from GameMember or Move ?
  }
}
