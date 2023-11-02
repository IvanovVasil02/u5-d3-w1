package ivanovvasil.u5d2w1;

import ivanovvasil.u5d2w1.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@Slf4j
public class PizzaTest {
  static Pizza margheritaPizza;
  static Pizza hawaiianPizza;
  static Pizza salamiPizza;

  private static AnnotationConfigApplicationContext ctx;

  @BeforeAll
  static void beforeAll() {
    ctx = new AnnotationConfigApplicationContext(U5D2W1Application.class);
    margheritaPizza = (Pizza) ctx.getBean("margheritaPizza");
    hawaiianPizza = (Pizza) ctx.getBean("hawaiianPizza");
    salamiPizza = (Pizza) ctx.getBean("salamiPizza");
  }

  @AfterAll
  static void afterAll() {
    ctx.close();
  }

  @ParameterizedTest
  @ValueSource(strings = {"margheritaPizza", "hawaiianPizza", "salamiPizza"})
  public void testpizzasNotNull(String pizza) {
    assertNotNull(pizza);
  }


}
