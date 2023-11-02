package ivanovvasil.u5d2w1;

import ivanovvasil.u5d2w1.entities.Menu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MenuTest {
  static Menu menu;

  @BeforeAll
  static void beforeAll() {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2W1Application.class);
    menu = (Menu) ctx.getBean(Menu.class);
  }

  @Test
  public void menuNotNull() {
    assertNotNull(menu);
  }

}
