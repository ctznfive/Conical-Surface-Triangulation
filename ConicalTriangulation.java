public class ConicalTriangulation {

    public static void printConeParameters (double h, double r, int n) {
        System.out.println("the cone height H        = " + h);
        System.out.println("the radius R             = " + r);
        System.out.println("the number of segments N = " + n);
        System.out.println();
    }

    public static void printCoordinates (String name, double x, double y, double z) {
        System.out.println(name + " = {" + x + ", " + y + ", " + z + "}");
    }

    public static double getX (double r, double n, int i) {
        return r * Math.cos(2 * Math.PI * i / n);
    }

    public static double getY (double r, double n, int i) {
        return r * Math.sin(2 * Math.PI * i / n);
    }

    // client
    public static void main(String[] args) {

        double height        = Double.parseDouble(args[0]);
        double radius        = Double.parseDouble(args[1]);
        int numberOfSegments = Integer.parseInt(args[2]);

        if (height <= 0 || radius <= 0) {
            throw new IllegalArgumentException("The parameters h and r should be positive.");
        }

        if (numberOfSegments < 3) {
            throw new IllegalArgumentException("At least three segments along the circle.");
        }

        printConeParameters(height, radius, numberOfSegments);

        double xA = 0;
        double yA = 0;
        double zA = height;

        double magnitude = Math.sqrt(height*height + radius*radius); 

        for (int i = 0; i < numberOfSegments; i++) {

            printCoordinates("A", xA, yA, zA);

            // P(i)
            double xB = getX(radius, numberOfSegments, i);
            double yB = getY(radius, numberOfSegments, i);
            double zB = 0;

            printCoordinates("B", xB, yB, zB);

            // P(i+1)
            double xC = getX(radius, numberOfSegments, i + 1);
            double yC = getY(radius, numberOfSegments, i + 1);
            double zC = 0;

            printCoordinates("C", xC, yC, zC);

            // unit normal for P(i)
            double xN = getX(height / magnitude, numberOfSegments, i);
            double yN = getY(height / magnitude, numberOfSegments, i);
            double zN = radius / magnitude;

            printCoordinates("N", xN, yN, zN);
            System.out.println();
        }
    }
}
