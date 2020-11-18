# java-4
一、实验内容：

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。

二、实验设计：


1.	学生管理接口
STManage.java
package pro1;

//学生管理接口

public interface STManage {


	void payTuition(); //缴纳学费
  
	double queryTuition();//查询学费
  
}

2.	教师管理接口 TEManage.java
package pro1;
//教师管理接口
public interface TEManage {

	void paySalary(); //发放薪水
	double querySalary();//查询薪水
}

3.	博士研究生类的设计

Doctor.java

成员变量：

	private String name; //姓名
  
	private String gender;  //性别
  
	private int age;  //年龄
  
	private double tuition; //每学期学费
  
	private double salary;  //每月薪水
  
	private double balance=0.0; //余额
  
实现了两个接口public class Doctor implements STManage, TEManage{}

对接口方法进行了重载。


4.	测试类 Main.java

实例化两个博士研究生的用例，并对税款的计算做出了定义。

其中税款计算的关键代码：

	final double LV[]= {0.03,0.1,0.2,0.25,0.3,0.35,0.45};   //征税等级税率
  
	final int limit[]= {0,3000,12000,25000,35000,55000,80000}; //征税等级金额
  
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
    
三、Scanner类实现运行时交互输入

System.out.println("依次输入第二位博士的姓名、性别、年龄、学费、每月薪水：");

        // 判断是否还有输入
        
        String name2=scan.next();
        
        String gender2=scan.next();
        
        int age2=scan.nextInt();
        
        double tu2=scan.nextDouble();
        
        double sa2=scan.nextDouble();
        
四、输入异常处理


当输入的学费，薪资，年龄等参数为负数时，捕获异常并输出异常信息

try {

		……..
    
	        if(age1<0 || tu1<0 || sa1<0) {
          
	        	throw new Exception("输入数值小于0");
            
            
	        }
          
}

	catch (Exception e){
  
			
			System.out.println("输入数据不合法!");
      
			System.out.println("依次输入第一位博士的姓名、性别、年龄、学费、每月薪水：");
      
			
		}
    

五、实验结果截图

 
![Image text](https://img-blog.csdnimg.cn/20201118091525255.png?)
