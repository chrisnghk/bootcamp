public class Keyboard {

  private String buttonType;
  private int noOfButton;

  public Keyboard(String buttonType, int noOfButton) {
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

  public String getButtonType() {
    return this.buttonType;
  }

  public void setButtonType(String buttonType) {
    this.buttonType = buttonType;
  }

  public int getNoOfButton() {
    return this.noOfButton;
  }

  public void setNoOfButton(int noOfButton) {
    this.noOfButton = noOfButton;
  }
}
