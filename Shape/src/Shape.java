// Calvin LaClair //
public abstract class Shape 
{
	int coord_x;
	int coord_y;

	public Shape (int coord_x, int coord_y)
	{
		this.coord_x = coord_x;
		this.coord_y = coord_y;
	}
	
	public void setcoordinateX(int coord_x)
	{
		this.coord_x = coord_x;
	}
	
	public void setcoordinateY(int coord_y)
	{
		this.coord_y = coord_y;
	}
	
	public int getcoordinateX()
	{
		return coord_x;
	}
	
	public int getcoordinateY()
	{
		return coord_y;
	}
	
	public String toString()
	{
		return String.format("(%d, %d)", getcoordinateX(), getcoordinateY());
	}
	
	public abstract String getShape();
}
	
	