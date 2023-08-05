public enum Currency {
  USD(1, "US Dollor"), //
  HKD(2, "Hong Kong Dollor"), //
  CNY(3, "Chinese Yuan Renminbi"), //
  GBP(4, "British Poud Sterling"); //

  private int id;
  private String desc;

  private Currency(int id, String desc) {
    this.id = id;
    this.desc = desc;
  }

  public int getId() {
    return this.id;
  }

  public String getDesc() {
    return this.desc;
  }

  public static Currency getCurrency(int id) {
    // values()
    for (Currency currency : values()) { // values == Currency.values()
      if (currency.id == id)
        return currency;
    }
    return null;
    
  }

  public static void main(String[] args) {
      System.out.println(Currency.valueOf("HKD").getDesc()); // Hong Kong Dollars
      //System.out.println(Currency.valueOf("HKDS").getDesc()); // not found error
  }


}
