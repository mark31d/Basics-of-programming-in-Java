
public class Main {
    public static void main(String[] args) {

        double a1 = -2.86;
        double b1 = 1.62;
        double c1 = 10.874;
        double d1 = -2.91;


        double y1 = (Math.log(Math.abs(2 * a1)) / (3 * Math.tan(b1)))
                - (Math.sqrt(c1 / Math.sqrt(Math.abs(d1))));


        System.out.println("The value of y for the first equation is: " + y1);


        double a2 = 1.54;
        double b2 = 0.49;
        double c2 = 24.1;
        double d2 = 0.87;


        double y2 = 2 * Math.sqrt((Math.sin(a2) / Math.abs(Math.tan(b2 - a2)))
                + (Math.log(c2) / d2));


        System.out.println("The value of y for the second equation is: " + y2);

        double a3 = 1.25;
        double b3 = 3.09;
        double c3 = 4.25;
        double d3 = 0.56;


        if (b3 < -1 || b3 > 1) {
            System.out.println("Помилка: b має бути в діапазоні [-1, 1] для обчислення arccos.");
        } else {

            double y = 2 * Math.sqrt(Math.tan(a3) / Math.abs(Math.acos(b3)))
                    - 3 * Math.cbrt(Math.exp(c3 - a3) * Math.sinh(d3));


            System.out.println("The value of y for the third equation is: " + y);
    }
}
}