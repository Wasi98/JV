package My_Access;

class MountainBike extends Bicycle implements Comparable<MountainBike> {
	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed,int startGear) {
		super(startSpeed, startGear);
		seatHeight = startHeight;
	}
	
	public void setNewHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public int compareTo(MountainBike mbike) {
	      return this.seatHeight - mbike.seatHeight;
	}
	

}
