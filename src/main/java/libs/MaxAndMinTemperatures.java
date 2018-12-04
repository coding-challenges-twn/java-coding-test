package libs;

/**
 * This class calculates average temperature from multiple measurements
 */
public class MaxAndMinTemperatures {

  public static byte getMaxTemperature(byte[] temperatures) {
    byte t = 0;
    for (int i = 0; i < temperatures.length; i++) {
      if (t < temperatures[i]) {
        t = temperatures[i];
      }
    }

    return t;
  }

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
