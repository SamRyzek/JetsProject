package com.samryzek.jets;

public class JetApp {
	
	Hangar h = new Hangar();
	Barracks b = new Barracks();
	
	

	public static void main(String[] args) {
		JetApp j = new JetApp();
		j.run();
	}
	
	public void run()
	{
		
	}
	
	public void initialize()
	{
		Pilot[] pilot = new Pilot[4];
		pilot[0] = new Pilot("name", 1, 1);
		pilot[1] = new Pilot("name", 1, 1);
		pilot[2] = new Pilot("name", 1, 1);
		pilot[3] = new Pilot("name", 1, 1);
		b.setPilots(pilot);
		
		JetsImpl[] jets = new JetsImpl[4];
		jets[0] = new JetsImpl("model", 1.0, 1.0, 1, pilot[0]);
		jets[1] = new JetsImpl("model", 1.0, 1.0, 1, pilot[1]);
		jets[2] = new JetsImpl("model", 1.0, 1.0, 1, pilot[2]);
		jets[3] = new JetsImpl("model", 1.0, 1.0, 1, pilot[3]);
		h.setJets(jets);
	}
}	

//Jet [] tempList = h.getJets();
//for(int i = 0; i< h.getJets().length; i++) {
//	
//	
//	System.out.println(h.getJets()[i]);

