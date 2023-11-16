package Project6;

class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

// Setters and getters
    // Set and get X
    public void setX(double value) {
        this.x = value;
    }

    public double getX() {
        return this.x;
    }

    // Set and get Y
    public void setY(double value) {
        this.y = value;
    }
    
    public double getY() {
        return this.y;
    }

    // Set and get radius
    public void setRadius(double value) {
        this.radius = value;
    }

    public double getRadius() {
        return this.radius;
    }

    // Get area
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean doesOverlap(Circle otherCircle) {
        double distance = Math.sqrt(Math.pow((this.x - otherCircle.x), 2) + Math.pow((this.y - otherCircle.y), 2));
        if (distance < (this.radius + otherCircle.radius)) {
            return true;
        } else {
            return false;
        }
    }

    

}
