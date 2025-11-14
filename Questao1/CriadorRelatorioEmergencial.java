public class CriadorRelatorioEmergencial extends CriadorRelatorios{

    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioEmergencial();
    }
}
