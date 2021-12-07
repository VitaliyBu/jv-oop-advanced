package mate;

public class RightTriangle extends Figure {
    private final String color;
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "rightTriangle, "
                +
                "area = " + getArea()
                +
                " sq.units, firstLeg = " + firstLeg
                +
                " units, secondLeg = " + secondLeg
                +
                ", color = '" + color + '\''
                +
                '}';
    }
}
