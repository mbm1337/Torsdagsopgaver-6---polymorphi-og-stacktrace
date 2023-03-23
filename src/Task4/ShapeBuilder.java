package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes = new ArrayList<>();
    public void addShapes(Shape s){
        shapes.add(s);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(Shape s : shapes){
           totalArea = totalArea + s.getArea();

        }
        return totalArea;
    }

}
