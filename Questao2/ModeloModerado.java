public class ModeloModerado implements ModeloRisco{

    @Override
    public double calcularRisco(double renda, double investimentos, double idade) {
        return (investimentos * 0.5) - (idade * 0.05) + renda * 0.03;
    }
}
