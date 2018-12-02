package controller;

import java.io.IOException;

public interface IArquivosController {
	public void lerDir(String dir) throws IOException;
	public void escreveArq(String dir, String arq) throws IOException;
	public void lerArq(String dir, String arq) throws IOException;
	public void abreApp(String dir, String arq) throws IOException;
}
