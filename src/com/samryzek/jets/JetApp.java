package com.samryzek.jets;

import java.util.*;

public class JetApp {

	static Hangar h = new Hangar();
	static Barracks b = new Barracks();
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetApp ja = new JetApp();
		ja.run();
		Scanner kb = new Scanner(System.in);
		initialize();

		String menu;
		do {

			// menu
			System.out.println("Please select from the following menu: ");
			System.out.println("[1] List fleet");
			System.out.println("[2] View fastest jet in fleet");
			System.out.println("[3] View jet with longest range");
			System.out.println("[4] Add jet to fleet");
			System.out.println("[5] Quit");
			menu = kb.next();

			switch (menu) {
			case "1": {
				for (int i = 0; i < h.getJets().length; i++) {
					System.out.println(h.getJets()[i]);

				}
				break;
			}
			case "2": 
			{
				listFastest();
			}
			case "3": {
				// jet that flies the longest
			}

			case "4": {
				addJet();
				break;
			}

			case "5": {
				System.out.println("Thank you!");
				System.exit(0);
			}

			default:
				System.err.println("Not a valid entry");
				break;
			}
		} while (!menu.equals("5"));

	}

	public void run() {

	}

	public static void initialize() {
		Pilot[] pilot = new Pilot[5];
		pilot[0] = new Pilot("Chuck Yaeger", 56, 25);
		pilot[1] = new Pilot("Niel Armstrong", 45, 17);
		pilot[2] = new Pilot("Buzz Aldron", 35, 13);
		pilot[3] = new Pilot("Ford Awesome", 64, 38);
		pilot[4] = new Pilot("Alen Shephard", 56, 42);
		b.setPilots(pilot);

		JetsImpl[] jets = new JetsImpl[5];
		jets[0] = new JetsImpl("Boeing 777", 500, 3000, 100_000_000);
		jets[1] = new JetsImpl("F-18", 700, 2100, 65_000_000);
		jets[2] = new JetsImpl("C-5", 450, 3100, 175_000_000);
		jets[3] = new JetsImpl("F-4", 1200, 2300, 67_000_000);
		jets[4] = new JetsImpl("Mig 31", 1400, 3000, 78_000_000);
		h.setJets(jets);
	}

	public static void addJet() {
		System.out.println("Please add the model of the jet you would like to add.");
		String model = kb.next();
		System.out.println("Please add the speed of the jet in MPH.");
		double speed = kb.nextDouble();
		System.out.println("Please enter the range to the jet.");
		double range = kb.nextDouble();
		System.out.println("Please enter the price of the jet.");
		int price = kb.nextInt();

		JetsImpl jet = new JetsImpl(model, speed, range, price);
		h.addJet(jet);

	}
	
	public static void listFastest()
	{
		JetsImpl[] jetsTemp = h.getJets();
		JetsImpl fastestJet = jetsTemp[0];
		
		for (int i = 0; i < jetsTemp.length; i++)
		{
			if(fastestJet.getSpeed() < jetsTemp[i].getSpeed())
					{
						fastestJet = jetsTemp[i];
					}
		}
		
		
	}

}


