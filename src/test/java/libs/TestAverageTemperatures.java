package libs;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAverageTemperatures {

  @Test
  public void testAverageIsCalculatedProperly() {

    double average = AverageTemperature.getTemperature(InputValues.typicalValues);
    assertEquals(InputValues.typicalValuesAverage, (double)Math.round(average * 1000d) / 1000d,
            "Expected average value is wrong!");
  }

  @Test
  public void testAverageIsCalculatedProperlyWithBigData() {

    double average = AverageTemperature.getTemperature(InputValues.bigData);
    assertEquals(InputValues.bigDataValuesAverage, (double)Math.round(average * 1000d) / 1000d,
            "Expected average value is wrong!");
  }

  @Test
  public void testAverageIsCalculatedProperlyWithEmptyData() {

    double average = AverageTemperature.getTemperature(InputValues.emptyInput);
    assertEquals(Double.NaN, average,"Expected average value should be NaN");
  }

}
