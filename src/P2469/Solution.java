package P2469;

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] kelvinAndFahrenheit = new double[2];
        kelvinAndFahrenheit[0] = celsius + 273.15;
        kelvinAndFahrenheit[1] = celsius * 1.80 + 32.00;
        return kelvinAndFahrenheit;
    }
}
