//Calvin LaClair//
public class Sphere extends ThreeDimensionalShape
{
	public Sphere(int coord_x, int coord_y, int radius_Sph)
	{
		super(coord_x, coord_y, radius_Sph, radius_Sph, radius_Sph);
	}
	
	public String getShape()
	{
		return "Sphere";
	}
	
	public void setRadius_Sph(int radius_Sph)
	{
		setDim_1(radius_Sph);
		setDim_2(radius_Sph);
		setDim_3(radius_Sph);
	}
	
	public int getRadius_Sph()
	{
		return getDim_1();
	}
	
	public String toString()
	{
		return String.format("%s %s: %d\n",  super.toString(), "Radius", getRadius_Sph());
	}
	
	public double getArea()
	{
		return(int) (4 * Math.PI * getRadius_Sph() * getRadius_Sph());
	}
	
	public double getVolume()
	{
		return (int) (4.0 / 3.0 * Math.PI * getRadius_Sph() * getRadius_Sph() * getRadius_Sph());
	}
}
