package mack;

public class FuncionarioComissionado extends Funcionario {
  private float vendas;
  private float percentual;
  
  public FuncionarioComissionado(String nome, float salario, float vendas, float percentual) {
    super(nome, salario);
    this.vendas = vendas;
    this.percentual = percentual;
  }
  
  public float calculaProventos() {
    return this.getSalario() + calcularComissao();
  }

  public float calcularComissao() {
    return vendas * percentual;
  }
}