package com.samryzek.jets;
import java.util.*;

public class JetApp 
{
	
	static Hangar h = new Hangar();
	static Barracks b = new Barracks();
	Scanner kb = new Scanner(System.in);
	
	

	public static void main(String[] args) 
	{
		JetApp ja = new JetApp();
		ja.run();
		Scanner kb = new Scanner(System.in);
	
		
		Pilot[] pilot = new Pilot[5];
		pilot[0] = new Pilot("Chuck Yaeger", 56, 25);
		pilot[1] = new Pilot("Niel Armstrong", 45, 17);
		pilot[2] = new Pilot("Buzz Aldron", 35, 13);
		pilot[3] = new Pilot("Ford Awesome", 64, 38);
		pilot[4] = new Pilot("Alen Shephard", 56, 42);
		b.setPilots(pilot);
		
		JetsImpl[] jets = new JetsImpl[5];
		jets[0] = new JetsImpl("Boeing 777", 500, 3000, 100_000_000, pilot[0]);
		jets[1] = new JetsImpl("F-18", 700, 2100, 65_000_000, pilot[1]);
		jets[2] = new JetsImpl("C-5", 450, 3100, 175_000_000, pilot[2]);
		jets[3] = new JetsImpl("F-4", 1200, 2300, 67_000_000, pilot[3]);
		jets[4] = new JetsImpl("Mig 31", 1400, 3000, 78_000_000, pilot[4]);
		h.setJets(jets);
		
		menu: while(true)
		{
			//menu
			System.out.println("Please select from the following menu: ");
			System.out.println("[1] List fleet");
			System.out.println("[2] View fastest jet in fleet");
			System.out.println("[3] View jet with longest range");
			System.out.println("[4] Add jet to fleet");
			System.out.println("[5] Quit");
			String menu = kb.next();
			
		
		switch(menu)
		{
		case "1":
		{
			for (int i = 0; i < jets.length; i++)
			{
				System.out.println(jets[i]);
				
			}	break;
		}
		case "2":
		{
			
		}
		case "3":
		{
			//jet with longest range
		}
		
		case "4":
		{
			//add jet to fleet
		}
		
		case "5":
		{
			System.out.println("Thank you!");
			System.exit(0);
		}
		
		default:
			System.err.println("Not a valid entry");
			break;
	}


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

