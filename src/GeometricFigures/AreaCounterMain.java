package GeometricFigures;

public class AreaCounterMain {
    public static void main(String[] args) {
        GeometricFigure[] geometricFigures = new GeometricFigure[3];
        geometricFigures[0] = new Circle(5);
        geometricFigures[1] = new Triangle(4, 7);
        geometricFigures[2] = new Square(6);

        double totalArea = calculateTotalArea(geometricFigures);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    public static double calculateTotalArea(GeometricFigure[] geometricFigures) {
        double totalArea = 0;
        for (GeometricFigure figure : geometricFigures) {
            totalArea += figure.calculateArea();
        }
        return totalArea;
    }
}
