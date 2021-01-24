package principal;

import entities.Funcionario;
import repositories.FuncionarioRepository;
import util.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.setIdFuncionario(ScannerUtil.lerInteiro("Informe o ID do funcion�rio: "));
			funcionario.setNome(ScannerUtil.lerTexto("Informe o nome do funcion�rio: "));
			funcionario.setCpf(ScannerUtil.lerTexto("Informe o CPF do funcion�rio: "));
			funcionario.setCargo(ScannerUtil.lerTexto("Informe o cargo do funcion�rio: "));
			funcionario.setMatricula(ScannerUtil.lerTexto("Informe a matr�cula do funcion�rio: "));
			funcionario.setSalario(ScannerUtil.lerDecimal("Informe o sal�rio do funcion�rio: "));
			
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
			System.out.println("\nARQUIVO GRAVADO COM SUCESSO!");
			
			
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	
		
	}

}
