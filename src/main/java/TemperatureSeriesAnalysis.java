import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaBi on 17.03.2016.
 */
public class TemperatureSeriesAnalysis {
    double[] temperatureSeries;

    // конструктор без параметров (по умолчанию)
    public TemperatureSeriesAnalysis() {
        super();
    }

    // конструктор с параметрами
    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        super();
        this.temperatureSeries = temperatureSeries;
        // TODO: 18.03.2016 класс TemperatureSeriesAnalysis должен иметь конструктор с параметром принимающий начальный ряд температур
        // если в переданном ряде температур, встречается хоть одно значение меньше чем - 273 С,
        // то все значения из данного ряда не должны добавляться к основному ряду и должно выбрасываться
        // исключение InputMismatchException
    }

    // метод для округления double
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    // Метод double average() вычисляет средние значение температуры. Если ряд пустой генерирует IllegalArgumentException.
    public double average() throws IllegalArgumentException{

        double avarageOfTempSeries;
        double sumOfTemp = 0;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            for (int i=0; i<=this.temperatureSeries.length-1; i++){
                sumOfTemp += this.temperatureSeries[i];
            }
            avarageOfTempSeries = sumOfTemp/this.temperatureSeries.length;
            return round(avarageOfTempSeries, 2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double deviation() возвращает cреднеквадрати́ческое отклоне́ние температуры
    // Если ряд пустой генерирует IllegalArgumentException
    public double deviation(){

        double avarageOfTempSeries;
        double deviationOfTempSeries;
        double sumOfAvarageOfTempSeries = 0;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            avarageOfTempSeries = average();
            for (int i=0; i<=this.temperatureSeries.length-1; i++){
                sumOfAvarageOfTempSeries += Math.pow(2, this.temperatureSeries[i] - avarageOfTempSeries);
            }
            deviationOfTempSeries = Math.sqrt(sumOfAvarageOfTempSeries/this.temperatureSeries.length);
            return round(deviationOfTempSeries, 2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double min() возвращает минимальную температур. Если ряд пустой генерирует IllegalArgumentException.
    public double min(){

        double minOfTempSeries;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            minOfTempSeries=this.temperatureSeries[0];
            for (int i=0; i<=this.temperatureSeries.length-1; i++){
                if (this.temperatureSeries[i] < minOfTempSeries){
                    minOfTempSeries = this.temperatureSeries[i];
                }
            }
            return minOfTempSeries;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double max() возвращает максимальную температур. Если ряд пустой генерирует IllegalArgumentException.
    public double max(){

        double maxOfTempSeries;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            maxOfTempSeries=this.temperatureSeries[0];
            for (int i=0; i<=this.temperatureSeries.length-1; i++){
                if (maxOfTempSeries < this.temperatureSeries[i]){
                    maxOfTempSeries = this.temperatureSeries[i];
                }
            }
            return maxOfTempSeries;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double findTempClosestToZero() возвращает значение температуры ближайшее к 0. Если ряд пустой генерирует IllegalArgumentException.
    // Если в ряде несколько значений одинаково близки к 0 (к примеру -0.2 и 0.2), то возвращается положительное (большее) (т.е. 0.2)
    public double findTempClosestToZero(){

        double closestToZeroTemp;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            closestToZeroTemp = Math.abs(this.temperatureSeries[0]);
            for (int i=0; i<=this.temperatureSeries.length-1; i++) {
                if (Math.abs(this.temperatureSeries[i]) < closestToZeroTemp) {
                    closestToZeroTemp = Math.abs(this.temperatureSeries[i]);
                }
            }
            return closestToZeroTemp;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double findTempClosestToValue(double tempValue) аналогичен предыдущему методу,
    // только возвращает значение ближайшее к указанному tempValue
    public double findTempClosestToValue(double tempValue){

        double closestToValueTemp;

        if (this.temperatureSeries!=null && this.temperatureSeries.length>0){
            closestToValueTemp = this.temperatureSeries[0];
            for (int i=0; i<=this.temperatureSeries.length-1; i++) {
                if (Math.abs(this.temperatureSeries[i] - tempValue) < Math.abs(closestToValueTemp - tempValue)) {
                    closestToValueTemp = this.temperatureSeries[i];
                }
            }
            return closestToValueTemp;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double[] findTempsLessThan(double tempValue) возвращает массив со значениями температуры меньше указанного tempValue.
    // Если ряд пустой генерирует IllegalArgumentException.
    public double[] findTempsLessThan(double tempValue) {
        double[] tempsLessThanTempValue;
        Double[] tempsLessThanTempValueDouble;
        List<Double> additional = new ArrayList<Double>();
        if (this.temperatureSeries != null && this.temperatureSeries.length > 0) {

            for (int i = 0; i <= this.temperatureSeries.length - 1; i++) {
                if (this.temperatureSeries[i] < tempValue) {
                    additional.add(this.temperatureSeries[i]);
                }
            }
            tempsLessThanTempValueDouble = additional.toArray(new Double[additional.size()]);
            for (int i = 0; i < additional.size(); i++) {
                tempsLessThanTempValueDouble[i] = additional.get(i);
            }
            tempsLessThanTempValue = new double[tempsLessThanTempValueDouble.length];
            for (int i = 0; i < additional.size(); i++) {
                tempsLessThanTempValue[i] = tempsLessThanTempValueDouble[i];
            }
            return tempsLessThanTempValue;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод double[] findTempsGreaterThan(double tempValue) возвращает массив со значениями температуры больше
    // либо равно указанного tempValue. Если ряд пустой генерирует IllegalArgumentException.
    public double[] findTempsGreaterThan(double tempValue) {
        double[] tempsGreaterThanTempValue;
        Double[] tempsGreaterThanTempValueDouble;
        List<Double> additional = new ArrayList<Double>();
        if (this.temperatureSeries != null && this.temperatureSeries.length > 0) {

            for (int i = 0; i <= this.temperatureSeries.length - 1; i++) {
                if (this.temperatureSeries[i] >= tempValue) {
                    additional.add(this.temperatureSeries[i]);
                }
            }
            tempsGreaterThanTempValueDouble = additional.toArray(new Double[additional.size()]);
            for (int i = 0; i < additional.size(); i++) {
                tempsGreaterThanTempValueDouble[i] = additional.get(i);
            }
            tempsGreaterThanTempValue = new double[tempsGreaterThanTempValueDouble.length];
            for (int i = 0; i < additional.size(); i++) {
                tempsGreaterThanTempValue[i] = tempsGreaterThanTempValueDouble[i];
            }
            return tempsGreaterThanTempValue;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Метод int addTemps(double ... temps) добавляет в конец ряда уже имеющихся данных новые значения температур,
    // возвращает суммарное число значений температур.
    // Структура (массив) используемая в классе TemperatureSeriesAnalysis для хранения уже переданных температур
    // должна увеличиваться в 2 раза, если в ней нет места для хранения новых значений.

    public int addTemps(double ... temps){

        int dimensionOfTempSeries = 0;
        if (this.temperatureSeries!=null){
        // TODO: 18.03.2016
        }
        return dimensionOfTempSeries;
    }

    TempSummaryStatistics summaryStatistics(){
            return new TempSummaryStatistics(this.average(), this.deviation(), this.min(), this.max());
        // TODO: 18.03.2016
        }

}
