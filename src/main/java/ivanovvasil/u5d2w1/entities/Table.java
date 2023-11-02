package ivanovvasil.u5d2w1.entities;

import ivanovvasil.u5d2w1.enums.TableStatus;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Table {
  private int tableNumber;
  private int maxCovers;
  private TableStatus tableStatus;

  public Table(int tableNumber, int maxCovers, TableStatus tableStatus) {
    this.tableNumber = tableNumber;
    this.maxCovers = maxCovers;
    this.tableStatus = tableStatus;
  }
}
