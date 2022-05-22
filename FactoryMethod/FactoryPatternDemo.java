public class FactoryPatternDemo {

    public static void main(String[] args) {
       ShapeFactory shapeFactory = new ShapeFactory();
 
       //get an object of Circle and call its area method.
       Shape cercle = shapeFactory.getShape("CERCLE");
 
       //call area method of Circle
       cercle.area();
 
       //get an object of Rectangle and call its area method.
       Shape rectangle = shapeFactory.getShape("PYRAMID");
 
       //call area method of Rectangle
       rectangle.area();
 
       //get an object of Square and call its area method.
       //Shape carre = shapeFactory.getShape("CARRE");
 
       //call area method of square
       //carre.area();
    }
}
