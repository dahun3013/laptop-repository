package day3;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 2,3,5,7 ��� ���� ���� 10�� ���
		int a =0;
		int cnt=0;
		while(a<100) {
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
			a+=1;
			if(a%2==0 || a%3==0 || a%5==0 || a%7==0)
				continue;
			System.out.print(a+" ");
			cnt++;
		}
	}
}

/*String Number = "999999-1234567";
System.out.println(Number);
char gender = Number.charAt(7);
System.out.println(gender);
switch(gender) {
	case '1': case '3':{
		System.out.println("����");break;
	}
	case '2': case '4':{
		System.out.println("����");break;
	}
}*/

/*int computer = (int)(Math.random()*3)+1;
Scanner sc = new Scanner(System.in);
System.out.print("����(1),����(2),��(3) �� �ϳ� �Է� : ");
int user = sc.nextInt();

System.out.println("��ǻ�ʹ� "+computer+" �Դϴ�.");
switch(user) {
	case 1:
		if(computer==2)
			System.out.println("��ǻ���� �¸��Դϴ�.");
		else if(computer==3)
			System.out.println("����� �¸��Դϴ�.");
		else
			System.out.println("�����ϴ�.");
		break;
	case 2:
		if(computer==3)
			System.out.println("��ǻ���� �¸��Դϴ�.");
		else if(computer==1)
			System.out.println("����� �¸��Դϴ�.");
		else
			System.out.println("�����ϴ�.");
		break;
	case 3:
		if(computer==1)
			System.out.println("��ǻ���� �¸��Դϴ�.");
		else if(computer==2)
			System.out.println("����� �¸��Դϴ�.");
		else
			System.out.println("�����ϴ�.");
		break;
	default:
		System.out.println("�߸��� �Է��Դϴ�.");
		break;
}*/

/*/ ���� ���� �� ���� �����
Scanner sc = new Scanner(System.in);
System.out.print("����(1), ����(2), ��(3)�� �ϳ��� �Է��ϼ���-->");
int user=sc.nextInt();
int com = (int) (Math.random()*3) + 1;
String panjung=null;
switch(com-user) {
  case 0:{
	  panjung="���º�";
	  break;
   }
  case 1: 
  case -2:{
	  panjung="�Ľ�";
  }
  case -1: case 2:{
	  panjung="������";
  }
  
}//end switch
String userOuput=null;
switch(user) {
  case 1:
	userOuput="����";break;
  case 2:
	userOuput="����";break;
  case 3:
	userOuput="��";break;
}
String comOuput=null;
switch(com) {
  case 1:
	comOuput="����";break;
  case 2:
	comOuput="����";break;
  case 3:
	comOuput="��";break;
}
System.out.println("����� " + userOuput+"�Դϴ�");
System.out.println("��ǻ�ʹ� " + comOuput+"�Դϴ�");
System.out.println(panjung+"�߽��ϴ�");
*/

/*Scanner sc = new Scanner(System.in);
System.out.print("�� �Է�: ");
int month = sc.nextInt();
switch(month) {
	case 3:
	case 4:
	case 5:
		System.out.println("������ ������ ���Դϴ�.");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("������ ������ �����Դϴ�.");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("������ ������ �����Դϴ�.");
		break;
	case 12:
	case 1:
	case 2:
		System.out.println("������ ������ �ܿ��Դϴ�.");
		break;
	default:
		System.out.println("�Է� ����");
		break;	
}	*/

/*import java.util.*;
public class Calc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���б�:+, ����:-, ���ϱ�:*, ������:/ �� ��ȣ 1�� �Է�");
		System.out.print("����� ��ȣ��? ");
		char ch = input.next().charAt(0);
		System.out.print("����1==> ");
		int a = input.nextInt();
		System.out.print("����2==> ");
		int b = input.nextInt();
		double res=0;
		switch(ch) {
		case '+':
			res=a+b;
			break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
			break;
		case '/':
			if(b==0) {
				System.out.println("�����Ⱑ �Ұ����մϴ�");
				return;
			}
			res=(double)a/b;
			
		}
		System.out.printf("%d%c%d=%d\n",a,ch,b,(int)res);
	}
}*/


/*
 * String word="D";
		switch(word) {
		   case "A":
		   case "a":{
			   System.out.println("a�� ���۵Ǵ� ����� ant�� �ִ�.");
			   break;//switch���� ������
		    }
		   case "B":
		   case "b":{
			   System.out.println("b�� ���۵Ǵ� ����� bear�� �ִ�.");
			   break;
		   }
		   case "C":
		   case "c":{
			   System.out.println("c�� ���۵Ǵ� ����� cat�� �ִ�.");
			   break;
		   }
		   case "D":
		   case "d":{
			   System.out.println("d�� ���۵Ǵ� ����� dog�� �ִ�.");
			   break;
		   }
		   default : {
			   System.out.println("a~d������ �����ڰ� �ƴ�");
		   }
		}

 */

/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("������ �Է��ϼ��� : ");
	int score = sc.nextInt();
	String grade;
	System.out.println("�Էµ� ���� "+score);
	
	if(score>100 || score<0)
		System.out.println("��������");
	else {
		if(score>=90)
			grade = "A";
		else if(score>=80)
			grade = "B";
		else if(score>=70)
			grade = "C";
		else if(score>=60)
			grade = "D";
		else
			grade = "F";
		
		if(!(score<60) && score%10>4)
			grade+="+";
		else
			grade+="o";
		
		System.out.println(grade);
	}
}*/

/*public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();

if(number>=90 && number<=100) {
	System.out.println("���� number�� 90�̻� 100����");
}
if(number<0 || number>100)
	System.out.println("���� number�� 0���� �۰ų� 100���� Ŭ ��");

if(number%3 ==0 && number%2 !=0)
	System.out.println("���� number�� 3�� ����̰� 2�� ����� �ƴҶ�");

char c = sc.nextLine().charAt(0);

if(c==' ' || c == '\t' || c=='\n')
	System.out.println("���� c�� �����̰ų� �� �Ǵ� ���๮��");

if(c>=65 && c<=90)
	System.out.println("�빮��");
else if(c>=97 && c<=122)
	System.out.println("�ҹ���");

String str = sc.nextLine();
if(str.equals("yes"))
	System.out.println("����");
else if(str.toLowerCase().equals("yes") || str.equalsIgnoreCase("yes"))
	System.out.println("����");

}*/

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("���� �Է�: ");
int number = sc.nextInt();
if(number>0) {
	System.out.println("0���� ŭ");
}else {
	System.out.println("0���� ����");
}
if(number%5==0) {
	System.out.println("5���");
}

}*/