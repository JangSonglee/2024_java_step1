package chapter05;

import java.awt.DisplayMode;

import javax.swing.JOptionPane;

public class FuncTest04 {

	public static void Display(String A[]) {
		String res=""; //�󹮼�
		
		for(int i=0;i<A.length;i++) {
			res+=A[i]+" ";
		}//for
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "�迭�� ��Ұ�\n\n"+res);
	}
	
	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		Display(str);
		
		
	}

}
