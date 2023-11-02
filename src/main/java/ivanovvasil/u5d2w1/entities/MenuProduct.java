package ivanovvasil.u5d2w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class MenuProduct {
  private String name;
  private long cal;
  private double price;

  @Override
  public String toString() {
    return name;
  }
}
