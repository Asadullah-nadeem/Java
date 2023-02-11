package lecture;


/*Write a program for fitting a straight line through a set of points(x, y), i = 1,…, n.
The straight line equation is y = mx + C and the values of m and c are given by m= n * sum (x_{i}*y_{i}) -( sum x i )
( sum y i ) n ( sum x i ^ 2 )-( sum y i )^ 2 c= 1/n ( sum y y -m sum x i ) All summations are from 1 to n.*/


import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

///* Scanner */

public class StraightLineFitter {
    public static void main(String[] args) {
        ArrayList<Point >points = new ArrayList<Point>();
        // Add the points (x , y) to the Arraylist
        points.add(new Point(1,2));
        points.add(new Point(2,3));
        points.add(new Point(3,4));
        // Call the fitLine method to find the line of beast fit
        double[] line = fitLine(points);
        System.out.println("The line of best fit is y : " + line[0] + "x +" + line[1]);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the Number of Points : ");
//        int n = scanner.nextInt();
//        double [] x = new double[n];
//        double [] y = new double[n];
//        for (int i = 0; i<n; i++){
//            System.out.println("Enter the x-coordinate of point" + ( i + 1 ) + " : ");
//            x[i] = scanner.nextDouble();
//            System.out.println("Enter the y-coordinate of point" + (i + 1 ) + " : ");
//            x[i] = scanner.nextDouble();
//        }
//        double sumX = 0, sumY =0, sumXY = 0, sumXSquared = 0;
//        for (int i = 0; i < n; i++){
//            sumX += x[i];
//            sumY += y[i];
//            sumXY += x[i] * y[i];
//            sumXSquared += x[i] * x[i];
//        }
//        double m = (n* sumXY - sumX * sumY) / (n* sumXSquared - sumX * sumX);
//        double c = (sumY - m * sumX) / n;
//        System.out.println("the Line Equation is: y = " + m + "x + " + c);
    }
    public static double[] fitLine(ArrayList<Point> points){
        int n = points.size();
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXSquared  = 0;
        for (Point p : points){
            sumX += p.x;
            sumY += p.x;
            sumXY += p.x * p.y;
            sumXSquared += p.x * p.x;
        }
        double m = (n* sumXY - sumX * sumY) / (n* sumXSquared - sumX * sumX);
        double c = (sumY - m * sumX) / n;
        return new double[]{ m, c};
    }
    static class Point{
        double x;
        double y;

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
}