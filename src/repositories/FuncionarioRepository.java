package repositories;

import java.io.FileWriter;
import entities.Funcionario;

public class FuncionarioRepository {
	
	private static final String PATH_ARQUIVO = "c:\\temp\\Funcionario.txt";
	
	public void exportarDados(Funcionario funcionario) throws Exception {
		
		FileWriter fileWriter = new FileWriter(PATH_ARQUIVO);
		
		fileWriter.write("Exercício 01 - Aula 01 do projeto 01");
		fileWriter.write("\n");
		fileWriter.write("\nId do funcionário: " + funcionario.getIdFuncionario());
		fileWriter.write("\nCargo do funcionário: " + funcionario.getCargo());
		fileWriter.write("\nCPF do funcionário: " + funcionario.getCpf());
		fileWriter.write("\nMatrícula do funcionario: " + funcionario.getMatricula());
		fileWriter.write("\nNome do funcionário: " + funcionario.getNome());
		fileWriter.write("\nSalário do funcionário" + funcionario.getSalario());
		
		fileWriter.flush();
		fileWriter.close();
	}
	
}
