package Desenvolvedor;

public class Pleno extends Desenvolvedor {
    private int projetosEntr;

    public  Pleno(){
        super();
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntr){
        super(nome, linguagem, salarioBase);
        this.projetosEntr = projetosEntr;
    }
}
