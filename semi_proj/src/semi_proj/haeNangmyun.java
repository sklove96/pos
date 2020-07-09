package SOO;

class haeNangmyun extends Nangmyun{
//	private static int sasimi = 100;
//	private final int SASIMI_PRICE = 7000;
//	private int sasimi_suryang =0;
//	private int sasimi_benefit = 0;
	
	private int haeSBenefit = 0;
	private int haeMBenefit = 0;
	private int haeLBenefit = 0;
	private int totalHaeBenefit = 0;
	
	haeNangmyun(int choice) {
		super(choice);
		calComStock(choice);
		//setHae(suryang);
//		this.sasimi -= suryang;
	}
	
//	public void displaySasimiStock() {
//		displayStock();
//		System.out.println("회 재고량 : "+sasimi);
//	}
	
//	public void displaySasimiBenefit() {
//		sasimi_benefit = SASIMI_PRICE*sasimi_suryang;
//		System.out.println("회냉면 총 이윤 : "+sasimi_benefit);
//	}

//	@Override
//	public void displayStock() {
//		super.displayStock();
//		System.out.println("회 재고량 : "+sasimi);
//	}

	public void HaeBenefit(int choice) {
		
		if(choice == 6) {
			haeSBenefit +=7000;
		}else if(choice == 7) {
			haeMBenefit +=7500;
		}else if(choice ==8) {
			haeLBenefit +=8000;
		}
		
	}
	
	public void displayHaeBenfit() { // 물냉면 총이익
		totalHaeBenefit = (getHaeSBenefit() + getHaeMBenefit() + getHaeLBenefit());
	}

	public int getHaeSBenefit() {
		return haeSBenefit;
	}

	public int getHaeMBenefit() {
		return haeMBenefit;
	}

	public int getHaeLBenefit() {
		return haeLBenefit;
	}

	public int getTotalHaeBenefit() {
		return totalHaeBenefit;
	}
}
