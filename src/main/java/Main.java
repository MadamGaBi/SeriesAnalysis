/**
 * Created by GaBi on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        TemperatureSeriesAnalysis temp = new TemperatureSeriesAnalysis();
        temp.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        System.out.println("average " + temp.average());
        System.out.println("deviation " + temp.deviation());
        System.out.println("Temp Closest To Zero " + temp.findTempClosestToZero());
        System.out.println("Temp Closest To Value " + temp.findTempClosestToValue(-15));
        System.out.println("Temps Less Then");
        for (double tempLessThen:temp.findTempsLessThan(6)) {
            System.out.print(tempLessThen + " ");
        }
        System.out.println();
        System.out.println("Temps Greater Than");
        for (double tempsGreaterThan:temp.findTempsGreaterThan(10)) {
            System.out.print(tempsGreaterThan + " ");
        }
        System.out.println();
        System.out.println("min " + temp.min());
        System.out.println("max " + temp.max());

        System.out.println(temp.summaryStatistics());
        System.out.println(temp.addTemps(new double[]{3, -5, 0.5}));
    }
}
