package day6;

public class ParentEX3 {

	public static void main(String[] args) {
		// supper ���� ������
		// 1. �θ� ��� ������ ����ų��  2. �θ������ ȣ���� ��  ���� : �ڽ� �����ڿ��� �ݵ�� ù�ٿ� ����		
         AA a = new AA();
         a.setName("�θ�Լ���");
        // System.out.println(a.getName());
        //�ڽ��� �̸��� �ְ� ����ϱ�
         AA1 aa1 = new AA1();
         aa1.setName("�ڽ��� �̸�");
        // System.out.println(aa1.getName());
         
         //AA1Ŭ������ �޼ҵ带 ȣ���ϱ� pMethod(); //�θ��̸�,  �ڽ��̸� 2�� ����ϱ� 
         aa1.pMethod();
         
         AA2 aa2 = new AA2();
         aa2.pM();
         
	}

}

class AA{
	//������� ����
	String ida;
	String name;//���� �θ��̸�
	//getter /setter �ڵ����� �����
    int age;
    
    
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class AA1 extends AA{
	String idaa1;
	String name;
	
	void pMethod() {
		super.name="��Ӱ��迡�� �θ��̸�";
		System.out.println(this.name);//AA1Ŭ���� ��������� �� ����Ŵ this
		System.out.println(super.name);//�θ�Ŭ������ ��������� ����Ų��. super
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdaa1() {
		return idaa1;
	}

	public void setIdaa1(String idaa1) {
		this.idaa1 = idaa1;
	}
	//����� ������ �޼ҵ� 
	void calA1() {
		this.idaa1 = "100";
		super.ida = "200";//�θ�Ŭ������ ����
	}
}

class AA2 extends AA {
	String idaa2;
    int age;
    
    
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdaa2() {
		return idaa2;
	}

	public void pM() {
		super.age=50;
		this.age=20;
		System.out.println(super.age);
		System.out.println(this.age);
		
	}

	public void setIdaa2(String idaa2) {
		this.idaa2 = idaa2;
	}
	
}