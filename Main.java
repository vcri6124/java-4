package pro1;

import java.util.Scanner;

public class Main {
	
	public  static void main(String args[]) {
		
		final double start=5000.0;//个税起征点
		
		final double LV[]= {0.03,0.1,0.2,0.25,0.3,0.35,0.45};   //征税等级税率
		final int limit[]= {0,3000,12000,25000,35000,55000,80000}; //征税等级金额
		Scanner scan = new Scanner(System.in);
		
		System.out.println("依次输入第一位博士的姓名、性别、年龄、学费、每月薪水：");
	//王晓宇 男 23 1000 7000	
		//李晓红 女 24 500 12100
		try {
			
			  // 判断是否还有输入
	        String name1=scan.next();
	        String gender1=scan.next();
	        int age1=scan.nextInt();
	        double tu1=scan.nextDouble();
	        double sa1=scan.nextDouble();
	        
	        if(age1<0 || tu1<0 || sa1<0) {
	        	throw new Exception("输入数值小于0");
	        }
			Doctor d1= new Doctor(name1,gender1,age1,tu1,sa1); //实例化两个博士生类
			
			System.out.println("依次输入第二位博士的姓名、性别、年龄、学费、每月薪水：");
	        // 判断是否还有输入
	        String name2=scan.next();
	        String gender2=scan.next();
	        int age2=scan.nextInt();
	        double tu2=scan.nextDouble();
	        double sa2=scan.nextDouble();
	        if(age2<0 || tu2<0 || sa2<0) {
	        	throw new Exception("输入数值小于0");
	        }
	        Doctor d2= new Doctor(name2,gender2,age2,tu2,sa2); //实例化两个博士生类
			d1.paySalary();
			d1.payTuition();
			double income1=d1.getBalance()/12;
			d2.paySalary();
			d2.payTuition();
			double income2=d2.getBalance()/12;
			double tax1=0.0,tax2=0.0;
			
			income1-=5000;
			income2-=5000;
			scan.close();
			
			
			//计算税款
			for(int i=0;i<7;i++) {
				if(income1>limit[i]) {
					tax1+=(income1-limit[i])*LV[i];
				}
				else {
					break;
				}
				
			}
			tax1*=12;
			
			//计算税款
			for(int i=0;i<7;i++) {
				if(income2>limit[i]) {
					tax2+=(income2-limit[i])*LV[i];
				}
				else {
					break;
				}
				
			}
			tax2*=12;

			System.out.println("第一位博士信息:\n"+d1.toString());
			System.out.println("缴纳税款:"+tax1);
			System.out.println("第二位博士信息:\n"+d2.toString());
			System.out.println("缴纳税款:"+tax2);
	        
	        
		}
		catch (Exception e){
			
			System.out.println("输入数据不合法!");
			System.out.println("依次输入第一位博士的姓名、性别、年龄、学费、每月薪水：");
			
		}
        
        
        
		
	}


}
