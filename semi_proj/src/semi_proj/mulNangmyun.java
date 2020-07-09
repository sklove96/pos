package SOO;

class mulNangmyun extends Nangmyun{
//	private static int yuksu = 100;
//	private final int MUL_PRICE = 6000;
//	private int mul_suryang = 0;
	private int mulSBenefit = 0;
	private int mulMBenefit = 0;
	private int mulLBenefit = 0;
	private int totalMulBenefit = 0;
//	private int price = 0;
//	private String mul_size = null;
	
	mulNangmyun(int choice){
		super(choice);
		calComStock(choice);
		//Benefit bb = new Benefit();
		Benefit.mulBenefit(choice);
//		this.mul_size = size;

//		this.yuksu -= suryang;	
//		setYuksu(choice);
//
//		mul_suryang += suryang;
//		this.price = mulPay();
		//calNoodle();
		
	}
	
//	public void displayMulStock() {
//		displayStock();		
//	}
	
	@Override
	public void displayStock() {		
//		super.displayStock();
//		System.out.println("육수 재고량 : "+yuksu);
	}

//	public int mulPay() {
//		int n =0;
//		Size size = new Size(mul_size);
//		int msc = size.getSize();
//		
//		if(msc == 1) {
//			n = MUL_PRICE;
//		}else if(msc == 2) {
//			n = (MUL_PRICE+500);
//		}else if(msc ==3) {
//			n =(MUL_PRICE+1000);
//		}
//		return n;
//	}
		
		
		
		
		
		
		
//		if(mul_size.equals("s")) {
//			price = MUL_PRICE; 	
//		}else if(mul_size.equals("m")){
//			price = (MUL_PRICE+500);			
//		}else if(mul_size.equals("l")) {
//			price = (MUL_PRICE+1000);			
//		}		
//		return price;	
//	}

//	public int getMul_suryang() {
//		return mul_suryang;
//	}
	
//	public void MulBenefit(int choice) {
//		
//		if(choice == 0) {
//			mulSBenefit +=6000;
//		}else if(choice ==1) {
//			mulMBenefit +=6500;
//		}else if(choice ==2) {
//			mulLBenefit +=7000;
//		}
//
//	}
//	mul_benefit = price*mul_suryang;
//	System.out.println("물냉면 총 판매량 : "+mul_suryang);
//	System.out.println("물냉면 총 이윤 : "+mul_benefit);
	
//	public void displayMulBenfit() { // 물냉면 총이익
//		totalMulBenefit = (getMulSBenefit() + getMulMBenefit() + getMulLBenefit());
//	}
//
//	
//	
//	
//	public int getMulSBenefit() {
//		return mulSBenefit;
//	}
//
//	public int getMulMBenefit() {
//		return mulMBenefit;
//	}
//
//	public int getMulLBenefit() {
//		return mulLBenefit;
//	}
//
//	public int getTotalMulBenefit() {
//		return totalMulBenefit;
//	}

}
