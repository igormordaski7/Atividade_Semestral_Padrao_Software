public class CalculadoraPerfilRisco {

    private ModeloRisco modelo; 

    public void setModelo(ModeloRisco modelo) {
        this.modelo = modelo;
    }

    public double executarCalculo(double renda, double investimentos, double idade) {
        return modelo.calcularRisco(renda, investimentos, idade);
    }
}
