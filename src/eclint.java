
public class eclint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = new Client("suresh","passpass","panaji","21-06-1995");
		
		client.BookHall("large Hall",300,"music","light");
		client.Catering("non-Veg",300,"cake","Soup");
		client.transport("Bus",50,"AC",6);
		
		client.Hall_Bill();
		client.Catering_Bill();
		client.transport_Bill();
		
		client.Total_Bill();

	}

}
