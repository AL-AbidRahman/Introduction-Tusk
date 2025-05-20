public class MathFormulas {

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double volumeOfBall(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double areaOfEquilateralTriangle(double arm) {
        return (Math.sqrt(3) / 4.0) * Math.pow(arm, 2);
    }

    public static double areaOfTriangleUsingHeronFormula(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        
        System.out.println("Area of Triangle: " + areaOfTriangle(10, 5));
        System.out.println("Volume of Ball: " + volumeOfBall(3));
        System.out.println("Area of Circle: " + areaOfCircle(4));
        System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(25));
        System.out.println("Area of Equilateral Triangle: " + areaOfEquilateralTriangle(6));
        System.out.println("Area of Triangle (Heron's Formula): " + areaOfTriangleUsingHeronFormula(5, 6, 7));
    }
}
