package day9;

import java.util.Scanner;

public class SaleManagerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuSelect = 0;
		Business b = new Business();
		while( menuSelect != 3) {
			System.out.println("--------------");
			System.out.println("판매량 관리 프로젝트");
			System.out.println("---------------");
			System.out.println("1.입력 2.출력 3.종료");
			System.out.print("선택? ");
			menuSelect=sc.nextInt();
			if(menuSelect == 1) {
				b.input();
			}else if(menuSelect == 2) {
				b.output();
			}else if(menuSelect == 3) {
				break;
			}else {
				System.out.println("메뉴는 1~3 사이 숫자 ");
			}
		}

	}

}
class Business{
	Scanner sc;
	SeoulJisa sj = new SeoulJisa();
	KyunginJisa kj=new KyunginJisa();
	KangWonJisa kwj = new KangWonJisa();
	GejuJisa gj = new GejuJisa();
	String yN="y";//게속하시겠습니까 판단하는 변수

	void salesStaus(Jisa jisa) {
		if(jisa instanceof SeoulJisa) {
			if(sj.productName.equals("com")) 
				sj.salesStatus = 2000000  * sj.salesAmount; 
			else if(sj.productName.equals("printer")) 
				sj.salesStatus = 500000  *sj.salesAmount; 
				
		}else if(jisa instanceof KangWonJisa) {
				if(kwj.productName.equals("com")) 
					kwj.salesStatus = 2000000  *kwj.salesAmount; 
				else if(kwj.productName.equals("printer")) 
					kwj.salesStatus = 500000  *kwj.salesAmount; 
		}else if(jisa instanceof KyunginJisa) {
				if(kj.productName.equals("com")) 
					kj.salesStatus = 2000000  *kj.salesAmount; 
				else if(kj.productName.equals("printer")) 
					kj.salesStatus = 500000  *kj.salesAmount; 
		}else if(jisa instanceof KyunginJisa) {
				if(kj.productName.equals("com")) 
		    		kj.salesStatus = 2000000  *kj.salesAmount;
				else if(kj.productName.equals("printer")) 
					kj.salesStatus = 500000  *kj.salesAmount; 			
		}else if(jisa instanceof GejuJisa) {
				if(gj.productName.equals("com")) 
					gj.salesStatus = 2000000  *gj.salesAmount; 
				else if(gj.productName.equals("printer"))
					gj.salesStatus = 500000  *gj.salesAmount; 			
		}
	}

	void input() {
		//입력
		do {	
			System.out.println("지사는?");
			System.out.println("1. 서울지사, 2. 경인지사, 3. 강원지사 4. 제주지사 ");
			System.out.print("선택은? ");
			int jisaSelect=0;
			sc = new Scanner(System.in);
			jisaSelect = sc.nextInt();
			if(jisaSelect == 1) {
				jisaInput(sj);
			}else if(jisaSelect == 2) {
				jisaInput(kj);
			}else if(jisaSelect == 3) {
				jisaInput(kwj);
			}else if(jisaSelect == 4) {
				jisaInput(gj);
			}else {
				System.out.println("지사번호 틀렸습니다");
			}
		}while(yN.equalsIgnoreCase("y")); 	
	}
	void jisaInput(Jisa jisa) {

		System.out.print("제품은?");
		if(jisa instanceof SeoulJisa) {
			sj=(SeoulJisa) jisa;
			sj.productName=sc.next();
			System.out.println();
			System.out.println(sj.toString() + " " + sj.productName + "판매량은? ");
			sj.salesAmount = sc.nextInt();
			salesStaus(sj);//매출현황 계산
		}else if(jisa instanceof KangWonJisa) {
			kwj=(KangWonJisa) jisa;
			kwj.productName=sc.next();
			System.out.println();
			System.out.println(kwj.toString() + " " + kwj.productName + "판매량은? ");

			kwj.salesAmount = sc.nextInt();
			salesStaus(kwj);//매출현황 계산

		}else if(jisa instanceof KyunginJisa) {
			kj=(KyunginJisa) jisa;
			kj.productName=sc.next();
			System.out.println();
			System.out.println(kj.toString() + " " + kj.productName + "판매량은? ");

			kj.salesAmount = sc.nextInt();
			salesStaus(kj);//매출현황 계산

		}else if(jisa instanceof GejuJisa) {
			gj=(GejuJisa) jisa;
			gj.productName=sc.next();	
			System.out.println();
			System.out.println(gj.toString() + " " + gj.productName + "판매량은? ");
			gj.salesAmount = sc.nextInt();
			salesStaus(gj);
		}
		System.out.println();
		System.out.print("계속하시겠습니까?");
		yN = sc.next();
	}
	void output() {
		//출력
		System.out.println("---------------------------");
		System.out.println("각 지사별 판매현황");
		System.out.println("--------------------------- ");
		System.out.println("지사명 제품명 제품가격 판매량 매출현황");
		System.out.println("----------------------------");
		System.out.println(sj + " " + sj.productName + " " + sj.salesAmount + " " + sj.salesAmount);
		System.out.println(kj + " " + kj.productName + " " + kj.salesAmount + " " + kj.salesAmount);
		System.out.println(kwj + " " + kwj.productName + " " + kwj.salesAmount + " " + kwj.salesAmount);
		System.out.println(gj + " " + gj.productName + " " + gj.salesAmount + " " + gj.salesAmount);
		
	}

}
class Jisa{
	String jisaName;//지사명
	String productName;//제품명
	int salesAmount;//판매량

}
class SeoulJisa extends Jisa{
	int salesStatus;//매출현황
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "서울지사";
	}
}
class KyunginJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "경인지사";
	}
}
class KangWonJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "강원지사";
	}
}
class GejuJisa extends Jisa{
	int salesStatus;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제주지사";
	}
}
