public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Get the distance from (0, 0) to (x. y)
    public double distance() {
        return distance(0, 0);
    }

    // Get the distance from passed point object to this point object
    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    // Get distance from given point to this object point
    public double distance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }
}
