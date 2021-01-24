package principal;

import entities.Funcionario;
import repositories.FuncionarioRepository;
import util.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.setIdFuncionario(ScannerUtil.lerInteiro("Informe o ID do funcionário: "));
			funcionario.setNome(ScannerUtil.lerTexto("Informe o nome do funcionário: "));
			funcionario.setCpf(ScannerUtil.lerTexto("Informe o CPF do funcionário: "));
			funcionario.setCargo(ScannerUtil.lerTexto("Informe o cargo do funcionário: "));
			funcionario.setMatricula(ScannerUtil.lerTexto("Informe a matrícula do funcionário: "));
			funcionario.setSalario(ScannerUtil.lerDecimal("Informe o salário do funcionário: "));
			
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
			System.out.println("\nARQUIVO GRAVADO COM SUCESSO!");
			
			
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	
		
	}

}
