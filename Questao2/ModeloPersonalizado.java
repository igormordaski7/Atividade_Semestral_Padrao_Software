// NOVO MODELO ADICIONADO - SEM ALTERAR O EXISTENTE
public class ModeloPersonalizado implements ModeloRisco{

    @Override
    public double calcularRisco(double renda, double investimentos, double idade) {
        return (investimentos * 0.6) - (idade * 0.08) + renda * 0.04;
    }
}
