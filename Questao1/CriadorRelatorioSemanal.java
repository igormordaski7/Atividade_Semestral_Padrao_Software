public class CriadorRelatorioSemanal extends CriadorRelatorios{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSemanal();
    }
}
