package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {
    ShapeBuilder shapeBuilder;

    @BeforeEach
    void setUp() {
        Square s1 = new Square(7);  //49
        Square s2 = new Square(4); // 16
        Square s3 = new Square(5);  //25

        Circle c1 = new Circle(3); // 28,26
        Circle c2 = new Circle(6); //113,04
        Circle c3 = new Circle(2); // 12,56

        shapeBuilder = new ShapeBuilder();

        shapeBuilder.addShapes(c1);
        shapeBuilder.addShapes(c2);
        shapeBuilder.addShapes(c3);
        shapeBuilder.addShapes(s1);
        shapeBuilder.addShapes(s2);
        shapeBuilder.addShapes(s3);


    }

    @Test
    void getTotalArea() {
        assertTrue(shapeBuilder.getTotalArea() == 243.86 );
        System.out.println(shapeBuilder.getTotalArea());
    }
}