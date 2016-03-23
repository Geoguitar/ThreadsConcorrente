package br.com.aulaThreads.printThreads;

public class ImprimirThread_1 implements Runnable {
	
	String str;
	
	public ImprimirThread_1(String str){
		
		this.str = str;
	}
	
	public void run() {
		
		for(int i = 0; i > 100; i++){
			System.out.println(str);
		}
		
	}
}


