package ivanovvasil.u5d2w1.entities;

import ivanovvasil.u5d2w1.enums.OrderStatus;
import ivanovvasil.u5d2w1.interfaces.OrderProduct;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalTime;
import java.util.List;

@ToString
@Getter
public class Order {
  private int ordernumber;
  private int tableNumber;
  private List<OrderProduct> order;
  private OrderStatus orderStatus;
  private int coversNumber;
  private LocalTime time;
  private double totalAmount;
  @Value("${cost.covered}")
  private int cover;


  public Order(Table table, List<OrderProduct> order, OrderStatus orderStatus, int coversNumber) {
    this.ordernumber = (int) Math.floor(Math.random() * 101);
    this.tableNumber = table.getTableNumber();
    this.order = order;
    this.orderStatus = orderStatus;
    this.coversNumber = coversNumber;
    this.time = LocalTime.now();
    this.totalAmount = Math.floor(getAmount());
  }

  public double getAmount() {
    return this.order.stream().mapToDouble(OrderProduct::getPrice).sum() + (this.cover * coversNumber);
  }

}
