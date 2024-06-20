class Main {
  public static void main(String[] args) {
    
    Aluno aluno = new Aluno("Aluno1", 123, 900, "ADS");
    
    Funcionario funcionario = new Funcionario("Funcionario1", 456, "TI", "Professor");

    System.out.println("Count aluno: " +Aluno.count);
   
    System.out.println("Count pessoa: " +Pessoa.count);
    
    aluno.statusAluno();
    funcionario.statusFuncionario();
    aluno.statusPessoa();
    funcionario.statusPessoa(); 
  }
}