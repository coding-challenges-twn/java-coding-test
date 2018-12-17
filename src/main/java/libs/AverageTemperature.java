package libs;

/**
 * This class calculates average temperature from multiple measurements
 */
public class AverageTemperature {

  /*
   * The original implementation will not work when input is huge as tsum
   * uses byte (-128 to 128). When tsum exceeds max byte value, it would wrap
   * around from min value. Use the data type with the biggest size as
   * much as possible.
   */

  public static double getTemperature(byte[] temperatures) {
    long tsum = 0;
    int i;
    for (i = 0; i < temperatures.length; i++) {
      tsum += temperatures[i];
    }

    return tsum*1.0/i;
  }

}
