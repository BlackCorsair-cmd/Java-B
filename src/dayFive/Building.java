package dayFive;

public class Building extends Object {
	
	private int numOfApartments;
	private int numberOfRentedApartments;
	
	/**
	 * 
	 * @param numOfApartments -> min value 10, max value 20. If less then 10 value is set to 10.
	 * @param numberOfRentedApartments min 0, max toatal number of apartments
	 */
	
	public Building(int numOfApartments, int numberOfRentedApartments) {
		super();
		if (numOfApartments < 10) {
			this.numOfApartments = 10;
			
		}
		this.numOfApartments = numOfApartments;
		this.numberOfRentedApartments = numberOfRentedApartments;
	
	}
/**
 * It accepts no arguments 
 * @return true if is no apartments available, false otherwise
 */
		public boolean areAllApartmentsOcupied() {
			
		if(numOfApartments == numberOfRentedApartments) {
			return true;
		} else {
			return false;
		}
	}

		public int getNumOfApartments() {
			return numOfApartments;
		}
		/*

		public void setNumOfApartments(int numOfApartments) {
			this.numOfApartments = numOfApartments;
		}
		*/
		public int getNumberOfRentedApartments() {
			return numberOfRentedApartments; // ova mi vraka broj na iznajmeni stanovi
		}

//		public void setNumberOfRentedApartments(int numberOfRentedApartments) {
//			this.numberOfRentedApartments = numberOfRentedApartments;
//		}



	}
	
	



