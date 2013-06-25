
public abstract class Funcionario {
	abstract float salario();
	abstract String nome();
	
	final String emitirSalario() {
		return nome() + " irá receber o salário de R$" + salario();
	}
}
