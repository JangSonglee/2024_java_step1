package chapter05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FuncTest01 {

	//�հ� �޼ҵ�
	public static void sum(int num1, int num2) {
		int total=num1+num2;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		// �� ���� int���� �Է¹ޱ�
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		/*
		int sum=a+b;
		System.out.println(sum);
		*/
		
//		Example01 cal=new Example01();
//		int hap=cal.sum1(a, b);
//		System.out.println(hap);
		
		sum(a,b);
		
		FuncTest05 f5=new FuncTest05();
		f5.channel="����";
		
	}

}
/*����������
public : �ش� ����� � Ŭ������ ��Ű������ ���� ����
protected : �ش� ����� ���� ��Ű�� ���� Ŭ����, �ش� Ŭ������ ����� Ŭ�������� ���� ����
default : �ش� ����� ���� ��Ű�� �� Ŭ������������ ���� ����(���� ������ ��� ���Ҷ��� ����)
private : �ش� ����� ����� Ŭ���� �������� ���� ����*/
