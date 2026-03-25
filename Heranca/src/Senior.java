public class Senior extends Desenvolvedor{
    private int verbaLider;

    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, int salarioBase, int verbaLider){
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }
}
