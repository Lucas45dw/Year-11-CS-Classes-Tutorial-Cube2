
public class Cube {
    private int side;

    public Cube(){
        this.side = 1;
    }

    public Cube(int side){
        setSide(side);
    }




    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length must be greater or equal to 1!");
        }else{
            this.side = side;
    }

            
    }
    public int calculateSurfaceArea(){
        return 6 * side * side;
    }
    public int calculateVolume(){
        return side * side * side;
    }
    public String toString(){
        return "Side Length:" + side + " Surface Area: " + calculateSurfaceArea() + " Volume: " + calculateVolume();
    }
}
