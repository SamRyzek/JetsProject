package com.samryzek.jets;

public class Hangar {


	public JetsImpl[] getJets() {
		return jets;
	}

	public void setJets(JetsImpl[] jets) {
		this.jets = jets;
	}

	public Hangar() 
	{
		jets = new JetsImpl[4];
	}
	
	JetsImpl [] jets;
	
	void addJet(JetsImpl jets)
	{
		
	}

}
