package JavaEssential.HomeWork_006_StaticAndNestedClasses.App003;

public class Distance {
    private double distance;
    void print(){}

    static class Converter{
        double convertToMetr(double miliMetr){return miliMetr * 1000;}
        double convertToCentM(double miliMetr){return miliMetr * 10;}
        double convertToKiloM(double miliMetr){return miliMetr * 1000000;}
    }
}

