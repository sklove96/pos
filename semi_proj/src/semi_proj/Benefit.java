package SOO;

class Benefit {
	static private int mulSBenefit;
	static private int mulMBenefit;
	static private int mulLBenefit;
	static private int bibimSBenefit;
	static private int bibimMBenefit;
	static private int bibimLBenefit;
	//회
	static private int mandooBenefit;
	static private int goggiBenefit;
	static private int totalMulBenefit;

	Benefit() {
		//mulSBenefit = 0;

	}

	static public void mulBenefit(int choice) {

		if (choice == 0) {
			mulSBenefit += 6000;
		} else if (choice == 1) {
			mulMBenefit += 6500;
		} else if (choice == 2) {
			mulLBenefit += 7000;
		}
		
		displayMulBenfit();
	}

	static public void displayMulBenfit() { // 물냉면 총이익
		totalMulBenefit = (getMulSBenefit() + getMulMBenefit() + getMulLBenefit());
	}

	
	
	
	
	static public int getMulSBenefit() {
		return mulSBenefit;
	}

	static public int getMulMBenefit() {
		return mulMBenefit;
	}

	static public int getMulLBenefit() {
		return mulLBenefit;
	}

	static public int getTotalMulBenefit() {
		return totalMulBenefit;
	}

}
