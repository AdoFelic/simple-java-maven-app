package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;;

public class ExampleTest {
  private final String testFirstName = "John";
  private final String testLastName = "John";
  private final int testAge = 30;

  @Test
  public void testExampleConstructor() {
      try {
          new Example(testFirstName, testLastName, testAge);
      } catch (Exception e) {
          fail("Construction failed.");
      }
  }

  @Test
  public void testShowData() {
      Example test = new Example(testFirstName, testLastName, testAge);
      assertEquals(
        String.format(
          "%s %s, d", testFirstName, testLastName, testAge),
          test.showData()
      );
  }

}
