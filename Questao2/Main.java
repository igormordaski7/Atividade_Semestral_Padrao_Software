public class Main {

    public static void main(String[] args) {
        
        CalculadoraPerfilRisco calc = new CalculadoraPerfilRisco();

        System.out.println("\n=== ANÁLISE DE PERFIL DE RISCO ===");

        // Agressivo
        calc.setModelo(new ModeloAgressivo());
        System.out.println("Risco Agressivo: " + calc.executarCalculo(5000, 20000, 25));

        // Moderado
        calc.setModelo(new ModeloModerado());
        System.out.println("Risco Moderado: " + calc.executarCalculo(5000, 20000, 25));

        // Conservador
        calc.setModelo(new ModeloConservador());
        System.out.println("Risco Conservador: " + calc.executarCalculo(5000, 20000, 25));
    }
}
