// Question 5

import java.util.ArrayList;
import java.util.List;

class Solid {
  double weight;
}


class Good extends Solid {
  double price;
}


class SmartPhone extends Good {
  String model;
}


class Furniture extends Solid {
  String color;
}


class Door extends Furniture {
  double height;
}


class Goodluck {
static List<Solid> cart = new ArrayList()<>();

  public static <U extends Good> void addToChart(U item) {
    cart.add(item);
  }

  public static void main(String[] args) {
    addToChart(new Good());
    addToChart(new SmartPhone());
    addToChart(new Solid());
    addToChart(new Door());
    addToChart(new Furniture());
    System.out.println(cart.size());
  }
}
