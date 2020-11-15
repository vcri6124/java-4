package pro1;
//��ʿ�о�����
public class Doctor implements STManage, TEManage {
	
	private String name; //����
	private String gender;  //�Ա�
	private int age;  //����
	private double tuition; //ÿѧ��ѧ��
	private double salary;  //ÿ��нˮ
	private double balance=0.0; //���
	
	public Doctor() { //�չ��췽��
		
	}
	public Doctor(String n,String g,int a,double t,double s) { //���췽��
		name=n;
		gender=g;
		age=a;
		tuition=t;
		salary=s;
	}
	
	public double getBalance() { //�������
		return balance;
	}
	public void paySalary() { //ʵ�ַ���нˮ

		balance+=salary*12;
	}


	public double querySalary() { //ʵ�ֲ�ѯнˮ

		return salary;
	}

	public void payTuition() { //ʵ�ֽ���ѧ��

		this.balance-=tuition;

	}

	public double queryTuition() { //ʵ�ֲ�ѯѧ��

		return tuition;
	}
	
	public String toString() {
		return(name+" "+ gender+" "+age+" "+tuition+" "+salary);
		
	}

}


