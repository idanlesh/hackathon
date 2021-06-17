package hackaton.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;

public class HackatonTest {

  @Test
  public void testOf() {
    assertThat(new String().isEqualTo("string"));
  }
  
  @Test
  public void stringEqual_differentStrings_notEqual() {
    assertFalse(new String().isEqualTo("string"));
  }
}
