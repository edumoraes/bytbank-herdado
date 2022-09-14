public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação Editor de Vídeo");
        return super.getSalario() * 0.1;
    }
}
