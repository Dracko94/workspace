//Calvin LaClair//
public class Cube extends ThreeDimensionalShape
{
	public Cube(int coord_x, int coord_y, int side_Cu)
	{
		super(coord_x, coord_y, side_Cu, side_Cu, side_Cu);
	}
	public String getShape()
	{
		return "Cube";
	}
	
	public void setSide_Cu(int side_Cu)
	{
		setDim_1(side_Cu);
		setDim_2(side_Cu);
		setDim_3(side_Cu);
	}
	
	public int getSide_Cu()
	{
		return getDim_1();
	}
	
	public String toString()
	{
		return String.format("%s %s: %d\n", super.toString(), "Side", getSide_Cu());
	}
	
	public double getArea()
	{
		return (int) (6 * getSide_Cu() * getSide_Cu());
	}
	
	public double getVolume()
	{
		return (int) (getSide_Cu() * getSide_Cu() * getSide_Cu());
	}
}
