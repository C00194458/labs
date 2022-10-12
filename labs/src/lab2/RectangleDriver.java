package lab2;

public class RectangleDriver {

	public static void main(String[] args) {
		
		
		Rectangle rect = new Rectangle();
		
		rect.setLength(7);
		rect.setWidth(5);
		rect.setArea(rect.getArea());
		rect.setPerimter(rect.getPerimeter());
		
		System.out.println(rect.toString());	//Prints toString method
		
		rect.printRectangle();	//Prints printRectangle method	
		
		
		
		
		
		
		

	}

}
