package entities;

public class Funcionario {

	private Integer IdFuncionario;
	private String Nome;
	private String Cpf;
	private String Matricula;
	private String Cargo;
	private Double Salario;

	
	public Integer getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	
}
