public class SistemaLogistica {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RELATÓRIOS DE LOGÍSTICA ===\n");
        
        CriadorRelatorios criadorDiario = new CriadorRelatorioDiario();
        CriadorRelatorios criadorSemanal = new CriadorRelatorioSemanal();
        CriadorRelatorios criadorEmergencial = new CriadorRelatorioEmergencial();
        
        System.out.println("Processando relatório diário:");
        criadorDiario.processarRelatorio();
        
        System.out.println("Processando relatório semanal:");
        criadorSemanal.processarRelatorio();
        
        System.out.println("Processando relatório emergencial:");
        criadorEmergencial.processarRelatorio();

        // NOVO RELATÓRIO - SEM ALTERAR CÓDIGO EXISTENTE
        CriadorRelatorios criadorMensal = new CriadorRelatorioMensal();
        System.out.println("Processando relatório mensal:");
        criadorMensal.processarRelatorio();
    }
}
