class ParentClass {
  public void doSomething() {
    System.out.println("do something from ParentClass");
  }
}


class Middleclass extends ParentClass {
  @Override
  public void doSomething() {
    System.out.println("do something from Middleclass");
  }
}

  class SubclassA extends Middleclass {
    @Override
    public void doSomething() {
      System.out.println("do something from SubClass A");
    }
  }



  class SubclassB extends Middleclass {
    @Override
    public static void doSomething() {
      System.out.println("do something from SubClass B");
    }
  }


public class testOverriding {
  public static void main(String[] args) {
    ParentClass o1 = new ParentClass();
    ParentClass o2 = new SubclassA();
    ParentClass o3 = new SubclassB();

    o1.doSomething();
    o2.doSomething();
    o3.doSomething();
      
  }
}
