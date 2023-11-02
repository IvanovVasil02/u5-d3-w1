package ivanovvasil.u5d2w1;

import ivanovvasil.u5d2w1.entities.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OrderTest {

  static Order order;
  private static AnnotationConfigApplicationContext ctx;

  @BeforeAll
  static void afterAll() {
    ctx = new AnnotationConfigApplicationContext(U5D2W1Application.class);
    order = (Order) ctx.getBean("getOrder2");
  }

  @Test
  public void isNotEmptyOrderList() {
    assertFalse(order.getOrder().isEmpty());
  }

  @Test
  public void coverIsMoreThanZero() {
    assertNotEquals(0, order.getCover());
  }

  @Test
  public void totalAmountIsNotNullOrZero() {
    assertNotEquals(0, order.getAmount());
  }
  
}
