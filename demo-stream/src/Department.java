import java.util.Objects;

public class Department {
  String name;


  public Department(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dept["//
        + "name = " //
        + this.name + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Department))
      return false;
    Department department = (Department) o;
    // return point.x == this.x && point.y == this.y;
    return Objects.equals(this.name, department.name);
  }

}
