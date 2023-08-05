class Password implements Secret {
  private String password;

  @Override
  public void show(){
    System.out.println("123");
  }
  

  Password(String x){
    this.password = x;
  }
}