package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {
	
	//�հ� �޼ҵ�
	public void sum(int num1, int num2) {//���� static
	int total=num1+num2;
	System.out.println(total);
	}
			
	public static void main(String[] args) { //Data
		// �� ���� int���� �Է¹ޱ�
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		/*
		int sum=a+b;
		System.out.println(sum);
		*/
		FuncTest02 Obj=new FuncTest02();
		Obj.sum(a, b);
		

	}

}
