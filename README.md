# 实验三 接口程序实验  
## 实验目的  
掌握Java中抽象类和抽象方法的定义；  
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；  
了解异常的使用方法，并在程序中根据输入情况做异常处理。
## 实验要求  
1、在 博士研究生类中实现各个接口定义的抽象方法;  
2、对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5、根据输入情况，要在程序中做异常处理。
##  实验内容  
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1、设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  
2、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。  
3、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  
## 实验过程  
首先建立两个管理接口,学生的接口主要用于获得并输出学生的学费,同样教师的接口用于获得输出其薪水.建立研究生类,通过implements实现学生和教师的接口,并在该类中定义研究生的名字,性别,年龄,定义参数,并用this关键字将局部变量的值传递给成员变量。另建立一个类，自定义异常，用于异常的输出，最后建立Test类，实例化两名研究生，用throws声明方法，表示这个方法可能会抛出异常，用if语句判断获取用户输入的字符，如果是规定的“1”则显示缴费成功，并显示该研究生的姓名、性别、年龄、年收入、学费和应缴纳金额，如果用户输入的是其他字符，则通过throw抛出异常，通过main方法的参数args实例化研究生类，用try捕捉异常，可能出现异常的语句是通过Scanner获取的用户输入操作，若正确输入，则输出对应的数据，若错误输入，则通过catch执行出现了异常类ErrorException类型的异常的代码。
## 核心代码与注释  
```
public static void main(String[] args){      //对于实例化研究生类,通过main方法的参数args一次性赋值
		Postgraduate zhang = new Postgraduate("张三","男",24,5200,12000);
		Postgraduate li = new Postgraduate("李四","女",23,5200,11000);
		try{                                    //捕捉异常
			System.out.println("李四，女，23岁");
			System.out.println("应缴纳学费："+li.getFee()+"（缴费完成后请输入1）");
			Scanner i = new Scanner(System.in);   //扫描输入文本赋给i
			String n = i.nextLine();              //扫描带一行内容并作为一个字符串而被获取到,赋给n
			Devide(n,li);
			System.out.println("张三，男，24岁");
			System.out.println("应缴纳学费："+zhang.getFee()+"（缴费完成后请输入1）");
			Scanner ip = new Scanner(System.in);
			String ni = ip.nextLine();
			Devid(ni,zhang);
			}
		catch(ErrorException e){
			System.out.println(e.getErrorEx());  //如果出现了异常类ErrorException类型的异常,那么执行该代码
		}
	}
  ```
## 系统运行结果截图 
![](https://github.com/zhangxinyu2019310185/Exp3/blob/main/11.png)  
![](https://github.com/zhangxinyu2019310185/Exp3/blob/main/12.png)  
![](https://github.com/zhangxinyu2019310185/Exp3/blob/main/2.png)
## 编程感想
