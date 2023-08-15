import javax.swing.JButton;
import javax.swing.JFrame;

public class Helloworld {

  public static int addNumber(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println("How are you today ?");
    System.out.println("fine. and you ?");
    System.out.println("你好");

    System.out.println("Aa".indexOf("aAAbbbb".charAt(1)));

    char a = '5';
    int b = 5;
    int result = addNumber(a, b);
    System.out.println(result);

    JFrame frame = new JFrame();
    JButton button = new JButton("click me");
    frame.getContentPane().add(button);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
