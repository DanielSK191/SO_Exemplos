package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {
	public static void main(String[] args){
		IArquivosController ac = new ArquivosController();
//		String dir = "C:\\Windows";
//		try {
//			ac.lerDir(dir);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String dir = "C:\\TEMP";
		String arq = "newFile.txt";
		try {
//			ac.escreveArq(dir, arq);
//			ac.lerArq(dir, arq);
			ac.abreApp(dir, arq);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}		
	}
}
