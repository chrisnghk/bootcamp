public class Router {
  private String band;
  private int noOfPort;
  private boolean uplink;

  public Router(){
    
  }

  private Router(Builder builder){
    this.band = builder.band;
    this.noOfPort = builder.noOfPort;
    this.uplink = builder.uplink;
  }

  public static Builder builder(){
    return new Builder();
  }

  @Override
  public String toString() {
    return "[band = " + this.band//
        + ", noOfPort = " + this.noOfPort //
        + ", have uplink = " + this.uplink //
        + "]";
  }

  public static class Builder {
    private String band;
    private int noOfPort;
    private boolean uplink;


    public Builder Band(String band) {
      this.band = band;
      return this;
    }

    public Builder NoOfPort(int noOfPort) {
      this.noOfPort = noOfPort;
      return this;
    }

    public Builder HvUplink(boolean uplink) {
      this.uplink = uplink;
      return this;
    }

    public Router build(){
      return new Router(this);
    }

    public static void main(String[] args) {
      // Router router = new Builder().Band("Cisco").build();
      Router router = Router.builder().Band("Cisco").build();
      
      System.out.println(router);
    }
  }
}
