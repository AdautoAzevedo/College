package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import apresentacao.Output;

public class Escrita {

	public void escrever(String msg, String caminho) {
		
	try {	
		FileWriter fw= new FileWriter(new File(caminho));
		fw.write(msg);
		Output output = new Output(msg);
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
}
