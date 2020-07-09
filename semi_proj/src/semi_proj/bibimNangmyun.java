package SOO;

class bibimNangmyun extends Nangmyun{
	private int bibimSBenefit = 0;
	private int bibimMBenefit = 0;
	private int bibimLBenefit = 0;
	private int totalBibimBenefit = 0;

	//private final int BIBIM_PRICE = 6500;
	//private int bibim_suryang=0;
	//private int bibim_benefit =0;
	
	
	bibimNangmyun(int choice){
		super(choice);
		calComStock(choice);
		//bibim_suryang += suryang;
	}
	
//	public void displayBibimStock() {
//		displayStock();
//	}
	
	public void BibimBenefit(int choice) {
		
		if(choice == 3) {
			bibimSBenefit +=6000;
		}else if(choice ==4) {
			bibimMBenefit +=6500;
		}else if(choice ==5) {
			bibimLBenefit +=7000;
		}
		
	}
	
	public void displayBibimBenfit() { // 비빔냉면 총이익
		totalBibimBenefit = (getBibimSBenefit() + getBibimMBenefit() + getBibimLBenefit());
	}
	
	public int getBibimSBenefit() {
		return bibimSBenefit;
	}

	public int getBibimMBenefit() {
		return bibimMBenefit;
	}

	public int getBibimLBenefit() {
		return bibimLBenefit;
	}

	public int getTotalBibimBenefit() {
		return totalBibimBenefit;
	}
	

	
//	public void displayBibimBenefit() {
//		bibim_benefit = BIBIM_PRICE*bibim_suryang;
//		System.out.println("비빔냉면 총 이윤 : "+bibim_benefit);
//	}
//	
//	@Override
//	public void displayStock() {
//		super.displayStock();
//	}
}
