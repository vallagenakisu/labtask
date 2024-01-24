public class FactoryPatternDemo 
{
    public static void main(String[] args) 
    {
        ShapeFactory shapeFactory =  ShapeFactory.getInstance();
        shape shape1 = shapeFactory.getShape("CIRCLE");shape1.draw();
        shape shape2 = shapeFactory.getShape("RECTANGLE");shape2.draw();
        }        
}
