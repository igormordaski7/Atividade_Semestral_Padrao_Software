public class RelatorioSemanal implements Relatorio{

    public void preparar() {
        System.out.println("Preparando relatório semanal: consolidando dados de 7 dias");
    }
    
    @Override
    public void gerar() {
        System.out.println("Gerando relatório semanal: tendências e comparações semanais");
    }
    
    @Override
    public void formatar() {
        System.out.println("Formatando relatório semanal: relatório executivo com resumo");
    }
}
