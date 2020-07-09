package SOO;

class Size {
//	private static final int small=1;
//	private static final int mid=2;
//	private static final int large=3;
	private String size;
//	private int suryang;
	
	
	Size(String size) {
		this.size = size;
//		this.suryang = suryang;
	}

	
	public int getSize() {	// size받아오는 메서드
		int num = 0;
		
		if(size.equals("s")) {
			num = 1; 	
		}else if(size.equals("m")){
			num = 2;			
		}else if(size.equals("l")) {
			num = 3;			
		}		
		return num;	
	}
		
	
	
//	public int getMethod() {
//		
//		int num = 0;
//		
//		if(size.equals("s")) {
//			num = calSNoodle(suryang); 	
//		}else if(size.equals("m")){
//			num = calMNoodle(suryang);			
//		}else if(size.equals("l")) {
//			num = calLNoodle(suryang);			
//		}		
//		return num;	
//	}
	
	
//	public int calSNoodle(int suryang) {
//		int n = this.small*suryang;
//		return n;
//	}
//	public int calMNoodle(int suryang) {
//		int n = this.mid*suryang;
//		return n;
//	}
//	public int calLNoodle(int suryang) {
//		int n = this.large*suryang;
//		return n;
//	}
	
}




