package atmprojesi;

public class Havale extends CommonProperty {
	private String havaleSerial;
	private String havaleAmount;
	
	public Havale() {
		
	}
	
	public Havale(String id, String havaleSerial, String havaleAmount) {
		super(id);
		this.havaleSerial = havaleSerial;
		this.havaleAmount = havaleAmount;
	}
	
	@Override
	public String toString() {
		return "Havale [havaleSerial=" + havaleSerial + ", havaleAmount=" + havaleAmount + ", getId()=" + getId()
				+ ", getDate()=" + getDate() + "]";
	}
	
	public String getHavaleSerial() {
		return havaleSerial;
	}
	
	public void setHavaleSerial(String havaleSerial) {
		this.havaleSerial = havaleSerial;
	}
	
	public String getHavaleAmount() {
		return havaleAmount;
	}
	
	public void setHavaleAmount(String havaleAmount) {
		this.havaleAmount = havaleAmount;
	}
	
}
