//Calvin LaClair//
public class Circle extends TwoDimensionalShape
{
	public Circle(int coord_x, int coord_y, int radius_Cir)
	{
		super(coord_x, coord_y, radius_Cir, radius_Cir);
	}

	public String getShape()
	{
		return "Circle";
	}
	
	public void setRadius(int radius)
	{
		setDim_1(radius);
		setDim_2(radius);
	}
	
	public int getRadius()
	{
		return getDim_1();
	}
	
	public String toString()
	{
		return String.format( "%s %s: %d\n", super.toString(), "Radius", getRadius());
	}
	
	public double getArea()
	{
		return (int)
				(Math.PI * getRadius() * getRadius() );
	}
}

