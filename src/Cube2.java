public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }
    public Cube2(int side, String color) {
        basicCube = new Cube(side);
        this.color = color;
    }
    public Cube2(int side) {
        basicCube = new Cube(side);
        this.color = "black";
    }
    public Cube2(String color) {
        basicCube = new Cube();
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSide() {
        return basicCube.getSide();
    }
    public void setSide(int side) {
        basicCube.setSide(side);
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return basicCube.calculateVolume();}
    public int calculateSurfaceArea() { return basicCube.calculateSurfaceArea();}
    public Cube2 add(Cube2 otherCube) {
        int sumofsquares = otherCube.getSide() * otherCube.getSide() + this.getSide() * this.getSide();
        int newside = (int) Math.sqrt(sumofsquares);
        if (newside *newside != sumofsquares) {
            throw new IllegalArgumentException(
                String.format("Cubes with sides %d and %d do not form a Pythagorean triple", this.getSide(), otherCube.getSide()));
        }
        int totalsurfaceArea = this.calculateSurfaceArea() + otherCube.calculateSurfaceArea();
        return new Cube2( (int) Math.sqrt(totalsurfaceArea / 6) );
        


    }
    public Cube2 minus(Cube2 otherCube) { 
        int largerSide = Math.max(this.getSide(), otherCube.getSide());
        int smallerSide = Math.min(this.getSide(), otherCube.getSide());
        int diffOfSquares = largerSide * largerSide - smallerSide * smallerSide;
        int newSide = (int) Math.sqrt(diffOfSquares);
        if (newSide * newSide != diffOfSquares) {
            throw new IllegalArgumentException(
                String.format("Cubes with sides %d and %d do not form a Pythagorean triple", this.getSide(), otherCube.getSide()));
        }
        return new Cube2(newSide);
    }

    public boolean equals(Cube2 otherCube) {
        return this.getSide() == otherCube.getSide() && this.getColor().equals(otherCube.getColor());
    }

    public String toString() {
        return "Cube{side=" + this.getSide() + ", color=\"" + this.getColor() + "\"}";
    }
}
