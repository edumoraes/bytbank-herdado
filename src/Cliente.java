public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticador;
    public Cliente() {
        //a classe está usando outra classe no construtor, isso é composição
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticador.autentica(senha);
        return autenticou;
    }
}
