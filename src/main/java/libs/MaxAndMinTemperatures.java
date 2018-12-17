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
   * The original method will work with all possible numeric values  in the range
   * of a byte size (-128 to 127). However, it would not when input is an EMPTY list.
   * Instead of returning an Exception, it will return the value of the
   * initial value of t which is byte-casted value of Integer.MAX_VALUE.
   */
  public static byte getMinTemperature(byte[] temperatures) {
    int t = temperatures[0];
    for (int i = 1; i < temperatures.length; i++) {
      if (t > temperatures[i]) {
        t = temperatures[i];
      }
    }

    return (byte) t;
  }

}
