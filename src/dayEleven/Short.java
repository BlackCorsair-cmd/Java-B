package dayEleven;

public class Short extends JakomoDeliveryBike implements IBike, IDeliverybike {

	@Override
	public int getCurrentLoad() {
		return 0;
	}

	@Override
	public int getNumeOfEmptySLotsInBasker() {
		return 0;
	}

	@Override
	public int ride() {
		return 0;
	
	}

	@Override
	public String getTotalPayment(int numberOfPicas) {
		return null;	
}

}
