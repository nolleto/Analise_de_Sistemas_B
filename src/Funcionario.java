
public abstract class Funcionario {
	abstract float salario();
	abstract String nome();
	
	final String emitirSalario() {
		return nome() + " ir� receber o sal�rio de R$" + salario();
	}
}
