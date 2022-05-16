import java.util.Scanner;
public class Paper 
{
	private float width, height;

	 Paper() throws Exception  {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("¬ведите высоту листа бумаги: ");
			float h = scan.nextFloat();
			
			System.out.print("¬ведите ширину листа бумаги: ");
			float w = scan.nextFloat();
			scan.close();
			if (w <= 0 ||  h <= 0) 
			{
				throw new Exception();
			}
			else {
				this.height = h;
				this.width = w;
			}
		}
		catch (Exception e)
		{
			System.out.print("¬водимые значени€ должны быть положительными");
			this.height = 5;
			this.width = 10.5f;
		}
		
	}
	
	Paper(float newHeight, float newWidth) 
	{
		this.height = newHeight;
		this.width = newWidth;
						
		try {
			if (newWidth <= 0 ||  newHeight <= 0) 
			{
				throw new Exception();
			}
			else 
			{
				this.height = newHeight;
				this.width = newWidth;
			}
		}
		
		catch (Exception e)
		{
			System.out.print("¬водимые значени€ должны быть положительными");
		}
	}
	
	

	public float getWidth() 
	{
		return width;
	}

	public void setWidth(float newWidth) 
	{
		this.width = newWidth;
		
		try 
		{
			if (newWidth <= 0) 
			{
				throw new Exception();
			}
			else 
			{
				this.width = newWidth;
			}
		}
		
		catch (Exception e)
		{
			System.out.print("¬водимые значени€ должны быть положительными");
		}
	}
	
	public float getHeight() 
	{
		return height;
	}

	public void setHeight(float newHeight) 
	{
		this.height = newHeight;
		
		try {
			if (newHeight <= 0) 
			{
				throw new Exception();
			}
			else 
			{
				this.height = newHeight;
			}
		}
		
		catch (Exception e)
		{
			System.out.print("¬водимые значени€ должны быть положительными");
		}
	}

	public float area() 
	{
		return this.height * this.width;
	}
}