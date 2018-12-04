import libs.AverageTemperature;
import libs.MaxAndMinTemperatures;

public class PrintTemperatureInfo {

  public static void main(String args[]) {
    byte[] tempInMadrid = new byte[]{33, 37, 37, 37, 36, 34, 30};
    byte[] tempInToronto = new byte[]{23, 26, 22, 23, 26, 26, 26};
    byte[] tempInSaoPaulo = new byte[]{21, 23, 24, 18, 16, 14, 12};
    byte a = MaxAndMinTemperatures.getMaxTemperature(tempInMadrid);
    byte b = MaxAndMinTemperatures.getMinTemperature(tempInMadrid);
    double c = AverageTemperature.getTemperature(tempInMadrid);
    System.out.println(String.format("Average temperature in Madrid today was %.1f with a maximum of %d and a minimum of %d", c, a, b));
    a = MaxAndMinTemperatures.getMaxTemperature(tempInToronto);
    b = MaxAndMinTemperatures.getMinTemperature(tempInToronto);
    c = AverageTemperature.getTemperature(tempInToronto);
    System.out.println(String.format("Average temperature in Toronto today was %.1f with a maximum of %d and a minimum of %d", c, a, b));
    a = MaxAndMinTemperatures.getMaxTemperature(tempInSaoPaulo);
    b = MaxAndMinTemperatures.getMinTemperature(tempInSaoPaulo);
    c = AverageTemperature.getTemperature(tempInSaoPaulo);
    System.out.println(String.format("Average temperature today was %.1f with a maximum of %d and a minimum of %d", c, a, b));
  }

}
