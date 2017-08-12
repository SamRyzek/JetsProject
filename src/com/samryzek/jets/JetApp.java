package com.samryzek.jets;
import java.util.*;

public class JetApp {
	
	static Hangar h = new Hangar();
	static Barracks b = new Barracks();
	Scanner kb = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		JetApp ja = new JetApp();
		ja.run();
		Scanner kb = new Scanner(System.in);
		
		//menu
		System.out.println("Please select from the following menu: ");
		System.out.println("1. List fleet");
		System.out.println("2. View fastest jet in fleet");
		System.out.println("3. View jet with longest range");
		System.out.println("4. Add jet to fleet");
		System.out.println("5. Quit");
		
		
		Pilot[] pilot = new Pilot[4];
		pilot[0] = new Pilot("Chuck Yaeger", 56, 25);
		pilot[1] = new Pilot("Niel Armstrong", 45, 17);
		pilot[2] = new Pilot("Buzz Aldron", 35, 13);
		pilot[3] = new Pilot("Ford Awesome", 64, 38);
		b.setPilots(pilot);
		
		JetsImpl[] jets = new JetsImpl[4];
		jets[0] = new JetsImpl("Boeing 777", 500, 3000, 110, pilot[0]);
		jets[1] = new JetsImpl("F-18", 700, 2100, 65, pilot[1]);
		jets[2] = new JetsImpl("C-5", 450, 3100, 175, pilot[2]);
		jets[3] = new JetsImpl("F-4", 1200, 2300, 67, pilot[3]);
		h.setJets(jets);
		
		for(int i = 0; i < jets.length ; i++)
		{
			System.out.println(jets[i]);
		}
		
		for(int j = 0; j < pilot.length; j++)
		{
			System.out.println(pilot[j]);
		}
		
	}
	
	public void run()
	{
		
	}
	

}	

//Jet [] tempList = h.getJets();
//for(int i = 0; i< h.getJets().length; i++) {
//	
//	
//	System.out.println(h.getJets()[i]);

