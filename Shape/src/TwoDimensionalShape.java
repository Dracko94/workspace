//Calvin LaClair//
public abstract class TwoDimensionalShape extends Shape
{
	int firstDimension;
	int secondDimension;
	
	public TwoDimensionalShape( int coord_x, int coord_y, int dim_1, int dim_2)
	{
		super(coord_x, coord_y);
		firstDimension = dim_1;
		secondDimension = dim_2;
	}
	
	public void setDim_1(int firstDim)
	{
		firstDimension = firstDim;
	}
	
	public void setDim_2(int secondDim)
	{
		secondDimension = secondDim;
	}
	
	public int getDim_1()
	{	
		return firstDimension;
	}
	
	public int getDim_2()
	{
		return secondDimension;
	}
	
	public abstract double getArea();

}
