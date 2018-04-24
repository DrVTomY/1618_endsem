

public class Client {

	String uName,pass,add,dob;
	
	String Hall_type,Hall_Addon1,Hall_Addon2;
	int Hall_capacity;
	
	String Cat_type,Cat_Addon1,Cat_Addon2;
	int Cat_capacity;
	String trans_mode,trans_type;
	int trans_capacity,trans_quantity,TAX;
	
	
	public Client(String userName, String password, String address, String dob) {
		// TODO Auto-generated constructor stub
		this.uName = userName;
		this.pass = password;
		this.add = address;
		this.dob = dob;
	}
	
	

	public void BookHall(String Hall_type, int Hall_capacity, String Hall_Addon1, String Hall_Addon2) {
		// TODO Auto-generated method stub
		this.Hall_type = Hall_type;
		this.Hall_capacity = Hall_capacity;
		this.Hall_Addon1 = Hall_Addon1;
		this.Hall_Addon2 = Hall_Addon2;
	}
	
	public void Catering(String Cat_type, int Cat_capacity, String Cat_Addon1, String Cat_Addon2) {
		// TODO Auto-generated method stub
		this.Cat_type = Cat_type;
		this.Cat_capacity = Cat_capacity;
		this.Cat_Addon1 = Cat_Addon1;
		this.Cat_Addon2 = Cat_Addon2;
	}

	public void transport(String trans_mode, int trans_capacity, String trans_type, int trans_quantity) {
		// TODO Auto-generated method stub
		this.trans_mode = trans_mode;
		this.trans_capacity = trans_capacity;
		this.trans_type = trans_type;
		this.trans_quantity = trans_quantity;
	}

	public int Hall_Bill() {
		// TODO Auto-generated method stub
		int total_Hall_Bill =0 ;
		TAX=0;
		total_Hall_Bill = Hall_capacity * 100;
		
		TAX = (total_Hall_Bill/100)*9;
		total_Hall_Bill = total_Hall_Bill + TAX;
		
		System.out.println("---->Total Bill of Hall :"+total_Hall_Bill);
		return total_Hall_Bill;
	}

	public int Catering_Bill() {
		// TODO Auto-generated method stub
		int total_Cat_Bill =0 ;TAX=0;
		total_Cat_Bill = Cat_capacity * 300;
		
		TAX = (total_Cat_Bill/100)*11;
		total_Cat_Bill = total_Cat_Bill + TAX;
		
		System.out.println("---->Total Bill of Catering :"+total_Cat_Bill);
		return total_Cat_Bill;
	}

	public int transport_Bill() {
		// TODO Auto-generated method stub
		int total_trans_Bill =0 ;TAX=0;
		total_trans_Bill = (trans_capacity * 100) * trans_quantity;
		
		TAX = (total_trans_Bill/100)*18;
		total_trans_Bill = total_trans_Bill + TAX;
		
		System.out.println("---->Total Bill of transport :"+total_trans_Bill);
		return total_trans_Bill;		
	}
	
	public String getAddress() {
		return add;
	}
	public String getUserName() {
		return uName;
	}

	public String getPassword() {
		return pass;
	}

	public String getDob() {
		return dob;
	}

	public int Total_Bill() {
		// TODO Auto-generated method stub
		int total=0,disc=0;
		System.out.println("\n\n#####Total Bills of Services for "+getUserName()+"######");
		
		total = Hall_Bill() + Catering_Bill() +transport_Bill();
		System.out.println("#######Total Amount :"+total+"######");
		disc = (total/100)*4;
		total = total-disc;
		System.out.println("####Net payable amount by "+getUserName()+" is:"+total+"#######");
		return total;
	}

}
