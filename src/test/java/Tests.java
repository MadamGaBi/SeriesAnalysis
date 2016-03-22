/**
 * Created by GaBi on 17.03.2016.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.InputMismatchException;

public class Tests {

    @BeforeClass
    public static void testSetup() {
    }

    @AfterClass
    public static void testCleanup() {
        // Teardown for data used by the unit tests
    }

    // -----------------------------------------------------------------------------------------------------------------
    // average()
    @Test(expected = IllegalArgumentException.class)
    public void testAverageOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.average();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAverageOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.average();
    }
    @Test
    public void testAverage() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        assertTrue("average of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be 4.71", (tester.average()- 4.71)<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // deviation()
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.deviation();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.deviation();
    }
    @Test
    public void testDeviation() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        assertTrue("deviation of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be 6.48",
                (tester.deviation()- 6.48407312274129E12)<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // min()
    @Test(expected = IllegalArgumentException.class)
    public void testMinOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.min();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMinOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.min();
    }
    @Test
    public void testMin() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        assertTrue("min of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be -44", (tester.min()- (-44))<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // max()
    @Test(expected = IllegalArgumentException.class)
    public void testMaxOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.max();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMaxOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.max();
    }
    @Test
    public void testMax() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        assertTrue("max of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be 93", (tester.max()- 93)<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // findTempClosestToZero()
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.findTempClosestToZero();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.findTempClosestToZero();
    }
    @Test
    public void testFindTempClosestToZero() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13, -0.1, 0.1};
        assertTrue("Temp Closest To Zero of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13, -0.1, 0.1} must be 0.1",
                (tester.findTempClosestToZero()- 0.1)<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // findTempClosestToValue(double tempValue)
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.findTempClosestToValue(-15);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.findTempClosestToValue(-15);
    }
    @Test
    public void testFindTempClosestToValue() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13, -21};
        assertTrue("Temp Closest To Value -15 of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13, -21} must be -9",
                (tester.findTempClosestToValue(-15) - (-9))<0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // findTempsLessThan(double tempValue)
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempLessThenValueOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.findTempsLessThan(6);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempLessThenValueOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.findTempsLessThan(6);
    }
    @Test
    public void testFindTempLessThenValue() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        double[] testerLessThen = new double[]{0.1, 0.8, -23, -9, -0.5, -44};
        for (int i=0; i<tester.findTempsLessThan(6).length; i++)
        assertTrue("Temps Less Than Value 6 of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be {0.1, 0.8, -23, -9, -0.5, -44}",
                (tester.findTempsLessThan(6)[i] - testerLessThen[i]) < 0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // findTempsGreaterThan(double tempValue)
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempGreaterThenValueOfEmptyExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.findTempsGreaterThan(10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempGreaterThenValueOfNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.findTempsGreaterThan(10);
    }
    @Test
    public void testFindTempGreaterThenValue() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        double[] testerGreaterThen = new double[]{12,93, 13};
        for (int i=0; i<tester.findTempsGreaterThan(10).length; i++)
            assertTrue("Temps Greater Than Value 10 of {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} must be {12, 93, 13}",
                    (tester.findTempsGreaterThan(10)[i] - testerGreaterThen[i]) < 0.000000001);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // addTemps(double ... temps)
    @Test(expected = IllegalArgumentException.class)
    public void testAddTempsNullExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.addTemps(null);
    }
    @Test(expected = InputMismatchException.class)
    public void testAddTempsWithForbiddenValuesExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        double[] testerAddTemps = new double[]{0,-274, 23};
        tester.addTemps(testerAddTemps);
    }
    @Test
    public void testAddTemps() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        double[] testerAddTemps = new double[]{0,-273, 23};
            assertEquals("New Temps {0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13} and {0,-273, 23}", 12,
                    tester.addTemps(testerAddTemps));
    }
    @Test
    public void testAddEmptyTempSeries() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        double[] testerAddTemps = new double[]{};
        assertEquals("New Temps {} and {} length must be 0", 0,
                tester.addTemps(testerAddTemps));
    }

    // -----------------------------------------------------------------------------------------------------------------
    // TempSummaryStatistics summaryStatistics()
    @Test(expected = IllegalArgumentException.class)
    public void testNullSummaryStatisticsExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = null;
        tester.summaryStatistics();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testEmptySummaryStatisticsExceptionIsThrown() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{};
        tester.summaryStatistics();
    }
    @Test
    public void testSummaryStatistics() {
        TemperatureSeriesAnalysis tester = new TemperatureSeriesAnalysis();
        tester.temperatureSeries = new double[]{0.1, 0.8, -23, -9, 12, -0.5, -44, 93, 13};
        assertTrue("Series with results must be instance of TempSummaryStatistics class",
                tester.summaryStatistics() instanceof TempSummaryStatistics);
    }
}