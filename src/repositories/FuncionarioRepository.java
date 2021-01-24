package repositories;

import java.io.FileWriter;
import entities.Funcionario;

public class FuncionarioRepository {
	
	private static final String PATH_ARQUIVO = "c:\\temp\\Funcionario.txt";
	
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		FileWriter fileWriter = new FileWriter(PATH_ARQUIVO);
		
		fileWriter.write("Exerc�cio 01 - Aula 01 do projeto 01");
		fileWriter.write("\n");
		fileWriter.write("\nId do funcion�rio: " + funcionario.getIdFuncionario());
		fileWriter.write("\nCargo do funcion�rio: " + funcionario.getCargo());
		fileWriter.write("\nCPF do funcion�rio: " + funcionario.getCpf());
		fileWriter.write("\nMatr�cula do funcionario: " + funcionario.getMatricula());
		fileWriter.write("\nNome do funcion�rio: " + funcionario.getNome());
		fileWriter.write("\nSal�rio do funcion�rio" + funcionario.getSalario());
		
		fileWriter.flush();
		fileWriter.close();
	}
	
}
