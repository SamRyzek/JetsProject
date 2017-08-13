package com.samryzek.jets;

public class Barracks {

	Pilot[] pilots;

	public Barracks() //initiates new barracks array of pilots
	{
		pilots = new Pilot[4];
	}
	
	//sets and gets
	public Pilot[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}
	
	//method to add pilot to the barracks - ties to JetApp
	public void addPilot(Pilot pilot) {
		Pilot[] pilotTemp = new Pilot[pilots.length + 1]; // creates new temporary list this is one size bigger
		for (int i = 0; i < pilots.length; i++)// iterate through the old list storing the values of the old list into
												// the new list
		{
			pilotTemp[i] = pilots[i];
		}
		pilotTemp[pilotTemp.length - 1] = pilot;// sets the last index to the new jet
		pilots = pilotTemp; // points jets to the new array
	}

}
