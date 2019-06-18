package lab3;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args)
	{	
		RGBController con1 = new RGBController();
		RGB zielony = con1.inicjuj(0, 255, 0);	
		RGB niebieski = con1.inicjuj(0, 0, 255);
		RGB czerwony = con1.inicjuj(255, 0, 0);
		RGB cyjan = con1.zmieszaj(niebieski, zielony);
		RGB purpurowy = con1.zmieszaj(niebieski, czerwony);
		RGB zolty = con1.zmieszaj(zielony, czerwony);
		System.out.println("purpurowy: ");
		con1.wyswietl(purpurowy);
		System.out.println("zolty: ");
		con1.wyswietl(zolty);
		System.out.println("cyjan: ");
		con1.wyswietl(cyjan);
	}

}
