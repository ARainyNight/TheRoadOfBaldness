package com.junit.test;

public class Calculator {
	private static int result; //��̬���������ڴ洢���н��
	public void add(int n){
		result=result+n;
	}
	public void substract(int n){
		result=result-1; //Bug:��ȷ��Ӧ����result=result-n
	}
	public void multiply(int n){
		
	}//�˷�����δд��
	public void divide(int n)throws Exception{
		if(n==0)
			throw new Exception("��������Ϊ0");
		result=result/n;
	}
	public void square(int n){
		result=n*n;
	}
	public void squareRoot(int   n){
		for(;;);         //Bug:��ѭ��
	}
	public void clear(){  //���������
		result=0;
	}
}
