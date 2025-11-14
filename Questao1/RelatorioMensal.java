public class RelatorioMensal implements Relatorio{

    @Override
    public void preparar() {
        System.out.println("Preparando relatório mensal: consolidando dados de 30 dias");
    }
    
    @Override
    public void gerar() {
        System.out.println("Gerando relatório mensal: análise comparativa mensal");
    }
    
    @Override
    public void formatar() {
        System.out.println("Formatando relatório mensal: relatório completo com KPIs");
    }
}
