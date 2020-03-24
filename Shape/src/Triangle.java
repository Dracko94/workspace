//Calvin LaClair//
public class Triangle extends TwoDimensionalShape
{
	public Triangle (int coord_x, int coord_y, int side_Tri)
	{
		super(coord_x, coord_y, side_Tri, side_Tri);
	}
	
	public String getShape()
	{
		return "Triangle";
	}
	
	public void setSide_Tri(int side_Tri)
	{
		setDim_1(side_Tri);
		setDim_2(side_Tri);
	}
	
	public int getSide_Tri()
	{
		return getDim_1();
	}
	

	
	public String toString()
	{
		return String.format( "%s %s: %d\n", super.toString(), "Side", getSide_Tri());
	}
	
	public double getArea()
	{
		return .5* getSide_Tri() * getSide_Tri();
	}
}
