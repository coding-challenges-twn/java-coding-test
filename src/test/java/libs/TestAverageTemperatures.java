package libs;

import static org.testng.Assert.assertEquals;

import libs.MaxAndMinTemperatures;
import org.testng.annotations.Test;

public class TestAverageTemperatures {

  @Test
  public void testAverageIsCalculatedProperly() {
    byte[] measurements = {-7, 7, 0};
    double average = AverageTemperature.getTemperature(measurements);
    assertEquals(average, 0.0);
  }

}
