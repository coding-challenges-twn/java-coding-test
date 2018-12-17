package libs;

/**
 * This class calculates average temperature from multiple measurements
 */
public class MaxAndMinTemperatures {

  /*
   * The original implementation will not work when all input values are negative
   * as initial value of t=0 will always be greater than any negative number.
   */
  public static byte getMaxTemperature(byte[] temperatures) {
    byte t = temperatures[0];
    for (int i = 1; i < temperatures.length; i++) {
      if (t < temperatures[i]) {
        t = temperatures[i];
      }
    }

    return t;
  }

  /*
   * Though this is not the most efficient way to solve for the minimum
   * value in a list, this is expected to work just fine under the conditions
   * indicated in the Assumptions (see InputValues).
   */
  public static byte getMinTemperature(byte[] temperatures) {
    int t = Integer.MAX_VALUE;
    for (int i = 0; i < temperatures.length; i++) {
      if (t > temperatures[i]) {
        t = temperatures[i];
      }
    }

    return (byte) t;
  }

}
