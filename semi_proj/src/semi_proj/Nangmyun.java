package SOO;

class Nangmyun extends stock{
//	private static final int small=1;
//	private static final int mid=2;
//	private static final int large=3;
//	private static int noodle=100;
//	private static int gomung_mu=100;
//	private static int gomung_egg=100;
//	private static int gomung_goggi=100;
//	private static int gomung_oi=100;
//	int nsc; // 냉면사이즈 체크
	private static int Nsuryang=0;
	
	
	Nangmyun(int choice){
		//Size dish = new Size(size);
		//nsc = dish.getSize();
		
		//this.Nsuryang = suryang;
		int ss = calNoodle(choice);
		setNoodle(ss);
//		this.noodle -= calNoodle();
//		this.gomung_mu -= suryang;
//		this.gomung_egg -= suryang;
//		this.gomung_goggi -= suryang;
//		this.gomung_oi -= suryang;
//		setGomung_mu(suryang);
//		setGomung_egg(suryang);
//		setGomung_goggi(suryang);
//		setGomung_oi(suryang);
		
	}
	
	public void displayStock() {
		//System.out.println("nsc값 : "+nsc);
		
//		System.out.println("면 재고량 : "+noodle);
//		System.out.println("무 재고량 : "+gomung_mu);
//		System.out.println("계란 재고량 : "+gomung_egg);
//		System.out.println("오이 재고량 : "+gomung_oi);
//		System.out.println("고명고기 재고량 : "+gomung_goggi);		
	}
	
	public int calNoodle(int choice) {

		//System.out.println("호출확인");
		int n=0;
		//System.out.println("nsc값 : "+nsc);
		if(choice == 0 || choice == 3 || choice==6) {
			n = 1;			
		}else if(choice == 1 || choice == 4 || choice==7) {
			n = 2;	
		}else if(choice == 2 || choice == 5 || choice==8) {
			n = 3;	
		}	
		//System.out.println("n값 : "+n);
		return n;
	}

//	public static int getSuryang() {
//		return Nsuryang;
//	}

	
	public void calComStock(int choice) {	
		
		if(choice == 0 || choice == 1 || choice==2) {
			setYuksu(1);		
		}else if(choice == 3 || choice == 4 || choice==5) {
			
		}else if(choice == 6 || choice == 7 || choice==8) {
			setHae(1);
		}
		setGomung_egg(1);
		setGomung_goggi(1);
		setGomung_mu(1);
		setGomung_oi(1);
		
//		setGoggi(1);
		
		
	}
	
}	
