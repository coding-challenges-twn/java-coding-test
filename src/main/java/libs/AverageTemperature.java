package libs;

/**
 * This class calculates average temperature from multiple measurements
 */
public class AverageTemperature {

  public static double getTemperature(byte[] temperatures) {
    byte tsum = 0;
    int i;
    for (i = 1; i < temperatures.length; i++) {
      tsum += temperatures[i-1];
    }

    return tsum*1.0/i;
  }

}
