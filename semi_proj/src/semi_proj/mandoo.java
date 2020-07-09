package SOO;

class mandoo extends stock{
//	private static int mandoo=100;
	private final int mandoo_PRICE = 4000;
	private int mandoo_suryang=0;
	private int mandoo_benefit =0;
	
	mandoo(int choice){
//		this.mandoo -= suryang;
		setMandoo(choice);
//		this.mandoo_suryang += suryang;
	}
//	public void displaymandooStock() {
//	}
	public void displaymandooBenefit() {
		mandoo_benefit = mandoo_PRICE*mandoo_suryang;
		System.out.println("만두 총 판매량 : "+mandoo_suryang);
		System.out.println("만두 총 이윤 : "+mandoo_benefit);
	}
	
//	@Override
//	public void displayStock() {
//		System.out.println("만두 재고량 : "+mandoo);
//		
//	}
}
