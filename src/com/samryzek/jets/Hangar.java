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
	

	public void addJet(JetsImpl jet) 
	{
		JetsImpl[] jetsTemp = new JetsImpl[jets.length + 1]; //creates new temporary list this is one size bigger
		for (int i = 0; i < jets.length; i++)//iterate through the old list storing the values of the old list into the new list
		{
			jetsTemp[i] = jets[i]; 
		}
		jetsTemp[jetsTemp.length - 1] = jet;//sets the last index to the new jet
		jets = jetsTemp; //points jets to the new array 
	}

}
