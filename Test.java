package exp3;

import java.util.Scanner;

public class Test {
	public static void Devide(String n,Postgraduate a) throws ErrorException{  //�÷�������Ҫ�׳��쳣
		if (n.equals("1")){System.out.println("�ɷѳɹ�");
		System.out.println("���ģ�Ů��23�꣬�����룺11000��ѧ�ѣ�5200��Ӧ���ɽ�"+(0.03*(a.getPay()-a.getFee()-3000))); }
		else{throw new ErrorException();	}
		
	}
	public static void Devid(String ni,Postgraduate b) throws ErrorException{
		if (ni.equals("1")){System.out.println("�ɷѳɹ�");
		System.out.println("�������У�24�꣬�����룺12000��ѧ�ѣ�5200��Ӧ���ɽ�"+(0.03*(b.getPay()-b.getFee()-3000))); }
		else{throw new ErrorException();	}
		
	}
	
	public static void main(String[] args){                        //����ʵ�����о�����,ͨ��main�����Ĳ���argsһ���Ը�ֵ
		Postgraduate zhang = new Postgraduate("����","��",24,5200,12000);
		Postgraduate li = new Postgraduate("����","Ů",23,5200,11000);
		try{      //��׽�쳣
			System.out.println("���ģ�Ů��23��");
			System.out.println("Ӧ����ѧ�ѣ�"+li.getFee()+"���ɷ���ɺ�������1��");
			Scanner i = new Scanner(System.in);              //ɨ�������ı�����i
			String n = i.nextLine();                         //ɨ���һ�����ݲ���Ϊһ���ַ���������ȡ��,����n
			Devide(n,li);
			System.out.println("�������У�24��");
			System.out.println("Ӧ����ѧ�ѣ�"+zhang.getFee()+"���ɷ���ɺ�������1��");
			Scanner ip = new Scanner(System.in);
			String ni = ip.nextLine();
			Devid(ni,zhang);
			}
		catch(ErrorException e){
			System.out.println(e.getErrorEx());  //����������쳣��ErrorException���͵��쳣,��ôִ�иô���
		}
	}
	}