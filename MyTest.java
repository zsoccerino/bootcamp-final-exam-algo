import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//
public class MyTest {

  @Test
  void testBreakString() {
    assertEquals("blaaack wiiidooow", Main.breakString("black widow", 3));
  }
}
