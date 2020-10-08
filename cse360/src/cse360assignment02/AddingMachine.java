package cse360assignment02;

/* Adding Machine Class */
public class AddingMachine {
  private int total;
  private String history;
  /* Constructor*/
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "" + total;
  }
   /* Returns current total */
  public int getTotal () {
    return this.total;
  }
  /* adds the value to total and transaction to history */
  public void add (int value) {
	  this.total += value;
	  this.history = history + " + " + value;
  }
  /* subtracts the value from the total variable and adds transaction to history*/
  public void subtract (int value) {
	  this.total -= value;
	  this.history = history + " - " + value;
  }
  /* returns the string*/
  public String toString () {
    return this.history;
  }
  /* clears the total and history */
  public void clear() {
	  this.total =0;
	  this.history = "0";
  }
}
