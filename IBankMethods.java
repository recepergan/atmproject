package atmprojesi;

public interface IBankMethods {
	
	public void showMoney();
	
	public void addMoney(double money);
	
	public void reduceMoney(double money);
	
	public void sendHavaleMoney(double money);
	
	public void sendEftMoney(double money);
	
	public void fakeMail(String eMailAdres);
}
