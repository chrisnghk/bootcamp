package zoo;
public class Zoo<T> {
  T animal;

  // Constructor
  public Zoo(T animal) {
    this.animal = animal;
  }

  //Zoo<T> -> return type
  // T -> iput parameter
  // <T> -> the range of T
  public static <T extends Animal> Zoo<T> of(T animal) {
    return new Zoo<>(animal);
  }


  public T getAnimal() {
    return this.animal;
  }

  public void setAnimal(T animal) {
    this.animal = animal;
  }
}
