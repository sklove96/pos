package SOO;

import java.util.Scanner;

class viewview{
//	new menu1();
	
	noddleController con;
	
	viewview() {
		con = new noddleController();
	}
	
	public void displayMenu() {
		
		while(true) {
			System.out.println();
			System.out.println("*** 냉면선호 ***");
			System.out.println("****  메뉴  ****");
			System.out.println("99. 메뉴종료");
			System.out.println("0. 물냉면S");
			System.out.println("1. 물냉면M");
			System.out.println("2. 물냉면L");
			System.out.println("3. 비빔냉면S");
			System.out.println("4. 비빔냉면M");
			System.out.println("5. 비빔냉면L");
			System.out.println("6. 회냉면S");
			System.out.println("7. 회냉면M");
			System.out.println("8. 회냉면L");
			System.out.println("9. 만두");
			System.out.println("10. 숯불 고기");
			System.out.println("11. 물냉면 이윤");
			System.out.println("100. 재고확인");
			
			System.out.print("원하는 항목 번호 선택 >> ");
			
			Scanner input = new Scanner(System.in);
			
			int choice = input.nextInt();
			
			switch(choice) {
			case 99:
				System.out.println("안녕히 가십시오.");
				return;				
			case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:case 8:case 9: case 10:				
				con.addMenu(choice);
//				System.out.println("면"+con.);
				break;
			case 11:
				con.displayMulBenefit();
				break;
			case 100:
				con.displayAllStock();
				break;
				
//			case	2://비빔냉면
//				con.addMenu(choice);
//				break;			
//			case 3://회냉면
//				con.addMenu(choice);
//				break;
//			case 4:
//				con.addGalbi();
//				con.addMandoo();
//				break;
//			case 5: //결제	
//				System.out.println("주문이 완료되었습니다. 잠시만 기다려주십시오.");
//				return;
//			case 100: // 재고확인
//				con.displayAllStock();
//				break;
			default:
				System.out.println("잘못누르셨습니다.");
				System.out.println("다시 눌러주세요.");
				break;
			}
		}
		
//	controller.addMul();
//	controller.addMandoo();
//	controller.addGalbi();
//	
//	System.out.println("***남은 재고량***");
//	controller.mul.displayMulStock();
//
//	controller.mandoo.displaymandooStock();
//	controller.galbi.displaygalbiStock();
//	System.out.println();
//
//	controller.mul.displayMulBenefit();
//	controller.mandoo.displaymandooBenefit();
//	controller.galbi.displaygalbiBenefit();
//	}
	
	
	
//	System.out.println("냉면수량 : "+controller.mul.getSuryang());
//	System.out.println("물냉면수량 : "+controller.mul.getMul_suryang());

	}
}
	
	
public class noddleMain {// view가 되어야할 부분	
	public static void main(String[] args) {	
		viewview vv =new viewview();
		vv.displayMenu();
	}
}
