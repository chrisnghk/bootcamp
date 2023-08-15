// Builder Patern Demo
public class Phone {
  private String number;
  private Color color;
  private double weight;

  private Phone(Builder builder) {
    this.number = builder.number;
    this.color = builder.color;
    this.weight = builder.weight;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[number=" + this.number//
        + ",color=" + this.color //
        + ",weight=" + this.weight //
        + "]";
  }

  public static class Builder {
    // With same attributes of outer class
    private String number;
    private Color color;
    private double weight;

    public Builder() {

    }

    public Builder Number(String number) { // setter
      this.number = number;
      return this;
    }

    public Builder Color(Color color) { // setter
      this.color = color;
      return this;
    }

    public Builder Weight(double weight) { // setter
      this.weight = weight;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }

    public static void main(String[] args) {
      // Chain Method: replace different number of rgs constructors
      Phone phone = Phone.builder()//
          .Color(Color.GREY) //
          .Number("1234567") //
          .Weight(3.7d)//
          .build();
      System.out.println(phone);

      Phone phone2 = Phone.builder().build();
    }
  }
}
