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
			System.out.println("[2] List Pilots");
			System.out.println("[3] View fastest jet in fleet");
			System.out.println("[4] View jet with longest range");
			System.out.println("[5] Add jet to fleet");
			System.out.println("[6] Hire a pilot");
			System.out.println("[7] Quit");
			menu = kb.nextLine();

			// switch takes user through the various menu options
			switch (menu) {
			case "1":
			// case 1 lists the fleet of jets
			{
				for (int i = 0; i < h.getJets().length; i++) {
					System.out.println(h.getJets()[i]);
				}
				break;
			}
			case "2": {
			// case 2 lists available pilots
				for (int i = 0; i < b.getPilots().length; i++) {
					System.out.println(b.getPilots()[i]);
				}
				break;

			}
			case "3": {
			// case 3 lists fastest jet
				listFastest();
				break;
			}
			case "4": {
			// case 4 lists jet with longest range
				listLongest();
				break;

			}
			// case 5 adds a jet to corresponding array and to the hangar
			//also add a pilot to the barracks
			case "5": {
				addJet();
				break;
			}
			// case 6, stand-alone option to add pilot to the barracks
			case "6": {
				addPilot();
				break;
			}
			
			//case 7 allows user to quit program
			case "7": {
				System.out.println("Thank you!");
				System.exit(0);

			}
			
			// default for invalid entry
			default:
				System.err.println("Not a valid entry");
				break;
			}
		} while (!menu.equals("7")); //continues menu option until 7 is selected
		
		kb.close(); //Scanner closed
	}

	public void run() {

	}

	public static void initialize() {
		Pilot[] pilot = new Pilot[5]; //pilot array built
		pilot[0] = new Pilot("Chuck Yaeger", 56, 25);
		pilot[1] = new Pilot("Niel Armstrong", 45, 17);
		pilot[2] = new Pilot("Buzz Aldron", 35, 13);
		pilot[3] = new Pilot("Ford Awesome", 64, 38);
		pilot[4] = new Pilot("Alen Shephard", 56, 42);
		b.setPilots(pilot);

		JetsImpl[] jets = new JetsImpl[5]; //jet array built
		jets[0] = new JetsImpl("Boeing 777", 500, 3000, 100_000_000);
		jets[1] = new JetsImpl("F-18", 700, 2100, 65_000_000);
		jets[2] = new JetsImpl("C-5", 450, 3100, 175_000_000);
		jets[3] = new JetsImpl("F-4", 1200, 2300, 67_000_000);
		jets[4] = new JetsImpl("Mig 31", 1400, 3000, 78_000_000);
		h.setJets(jets);

		// create an array of ints to track what indexes where used
		int[] indexes = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < h.getJets().length; i++) // iterate over the jets array
		{
			// create boolean to determine if we must continue to search for a random number
			boolean keepSearching = true;
			do {
				// generate random number
				int random = (int) (Math.random() * pilot.length);
				// check indexes array using "random" as the "index" to see the value
				// if the value is 0 then we know that the index was not used
				if (indexes[random] == 0) {
					// use "random" as in index to grab a pilot out of the pilot array
					Pilot p = pilot[random];

					// get jets list from hangar
					JetsImpl[] j = h.getJets();

					// set the current indexes ("i") pilot to the pilot that you received from the
					// array
					j[i].setPilot(p);

					// set the "random" index in the indexes array to 0 so it is not used again
					indexes[random] = 1;

					// set keepSearching to false so we do not keep searching for another random
					// number
					keepSearching = false;
				}
			} while (keepSearching);
		}
	}

	public static void addJet() //user prompted to add jet to the fleet
	{
		System.out.println("Please add the model of the jet you would like to add.");
		String model = kb.next();
		System.out.println("Please add the speed of the jet in MPH.");
		double speed = kb.nextDouble();
		System.out.println("Please enter the range to the jet.");
		double range = kb.nextDouble();
		System.out.println("Please enter the price of the jet.");
		int price = kb.nextInt();

		JetsImpl jet = new JetsImpl(model, speed, range, price);
		Pilot p = addPilot();
		jet.setPilot(p);
		h.addJet(jet);

	}

	public static Pilot addPilot() //user is prompted to "hire" a pilot
	{
		System.out.println("Please add the name of the pilot you would like to add.");
		String name = kb.nextLine();
		System.out.println("Please add the age of the pilot.");
		double age = kb.nextDouble();
		System.out.println("Please enter the experience of the pilot.");
		double experience = kb.nextDouble();

		Pilot pilot = new Pilot(name, age, experience);
		b.addPilot(pilot); //add pilot to barracks

		return pilot;

	}

	public static void listFastest() //this will list the fastest jet in the fleet
	{
		JetsImpl[] jetsTemp = h.getJets(); //jetsTemp is a new object created
		JetsImpl fastestJet = jetsTemp[0]; //fastest jet is initiated to the first element of the array

		for (int i = 0; i < jetsTemp.length; i++)  // standard array for loop
		{
			if (fastestJet.getSpeed() < jetsTemp[i].getSpeed()) //if statement cycles through array
											//and compares elements and their speed looking for the 
											//fastest.
			{
				fastestJet = jetsTemp[i]; //assigns the fastest jet to the member of the array that was 
										//was determined to be the fastest
			}
		}
		System.out.println(fastestJet); //prints out fastest jet
	}

	public static void listLongest() //same approach as looking for the fastest jet
	{
		JetsImpl[] jetsTemp = h.getJets();
		JetsImpl longestJet = jetsTemp[0];

		for (int i = 0; i < jetsTemp.length; i++) {
			if (longestJet.getRange() < jetsTemp[i].getRange()) {
				longestJet = jetsTemp[i];
			}
		}

		System.out.println(longestJet);
	}

}
