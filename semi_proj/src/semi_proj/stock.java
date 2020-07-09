package SOO;

class stock {
	private static int noodle=100;
	private static int yuksu=100;
	private static int gomung_mu=100;
	private static int gomung_egg=100;
	private static int gomung_goggi=100;
	private static int gomung_oi=100;
	private static int hae=100;
	private static int goggi=100;
	private static int mandoo=100;	
	
	
	public int getNoodle() {
		return noodle;
	}
	public void setNoodle(int noodle) {
		this.noodle -= noodle;
	}
	public int getYuksu() {
		return yuksu;
	}
	public void setYuksu(int yuksu) {
		this.yuksu -= yuksu;
	}
	public int getGomung_mu() {
		return gomung_mu;
	}
	public void setGomung_mu(int gomung_mu) {
		this.gomung_mu -= gomung_mu;
	}
	public int getGomung_egg() {
		return gomung_egg;
	}
	public void setGomung_egg(int gomung_egg) {
		this.gomung_egg -= gomung_egg;
	}
	public int getGomung_goggi() {
		return gomung_goggi;
	}
	public void setGomung_goggi(int gomung_goggi) {
		this.gomung_goggi -= gomung_goggi;
	}
	public int getGomung_oi() {
		return gomung_oi;
	}
	public void setGomung_oi(int gomung_oi) {
		this.gomung_oi -= gomung_oi;
	}
	public int getHae() {
		return hae;
	}
	public void setHae(int hae) {
		this.hae -= hae;
	}
	public int getGoggi() {
		return goggi;
	}
	public void setGoggi(int goggi) {
		this.goggi -= goggi;
	}
	public int getMandoo() {
		return mandoo;
	}
	public void setMandoo(int mandoo) {
		this.mandoo -= mandoo;
	}
	

	
	
	public void getFinalStock() {
		System.out.println("면 재고량 : "+getNoodle());
		System.out.println("육수 재고량 : "+getYuksu());
		System.out.println("계란 재고량 : "+getGomung_egg());
		System.out.println("오이 재고량 : "+getGomung_oi());
		System.out.println("고기 재고량 : "+getGomung_goggi());
		System.out.println("무 재고량 : "+getGomung_mu());
		System.out.println("회 재고량 : "+getHae());
		System.out.println("만두 재고량 : "+getMandoo());
		System.out.println("숯불고기 재고량 : "+getGoggi());
	}
	
	public void calAddStock(int choice) {
		if(choice == 9) {
			setMandoo(1);
		}else if(choice ==10)
			setGoggi(1);
		}
	
}


