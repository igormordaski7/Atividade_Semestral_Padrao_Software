public class RelatorioEmergencial implements Relatorio{

    @Override
    public void preparar() {
        System.out.println("Preparando relatório emergencial: dados críticos em tempo real");
    }
    
    @Override
    public void gerar() {
        System.out.println("Gerando relatório emergencial: alertas e indicadores prioritários");
    }
    
    @Override
    public void formatar() {
        System.out.println("Formatando relatório emergencial: formato simplificado para ação rápida");
    }
}
