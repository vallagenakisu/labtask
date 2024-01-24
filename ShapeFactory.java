public class ShapeFactory
{
    private static ShapeFactory ins = null;
    private ShapeFactory(){};
    public static ShapeFactory getInstance ( )
    {
        if(ins == null)
        ins = new ShapeFactory();
        return ins;
    }
    public shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new square();
        }
        return null;
    }
}