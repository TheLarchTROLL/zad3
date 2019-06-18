package lab3;

public class RGBController {
	
	public RGB inicjuj(int r, int g, int b)
	{
		return new RGB(r, g, b);
	}

	public RGB zmieszaj(RGB i, RGB n)
	{
		RGB wynik = new RGB((i.getr_value()+n.getr_value())/2,(i.getg_value()+n.getg_value())/2,(i.getb_value()+n.getb_value())/2);
		return wynik;
	}
	public void wyswietl(RGB kolor)
	{
		System.out.println(kolor.toString());
	}
	public RGBController()
	{
		
	}
	
}
