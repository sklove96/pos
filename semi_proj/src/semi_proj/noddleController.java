package SOO;

import java.util.ArrayList;
import java.util.Scanner;

class noddleController {
	stock[] food;
//	mulNangmyun[] mul;
//	bibimNangmyun bibim;
//	sasimiNangmyun sasimi;
	mandoo mandoo;
	galbi galbi;
//	int indexMul;
	int index;
	
	noddleController() {
		//mul = new mulNangmyun[100];			
		food = new stock[500];
		index = 0;
	}
	
	public void addMenu(int choice) {
//		System.out.println("물냉면호출");
		Scanner key = new Scanner(System.in);
		
		String sizeOfMul=null, sizeOfBibim=null, sizeOfSasimi=null;
		int numOfMul=0, numOfBibim=0, numOfSasimi=0, numOfMandoo = 0,  numOfGalbi=0;
		
		if(choice == 0  || choice ==1 || choice ==2) { //물냉면 입력 받았을 떄 
//			System.out.print("물냉면 사이즈 : ");
//			sizeOfMul = key.nextLine();
//			System.out.print("물냉면 갯수 : ");
//			numOfMul = key.nextInt();
			
			// mul[indexMul] = new mulNangmyun(sizeOfMul, numOfMul);
			food[index] = new mulNangmyun(choice);
			index++;
//			displayAllStock();
		}else if(choice == 3  || choice ==4 || choice ==5) {//비빔냉면 입력 받았을 때
//			System.out.print("비빔냉면 사이즈 : ");
//			sizeOfBibim = key.nextLine();
//			System.out.print("비빔냉면 갯수 : ");
//			numOfBibim = key.nextInt();
			
			food[index] = new bibimNangmyun(choice);
			index++;
//			displayAllStock();
		}else if(choice == 6  || choice ==7 || choice ==8) {
//			System.out.print("회냉면 사이즈 : ");
//			sizeOfSasimi = key.nextLine();
//			System.out.print("회냉면 갯수 : ");
//			numOfSasimi = key.nextInt();
			
			food[index] = new bibimNangmyun(choice);
			index++;
//			displayAllStock();
		}else if(choice == 9) {
			food[index] = new mandoo(choice);		
			index++;
		}else if(choice == 10) {
			food[index] = new galbi(choice);		
			index++;
		}
//		else if(choice == 4) {                                                     -- 만두와 갈비를 4,5로 해서 choice하려함.
//			System.out.print("만두 갯수 : ");
//			numOfMandoo = key.nextInt();		
//			
//			food[index] = new mandoo(numOfMandoo);
//			index++;
//		}else if(choice == 5) {
//			System.out.print("갈비 갯수 : ");
//			numOfGalbi = key.nextInt();
//			
//			food[index] = new galbi(numOfGalbi);	
//			index++;
//		}
		
	}

	
//	public void addMandoo() {// 만두와 고기는 food로 묶을 필요가 있는지 없는지 확인해야함
//		Scanner key = new Scanner(System.in);
//		int numOfMandoo = 0;
//		
//		System.out.print("만두 갯수 : ");
//		numOfMandoo = key.nextInt();
//		
//		food[index] = new mandoo(numOfMandoo);		
//		index++;
//	}
//	
//	public void addGalbi() {
//		Scanner key = new Scanner(System.in);
//		int numOfGalbi;
//		
//		System.out.print("갈비 갯수 : ");
//		numOfGalbi = key.nextInt();
//		
//		food[index] = new galbi(numOfGalbi);		
//		index++;
//	}
	
	
	public static void displayAllStock() { // 마지막 저장한 index를 불러오는 방법
		MenuDAO md = new MenuDAO();
		ArrayList<stock> list = md.select();
		
		for(stock st : list) {
			int noodle = st.getNoodle();
			int yuksu = st.getYuksu();
			int gm = st.getGomung_mu();
			int ge = st.getGomung_egg();
			int gg = st.getGomung_goggi();
			int go = st.getGomung_oi();
			int hae = st.getHae();
			int goggi = st.getGoggi();
			int mandoo = st.getMandoo();
			
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", noodle, yuksu, gm, ge, gg, go, hae, goggi, mandoo);
		}
		
		
//		for(int i=0; i<index; i++) {
//			if(food[i] instanceof mulNangmyun) {
//				food[i].displayStock();
//			}
//		}
		
	}
	
	
	public void displayMulBenefit() {
//		Benefit mb = new Benefit();
		int mt = Benefit.getTotalMulBenefit();
		System.out.println("물냉면 총이익 : "+mt);
	}
	
	
}
