package study;
public class Task extends Calculator {



public void doTask() {
	
	System.out.println("plusメソッドの因数が一つの場合：" + plus(10) );
	System.out.println("plusメソッドの因数が二つの場合："+ plus(10,20) );
	System.out.println("plusメソッドの因数が三つの場合："+ plus(10,20,30) );
}
}