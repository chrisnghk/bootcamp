package shape;

public class DemoSharp {

  public static void main(String[] args) {
    Square s1 = Square.valueOf(10.0d);
    Square s2 = Square.valueOf(4.5d);


    // Square s3 = new Square(5);

    // System.out.println(square2.edges[1].getLength());

    // s1 -> edges[0] color -> YELLOW
    // System.out.println(s1.getEdges()[0].getcolor()); // RED
    // s1.getEdges()[0].setColor("YELLO");
    // System.out.println(s1.getEdges()[0].getcolor()); // YELLOW

    // getEdges() has 4 address,getEdges[0] -> address

    System.out.println(s1.getEdge(4).getLength());
    System.out.println(s2.getEdge(4).getcolor());
    s2.modify(4, "BBBBBBBB");
    System.out.println(s2.getEdge(4).getcolor());
  }

}
