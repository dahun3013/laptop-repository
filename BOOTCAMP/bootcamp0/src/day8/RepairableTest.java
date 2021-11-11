package day8;

public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CC1클래스 객체화하기 일반 클래스는 상세설계도 완성된 설계도
				CC1 cc1 = new CC1();
				//C1클래스 객체화하기(추상클래스) 할 수 없다. 추상클래스는 미완성된 설계도  
				//C1 c1 = new C1();
				//I1 인터페이스를 객체화하기 할 수 없다. 인터페이스는 기본설계도 
				// I1 i1 =new I1();
		        //인터페이스를 객체화하려면 자손으로 일반 클래스에 implements 한 후 사용하기

	}

}

interface Repairable{}
class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);
		hitPoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Tank";
	}
	
}
/*
interface I1{
	//추상메소드 
	abstract void i1M();
}
interface II1 extends I1{
	abstract void ii1M();
}
interface II2 extends I1{
	abstract void ii2M();
}
//추상클래스안에는 일반메소드, 추상메소드 다 넣을 수 있다. 
abstract class C1 implements II1{
   //추상메소드
	abstract void cc1M();
		
}
class CC1 extends C1 implements II1, II2 {

	@Override
	public void i1M() {
		
		
	}

	@Override
	public void ii2M() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ii1M() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cc1M() {
		// TODO Auto-generated method stub
		
	}

}
*/