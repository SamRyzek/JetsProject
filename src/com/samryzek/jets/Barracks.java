package com.samryzek.jets;

public class Barracks {

	Pilot[] pilots;

	public Barracks() {
		pilots = new Pilot[4];
	}

	public Pilot[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}

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
