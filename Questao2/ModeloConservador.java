public class ModeloConservador implements ModeloRisco{

    @Override
    public double calcularRisco(double renda, double investimentos, double idade) {
        return (investimentos * 0.2) - (idade * 0.02) + renda * 0.01;
    }
}
