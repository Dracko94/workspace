//Calvin LaClair//
public class ShapeTest 
{
	public static void main(String args[])
	{
		Shape shapes_Geo[] = new Shape[6];
		shapes_Geo[0] = new Circle(25, 50, 16);
		shapes_Geo[1] = new Square(21, 15, 19);
		shapes_Geo[2] = new Triangle(15, 12, 22);
		shapes_Geo[3] = new Sphere(30, 55, 21);
		shapes_Geo[4] = new Cube(26, 20, 34);
		shapes_Geo[5] = new Tetrahedron(20, 17, 27);
	
	
		for(Shape currentShape : shapes_Geo)
		{
			System.out.printf( "%s: %s",  currentShape.getShape(), currentShape);
		
			if(currentShape instanceof TwoDimensionalShape)
			{
				TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) currentShape;
			
				System.out.printf("%s's Area Equals %s \n", currentShape.getShape(), twoDimensionalShape.getArea());
			}
			
			if(currentShape instanceof ThreeDimensionalShape)
			{
				ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) currentShape;
			
				System.out.printf("%s's Area is %s\n", currentShape.getShape(), threeDimensionalShape.getArea());
				System.out.printf("%s's volume is %s\n", currentShape.getShape(), threeDimensionalShape.getVolume());
			}
			System.out.println();
		}
	}
}