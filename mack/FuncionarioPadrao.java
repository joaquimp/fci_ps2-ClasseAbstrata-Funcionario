package mack;

public class FuncionarioPadrao extends Funcionario {

  public FuncionarioPadrao(String nome, float salario) {
    super(nome, salario);
  }
  
  public float calculaProventos() {
    return this.getSalario();
  }
}
