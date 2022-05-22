public class ShapeFactory {
	
    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
       if(shapeType == null){
          return null;
       }		
       if(shapeType.equalsIgnoreCase("CERCLE")){
          return new Circle();
          
       } else if(shapeType.equalsIgnoreCase("PYRAMID")){
          return new Pyramid();
          
       } else if(shapeType.equalsIgnoreCase("CARRE")){
          return new Square();
       }
       
       return null;
    }
}