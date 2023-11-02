package ivanovvasil.u5d2w1;

import ivanovvasil.u5d2w1.entities.Drink;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@Slf4j
public class DrinkTest {
  static Drink lemonadeDrink;
  static Drink waterDrink;
  static Drink wineDrink;

  private static AnnotationConfigApplicationContext ctx;

  @BeforeAll
  static void beforeAll() {
    ctx = new AnnotationConfigApplicationContext(U5D2W1Application.class);
    lemonadeDrink = (Drink) ctx.getBean("lemonade");
    waterDrink = (Drink) ctx.getBean("water");
    wineDrink = (Drink) ctx.getBean("wine");
  }

  @AfterAll
  static void afterAll() {
    ctx.close();
  }

  @Test
  public void testlemonadeNotNull() {
    assertNotNull(lemonadeDrink);
  }

  @Test
  public void testwaterNotNull() {
    assertNotNull(waterDrink);
  }

  @Test
  public void testwineNotNull() {
    assertNotNull(wineDrink);
  }

}
