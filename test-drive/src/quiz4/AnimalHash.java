import java.util.HashMap;
import java.util.Map;

public class AnimalHash {
  static int hashcounter = 0;
  static Map<Integer, Animal> hashmap = new HashMap<>();

  static class Animal {
    String name;

    Animal(String name) {
      this.name = name;
      hashcounter++;
    }

    String getName() {
      return this.name;
    }
  }

  public static void addAnimal(Animal animal) {
    hashmap.put(hashcounter, animal);
  }

  public static void main(String[] args) {
    addAnimal(new Animal("Yes"));
    addAnimal(new Animal("No"));
    addAnimal(new Animal("Yes"));
    addAnimal(new Animal("Nope"));
    hashmap.remove(3);
    System.out.println(hashmap.get(3).getName());
  }
}
