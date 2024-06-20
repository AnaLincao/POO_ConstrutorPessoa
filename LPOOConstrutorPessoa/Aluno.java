public class Aluno extends Pessoa{
  public String curso;
  public int ra;
  static int count;  

  public Aluno(String nome, int rg, int ra, String curso){
    super (nome, rg);
    this.ra = ra;
    this.curso = curso;
    Aluno.AddCount();
  }
  
  static void AddCount(){
    count++;
  }
  
  void statusAluno(){
    System.out.println("\nAluno - Curso: " +this.curso + ", RA: "+this.ra);
  }
}