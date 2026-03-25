public class Junior extends Desenvolvedor{
    private String mentor;
    public Junior(){
        super();// chama construtor da super classe
    }
    public Junior(String nome, String linguagem, int salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = nome;
    }
}
