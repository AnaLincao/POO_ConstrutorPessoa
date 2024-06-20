public class Pessoa{
  public String nome;
  public int rg;
  static int count; 

  public Pessoa(String nome){
    this.nome = nome;
    Pessoa.AddCount();
  }
  
  public Pessoa(String nome, int rg){
    this(nome);
    this.rg = rg;
  }

  static void AddCount(){
    count++;
  }

  void statusPessoa(){
    System.out.println("Pessoa - nome: " +this.nome + ", RG: "+this.rg);
  };
}
  