package controller;

public class ThreadCalc extends Thread {
	
	private int a;
	private int b;
	private int op;
	
	public ThreadCalc(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	@Override
	public void run() {
		calc();	
	}
	
	public void calc(){
		int tempo = op * 1000;
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String operacao = "";
		int res = 0;
		switch (op) {
		case 0:
			res = a + b;
			operacao = "+";
			break;
		case 1:
			res = a - b;
			operacao = "-";
			break;
		case 2:
			res = a * b;
			operacao = "*";
			break;
		case 3:
			res = a / b;
			operacao = "/";
			break;
		default:
			System.out.println("Erro opcao invalida");
			break;
		}
		System.out.println(a + " " + operacao + " " + b + " = " + res);
	}
}