//Calvin LaClair//
public abstract class ThreeDimensionalShape extends Shape
{
	int firstDimension;
	int secondDimension;
	int thirdDimension;
	
	public ThreeDimensionalShape(int coord_x, int coord_y, int dim_1, int dim_2, int dim_3)
	{
		super(coord_x, coord_y);
		firstDimension = dim_1;
		secondDimension = dim_2;
		thirdDimension = dim_3;
	}
	
	public void setDim_1(int firstDim)
	{
		firstDimension = firstDim;
	}
	
	public void setDim_2(int secondDim)
	{
		secondDimension = secondDim;
	}
	
	public void setDim_3(int thirdDim)
	{
		thirdDimension = thirdDim;
	}
	
	public int getDim_1()
	{	
		return firstDimension;
	}
	
	public int getDim_2()
	{
		return secondDimension;
	}
	
	public int getDim_3()
	{
		return thirdDimension;
	}
	
	public abstract double getArea();
	
	public abstract double getVolume();
}
