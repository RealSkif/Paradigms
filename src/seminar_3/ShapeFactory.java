package seminar_3;

class   Shapes{
    private ShapeFactory shapeFactory;

    public Shapes(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }
    public Shape makeShape(ShapeType type){
        return shapeFactory.createShape(type);
    }
}
class Shape { }

class Triangle extends Shape {}

class Square extends Shape {}

class Circle extends Shape {}

class ShapeFactory {
    public Shape createShape(ShapeType type) {
        Shape shape = null;
        switch (type) {
            case SQUARE -> {
                shape = new Square();
            }
            case TRIANGLE -> {
                shape = new Triangle();
            }
            case CIRCLE -> {
                shape = new Circle();
            }
        }
        return shape;
    }
}

enum ShapeType {
    SQUARE,
    CIRCLE,
    TRIANGLE
}
