package libs;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestMaxAndMinTemperatures {

  @Test
  public void testMaximumTemperature() {
    byte[] measurements = {10, 11, 30};
    int max = MaxAndMinTemperatures.getMaxTemperature(measurements);
    assertEquals(max, 30);
  }

  @Test
  public void testMinTemperature() {
    byte[] measurements = {10, 11, 12, 1, 2};
    int min = MaxAndMinTemperatures.getMinTemperature(measurements);
    assertEquals(min, 1);
  }
}
