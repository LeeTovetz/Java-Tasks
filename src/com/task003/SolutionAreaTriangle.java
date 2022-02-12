package com.task003;

public class SolutionAreaTriangle {
    public static void main(String[] args) {
        triangleArea(2, 8, 9);
    }

    private static void triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        double s = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));

        if (Double.isNaN(s))
            System.out.println("A triangle cannot exist/");
        else
            System.out.println("The area of the triangle is " + s);
    }
}
