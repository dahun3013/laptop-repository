package day6;

public class ParentEX2 {

	public static void main(String[] args) {
		// ��������ȿ� ���� ���� �� �޼ҵ�ȣ���� ���ؼ� �ֱ�
		//1�ܰ� ��ü������ �Ѵ�.
		A a = new A();
		
		//2�ܰ� �޼ҵ带 ȣ���Ѵ�.
		a.setName("������");
		System.out.println(a.getName());
		a.setKind("����");
		System.out.println(a.getKind());
		a.setCount(10);;
		System.out.println(a.getCount());
		a.setOk(true);
		System.out.println(a.getOk());
		a.setRate(3.4);
		System.out.println(a.getRate());
	}

}
class A{
	//��� ����, ����ʵ�,  Ŭ��������
	String name;
	String kind;
	int count;
	boolean ok;
	double rate;
	//setter�޼ҵ� ����� ���� ��������� �� �ֱ�
	void setName(String name) {
		this.name=name;
	}
	void setKind(String kind) {
		this.kind=kind;
	}
	void setCount(int count) {
		this.count = count;
	}
	void setOk(boolean ok) {
		this.ok=ok;
	}
	void setRate(double rate) {
		this.rate=rate;
	}
	double getRate() {
		return rate;
	}
	
	//getter�޼ҵ� �����
	String getName() {
		return name;
	}
	String getKind() {
		return kind;
	}
	int getCount() {
		return count;
	}
	boolean getOk() {
		return ok;
	}
	double rate() {
		return rate;
	}
	
	
}