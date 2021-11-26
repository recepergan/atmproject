package atmprojesi;

import java.util.ArrayList;
import java.util.List;

public class Bank extends CommonProperty {
	protected String bankName;
	protected String bankCityName;
	protected String bankkLogo;
	
	protected List<Havale> havale;
	protected List<Eft> eft;
	protected List<MoneyWallet> moneyList;
	
	public Bank() {
		moneyList = new ArrayList<MoneyWallet>();
		
		havale = new ArrayList<Havale>();
		
		havale.add(new Havale("1", "habvale10", "1000"));
		havale.add(new Havale("2", "habvale1020", "2000"));
		havale.add(new Havale("3", "habvale1030", "3000"));
		havale.add(new Havale("4", "habvale1040", "4000"));
		havale.add(new Havale("5", "habvale1050", "5000"));
		
		eft = new ArrayList<Eft>();
		eft.add(new Eft("6", "seft60", "6000"));
		eft.add(new Eft("7", "seft70", "6000"));
		eft.add(new Eft("8", "seft60", "6000"));
		eft.add(new Eft("9", "seft60", "6000"));
	}
	
	public Bank(String id, String bankName, String bankCityName, String bankkLogo) {
		super(id);
		this.bankName = bankName;
		this.bankCityName = bankCityName;
		this.bankkLogo = bankkLogo;
	}
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCityName=" + bankCityName + ", bankkLogo=" + bankkLogo + "]";
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCityName() {
		return bankCityName;
	}
	
	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}
	
	public String getBankkLogo() {
		return bankkLogo;
	}
	
	public void setBankkLogo(String bankkLogo) {
		this.bankkLogo = bankkLogo;
	}
	
	public List<Havale> getHavale() {
		return havale;
	}
	
	public void setHavale(List<Havale> havale) {
		this.havale = havale;
	}
	
	public List<Eft> getEft() {
		return eft;
	}
	
	public void setEft(List<Eft> eft) {
		this.eft = eft;
	}
	
	public List<MoneyWallet> getMoneyList() {
		return moneyList;
	}
	
	public void setMoneyList(List<MoneyWallet> moneyList) {
		this.moneyList = moneyList;
	}
	
}
