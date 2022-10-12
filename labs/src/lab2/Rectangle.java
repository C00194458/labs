package lab2;

//Name: Jamie O'Brien
//Student ID: C00194458
//Purpose: Lab sheet 2b

public class Rectangle {
	
	
	//Variables
	int length;
	int width;
	int area;
	int perimeter;
	
	//Constructors
	public Rectangle() {
		setLength(1); 	//default length to 1
		setWidth(1);	//default width to 1		
	}
	
	//Getters & Setters
	
	//length & Width
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if (length > 0 && length <= 40) {
			this.length = length;
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if (width > 0 && width <=40) {
			this.width = width;
		}
		
	}
	
	//area & perimeter (Q2)

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = length*width;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimter(int perimeter) {
		this.perimeter = 2*(length + width);
	}
	
	//printRectangle (Q3)
	
	public void printRectangle() {
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == length || j == 1 || j == width)
					System.out.print("*");
				else 
					System.out.print(" ");
				}
			System.out.println();	
		}
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
	

	



}
