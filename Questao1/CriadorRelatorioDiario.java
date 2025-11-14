public class CriadorRelatorioDiario extends CriadorRelatorios{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioDiario();
    }
}
