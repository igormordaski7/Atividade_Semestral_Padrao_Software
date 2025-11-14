public class ModeloAgressivo implements ModeloRisco{

    @Override
    public double calcularRisco(double renda, double investimentos, double idade) {
        return (investimentos * 0.8) - (idade * 0.1) + renda * 0.05;
    }
}
