public abstract class CriadorRelatorios {

    public abstract Relatorio criarRelatorio();

    public void processarRelatorio() {
        Relatorio relatorio = criarRelatorio();
        relatorio.preparar();
        relatorio.gerar();
        relatorio.formatar();
        System.out.println("--- Relatório finalizado ---\n");
    }
}
