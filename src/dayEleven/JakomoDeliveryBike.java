package dayEleven;

public abstract class JakomoDeliveryBike implements IDeliverybike, IBike {
	
	@Override
	public int getCurrentConsumption() {
		return 10;
	}

  public abstract String getTotalPayment(int numberOfPicas);
  
	

}
