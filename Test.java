package exp3;

import java.util.Scanner;

public class Test {
	public static void Devide(String n,Postgraduate a) throws ErrorException{  //该方法可能要抛出异常
		if (n.equals("1")){System.out.println("缴费成功");
		System.out.println("李四，女，23岁，年收入：11000，学费：5200，应缴纳金额："+(0.03*(a.getPay()-a.getFee()-3000))); }
		else{throw new ErrorException();	}
		
	}
	public static void Devid(String ni,Postgraduate b) throws ErrorException{
		if (ni.equals("1")){System.out.println("缴费成功");
		System.out.println("张三，男，24岁，年收入：12000，学费：5200，应缴纳金额："+(0.03*(b.getPay()-b.getFee()-3000))); }
		else{throw new ErrorException();	}
		
	}
	
	public static void main(String[] args){                        //对于实例化研究生类,通过main方法的参数args一次性赋值
		Postgraduate zhang = new Postgraduate("张三","男",24,5200,12000);
		Postgraduate li = new Postgraduate("李四","女",23,5200,11000);
		try{      //捕捉异常
			System.out.println("李四，女，23岁");
			System.out.println("应缴纳学费："+li.getFee()+"（缴费完成后请输入1）");
			Scanner i = new Scanner(System.in);              //扫描输入文本赋给i
			String n = i.nextLine();                         //扫描带一行内容并作为一个字符串而被获取到,赋给n
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
	}