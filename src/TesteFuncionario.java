public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Eduardo");
        g1.setCpf("123456789-00");
        g1.setSalario(15000.00);
        g1.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(222);

        Cliente cl = new Cliente();
        cl.setSenha(222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(adm);
        si.autentica(cl);


    }
}
