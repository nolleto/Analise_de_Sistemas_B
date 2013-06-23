
public abstract class Funcionario {
	abstract void salario();
	
	final void emitirSalario() {
		salario();
	}
}
