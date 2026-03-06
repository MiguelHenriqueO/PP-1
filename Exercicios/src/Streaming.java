public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano, String ultimoFilmeAssistido) {
        this.usuario = usuario;
        this.ativo = true;
        this.ultimoFilmeAssistido = ultimoFilmeAssistido;
        this.plano = plano;
    }

    public void getMensalidade(){
        if (this.plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }else if (this.plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        }else if (this.plano.equals("Familia")) {
            this.mensalidade = 60.90f;
        }
    }



}

