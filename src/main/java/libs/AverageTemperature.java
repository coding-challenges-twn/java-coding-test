package libs;

/**
 * This class calculates average temperature from multiple measurements
 */
public class AverageTemperature {

  public static double getTemperature(byte[] temperatures) {
    int tsum = 0;
    int i;
    for (i = 0; i < temperatures.length; i++) {
      tsum += temperatures[i];
    }

    return tsum*1.0/i;
  }

}
