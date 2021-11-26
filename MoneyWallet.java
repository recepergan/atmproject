package atmprojesi;

import java.util.Scanner;

public class MoneyWallet extends CommonProperty implements IBankMethods {
	
	protected String moneyType;
	protected String moneyCurrency;
	protected double moneyAmount;
	
	protected Bank bank;
	
	public MoneyWallet() {
		this.moneyAmount = 0.0;
	}
	
	public MoneyWallet(String id, String moneyType, String moneyCurrency, double moneyAmount) {
		super(id);
		this.moneyType = moneyType;
		this.moneyCurrency = moneyCurrency;
		this.moneyAmount = moneyAmount;
	}
	
	@Override
	public String toString() {
		return "MoneyWallet [moneyType=" + moneyType + ", moneyCurrency=" + moneyCurrency + ", moneyAmount="
				+ moneyAmount + ", bank=" + bank + ", getId()=" + getId() + ", getDate()=" + getDate() + "]";
	}
	
	// method
	public String scannerValue() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");
		System.out.println("1-)Para Görüntüle\n 2-)Para yatır\n 3 -)Para Çekme\n4-)Eft göndermek\n"
				+ "5-)HAvale gönder\n6-)Mail gönder\n7-)çıkış");
		String chooice = klavye.nextLine();
		return chooice;
	}
	
	public void allMethod() {
		Bank bank = new Bank("1", "Halkbank", "İsstanbul", "ksğıt");
		MoneyWallet moneyWallet = new MoneyWallet("45", "kağıt", MoneyCurrency.TR.name(), 250000.0);
		moneyWallet.setBank(bank);
		
		String key = "1";
		while ((Integer.valueOf(key)) != 0) {
			key = scannerValue();
			switch (key) {
				case "1": {
					showMoney();
					break;
				}
				case "2": {
					addMoney(14000.0);
					break;
				}
				case "3": {
					reduceMoney(3000.0);
					break;
				}
				case "4": {
					sendEftMoney(1000.0);
					break;
				}
				case "5": {
					sendHavaleMoney(500.0);
					break;
				}
				case "6": {
					fakeMail("mailadresiniz@gmail.com");
					break;
				}
				case "7": {
					fakeMail("Çıkış yapılıyor");
					break;
				}
				default:
					System.out.println("Lütfen belirtilen sayıyı giriniz");
					break;
				
			}
		}
		
	}
	
	// getter setter
	
	public String getMoneyType() {
		return moneyType;
	}
	
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}
	
	public String getMoneyCurrency() {
		return moneyCurrency;
	}
	
	public void setMoneyCurrency(String moneyCurrency) {
		this.moneyCurrency = moneyCurrency;
	}
	
	public double getMoneyAmount() {
		return moneyAmount;
	}
	
	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public void showMoney() {
		System.out.println("paranzın tp tu :" + this.moneyAmount);
		
	}
	
	@Override
	public void addMoney(double money) {
		this.moneyAmount += money;
		
	}
	
	@Override
	public void reduceMoney(double money) {
		if (moneyAmount > 0) {
			this.moneyAmount -= money;
		} else {
			System.out.println("bakiyeniz 0 tl paranız yoktur");
		}
		
	}
	
	@Override
	public void sendHavaleMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.havale) {
			System.out.println(temp);
		}
		moneyAmount = (moneyAmount - money);
	}
	
	@Override
	public void sendEftMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.eft) {
			System.out.println(temp);
		}
		System.out.println(+money + "kadar eft gönderildi");
		System.out.println("paranız gönderiliyor");
		
	}
	
	@Override
	public void fakeMail(String emailAddress) {
		// TODO Auto-generated method stub
		
	}
	
}
