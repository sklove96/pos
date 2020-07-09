package SOO;

class galbi extends stock{
//	private static int galbi=100;
	private final int galbi_PRICE = 8000;
	private int galbi_suryang=0;
	private int galbi_benefit =0;
	
	galbi(int choice){
//		this.galbi -= suryang;
//		setGoggi(suryang);
//		this.galbi_suryang += suryang;
		calAddStock(choice);
	}
//	public void displaygalbiStock() {		
//	}
	public void displaygalbiBenefit() {
		galbi_benefit = galbi_PRICE*galbi_suryang;
		System.out.println("갈비 총 판매량 : "+galbi_suryang);
		System.out.println("갈비 총 이윤 : "+galbi_benefit);
	}
	
//	@Override
//	public void displayStock() {
//		System.out.println("갈비 재고량 : "+galbi);		
//	}
}
