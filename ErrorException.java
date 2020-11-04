package exp3;


public class ErrorException extends Exception{     //自定义的异常
	String m = "输入有误!";
	String getErrorEx(){
		return m;
	}
	
}