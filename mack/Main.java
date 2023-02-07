package mack;

class Main {
  public static void main(String[] args) {
    Funcionario f = new FuncionarioPadrao("Joaquim", 5_000.33f);
    System.out.print("Funcionario " + f.getNome());
    System.out.print(", salario R$ " + f.getSalario());
    System.out.println(", proventos R$ " + f.calculaProventos());

    Funcionario fc = new FuncionarioComissionado("Joaquim", 5_000.33f, 1_000.00f, 0.05f);
    System.out.print("Funcionario " + fc.getNome());
    System.out.print(", salario R$ " + fc.getSalario());
    System.out.println(", proventos R$ " + fc.calculaProventos());
  }
}