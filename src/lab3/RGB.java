package lab3;
public class RGB 
{
	private int r_value;
	private int g_value;
	private int b_value;
	
	public RGB(int r, int g, int b)
	{
		this.r_value = r;
		this.g_value = g;
		this.b_value = b;
	}

	public int getr_value() 
	{
		return r_value;
	}
	public void setr_value(int r_value) 
	{
		this.r_value = r_value;
	}
	public int getg_value() 
	{
		return g_value;
	}
	public void setg_value(int g_value) 
	{
		this.g_value = g_value;
	}
	public int getb_value() 
	{
		return b_value;
	}
	public void setValue_B(int b_value) 
	{
		this.b_value = b_value;
	}
	@Override
	public String toString() {
		return "Wartosci: RED=" + r_value + ", GREEN=" + g_value + ", Blue=" + b_value;
	}
	
}
