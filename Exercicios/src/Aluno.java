public class Aluno {
    public String id, nome, curso;
    public int ra;

    Aluno(){

    }
    public Aluno(String id, String nome, String curso, int ra) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + this.id + '\'' +
                ", nome='" + this.nome + '\'' +
                ", curso='" + this.curso + '\'' +
                ", ra=" + this.ra +
                '}';
    }
}
