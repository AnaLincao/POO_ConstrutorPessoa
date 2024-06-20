public class Funcionario extends Pessoa{
  public String funcao;
  public String setor;

  public Funcionario(String nome, int rg, String setor){
    super(nome, rg);
    this.setor = setor;
  }
  
  public Funcionario(String nome, int rg, String setor, String funcao){
    this(nome, rg, setor);
    this.funcao = funcao;
  }

  void statusFuncionario(){
    System.out.println("Funcionario - funcao: " +this.funcao + ", Setor: "+this.setor);
  };
}
  