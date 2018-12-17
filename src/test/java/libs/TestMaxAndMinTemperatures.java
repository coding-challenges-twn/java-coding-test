package libs;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestMaxAndMinTemperatures {


  @Test
  public void testMaximumTemperature() {
    int max = MaxAndMinTemperatures.getMaxTemperature(InputValues.typicalValues);
    assertEquals(max, InputValues.TYPICAL_VALUES_MAX);
  }

  @Test
  public void testMaximumTemperatureWithAllNegativeInput() {
    int max = MaxAndMinTemperatures.getMaxTemperature(InputValues.allNegative);
    assertEquals(max, InputValues.ALL_NEGATIVE_MAX);
  }

  @Test
  public void testMaximumTemperatureWithAllPositiveInput() {
    int max = MaxAndMinTemperatures.getMaxTemperature(InputValues.allPositive);
    assertEquals(max, InputValues.ALL_POSITIVE_MAX);
  }

  @Test
  public void testMinTemperature() {
    int min = MaxAndMinTemperatures.getMinTemperature(InputValues.typicalValues);
    assertEquals(min, InputValues.TYPICAL_VALUES_MIN);
  }

  @Test
  public void testMinTemperatureWithAllNegativeInput() {
    int min = MaxAndMinTemperatures.getMinTemperature(InputValues.allNegative);
    assertEquals(min, InputValues.ALL_NEGATIVE_MIN);
  }

  @Test
  public void testMinMaxTemperatureWithZeroAndByteValueMinMax() {
    byte [] input1 = {0};
    byte [] input2 = {-128};
    byte [] input3 = {127};

    assertEquals(MaxAndMinTemperatures.getMinTemperature(input1), 0);
    assertEquals(MaxAndMinTemperatures.getMaxTemperature(input1), 0);

    assertEquals(MaxAndMinTemperatures.getMinTemperature(input2), -128);
    assertEquals(MaxAndMinTemperatures.getMaxTemperature(input2), -128);

    assertEquals(MaxAndMinTemperatures.getMinTemperature(input3), 127);
    assertEquals(MaxAndMinTemperatures.getMaxTemperature(input3), 127);

  }
  

}
