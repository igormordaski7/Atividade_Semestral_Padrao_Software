public class CriadorRelatorioMensal extends CriadorRelatorios{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioMensal();
    }
}
