//Calvin LaClair//
public class Tetrahedron extends ThreeDimensionalShape
{
	public Tetrahedron(int coord_x, int coord_y, int side_Tet)
	{
		super(coord_x, coord_y, side_Tet, side_Tet, side_Tet);
	}
	public String getShape()
	{
		return "Tetrahedron";
	}
	
	public void setSide_Tet(int side_Tet)
	{
		setDim_1(side_Tet);
		setDim_2(side_Tet);
		setDim_3(side_Tet);
	}
	
	public int getSide_Tet()
	{
		return getDim_1();
	}
	
	public String toString()
	{
		return String.format("%s %s: %d\n", super.toString(), "Side", getSide_Tet());
	}
	
	public double getArea()
	{
		return (int) (1.73205 * getSide_Tet() * getSide_Tet());
	}
	
	public double getVolume()
	{
		return (int) (.117851 * getSide_Tet() * getSide_Tet() * getSide_Tet());
	}
}