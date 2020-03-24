//Calvin LaClair//
public class Square extends TwoDimensionalShape
{
	public Square(int coord_x, int coord_y, int side_Sq)
	{
		super(coord_x, coord_y, side_Sq, side_Sq);
	}
	
	public String getShape()
	{
		return "Square";
	}
	
	public void setSide_Sq(int side_Sq)
	{
		setDim_1(side_Sq);
		setDim_2(side_Sq);
	}
	
	public int getSide_Sq()
	{
		return getDim_1();
	}
	
	public String toString()
	{
		return String.format( "%s %s: %d\n", super.toString(), "Side", getSide_Sq());
	}
	
	public double getArea()
	{
		return getSide_Sq() * getSide_Sq();
	}
}
