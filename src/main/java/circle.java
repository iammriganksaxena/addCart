public class circle implements shapes {
    @Override
    public double circle(int radius) {
        return (2*3.14*radius);
    }

    @Override
    public double square(int sideA, int sideB) {
        return (sideA*sideB);
    }

    @Override
    public double triangle(int length, int height) {
        return (0.5*length*height);
    }
}
