package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	//합계 메소드
	public void sum(int num1, int num2) {//스택 static
	int total=num1+num2;
	System.out.println(total);
	}
			
	public static void main(String[] args) { //Data
		// 두 개의 int값을 입력받기
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		int sum=a+b;
		System.out.println(sum);
		*/
		FuncTest02 Obj=new FuncTest02();
		Obj.sum(a, b);
		

	}

}
