public class RelatorioDiario implements Relatorio{

     @Override
    public void preparar() {
        System.out.println("Preparando relatório diário: coletando dados das últimas 24h");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório diário: métricas de volume e eficiência");
    }
    
    @Override
    public void formatar() {
        System.out.println("Formatando relatório diário: tabelas detalhadas com gráficos");
    }
}