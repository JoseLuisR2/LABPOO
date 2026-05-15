public class Motor {

    protected String tipoCombustible;
    protected int potenciaEmpuje;

    public Motor(String tipo, int potencia) {
        this.tipoCombustible = tipo;
        this.potenciaEmpuje = potencia;
    }


    @Override
    public String toString() {
        return "Unidad de Propulsión " + tipoCombustible + " con empuje de " + potenciaEmpuje + " kN";
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getPotenciaEmpuje() {
        return potenciaEmpuje;
    }
}