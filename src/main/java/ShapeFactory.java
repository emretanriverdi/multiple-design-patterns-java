class ShapeFactory {

    Shape create(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("c"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("s"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("r"))
            return new Rectangle();

        return null;
    }
}