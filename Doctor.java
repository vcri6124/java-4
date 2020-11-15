package pro1;
//博士研究生类
public class Doctor implements STManage, TEManage {
	
	private String name; //姓名
	private String gender;  //性别
	private int age;  //年龄
	private double tuition; //每学期学费
	private double salary;  //每月薪水
	private double balance=0.0; //余额
	
	public Doctor() { //空构造方法
		
	}
	public Doctor(String n,String g,int a,double t,double s) { //构造方法
		name=n;
		gender=g;
		age=a;
		tuition=t;
		salary=s;
	}
	
	public double getBalance() { //返回余额
		return balance;
	}
	public void paySalary() { //实现发放薪水

		balance+=salary*12;
	}


	public double querySalary() { //实现查询薪水

		return salary;
	}

	public void payTuition() { //实现缴纳学费

		this.balance-=tuition;

	}

	public double queryTuition() { //实现查询学费

		return tuition;
	}
	
	public String toString() {
		return(name+" "+ gender+" "+age+" "+tuition+" "+salary);
		
	}

}


