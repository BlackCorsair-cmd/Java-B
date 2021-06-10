package dayEleven;

public class TestBike {

	public static void main(String[] args) {
		BlueJakomoDeliveryBike b4 = new BlueJakomoDeliveryBike();
		b4.thisIsSomethingSpecial();
		
		JakomoDeliveryBike b3 = new BlueJakomoDeliveryBike();
		b3.getTotalPayment(2);
		
		IDeliverybike b2 = new BlueJakomoDeliveryBike();
		b2.getCurrentLoad();
		
		IBike b1 = new BlueJakomoDeliveryBike();
		b1.ride();

	}

}
