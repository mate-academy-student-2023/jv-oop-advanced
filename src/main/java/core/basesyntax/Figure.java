package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape().getDescription().toLowerCase()
                + ", area: " + String.format("%.2f", calculateArea()) + " sq.units, "
                + getSizeDescription() + ", color: " + getColor().name().toLowerCase());
    }

    protected abstract Shape getShape();

    protected abstract String getSizeDescription();
}
