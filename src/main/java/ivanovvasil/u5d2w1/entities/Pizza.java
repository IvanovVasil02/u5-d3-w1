package ivanovvasil.u5d2w1.entities;

import ivanovvasil.u5d2w1.interfaces.OrderProduct;
import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends MenuProduct implements OrderProduct {
  private final List<Topping> ingredients;

  public Pizza(String name, long cal, double price, List<Topping> ingredients) {
    super(name, cal, price);
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return this.getName() +
            " (" + ingredients +
            ") " + getCal() + " " + getPrice() + "\n";
  }
}
