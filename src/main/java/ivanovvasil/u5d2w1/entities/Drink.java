package ivanovvasil.u5d2w1.entities;

import ivanovvasil.u5d2w1.interfaces.OrderProduct;
import lombok.Getter;

@Getter
public class Drink extends MenuProduct implements OrderProduct {
  private final double quantity;
  private double alcholPercent;

  public Drink(String name, long cal, double price, double quantity) {
    super(name, cal, price);
    this.quantity = quantity;
  }

  public Drink(String name, long cal, double price, double quantity, double alcholPercent) {
    super(name, cal, price);
    this.quantity = quantity;
    this.alcholPercent = alcholPercent;
  }

  @Override
  public String toString() {
    return this.getName() +
            "(" + quantity +
            "l, " + alcholPercent +
            "%) " + " " + this.getPrice() + "\n";
  }
}
