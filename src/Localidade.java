public class Localidade {
    private String pais;
    private String distrito;
    private int codigoPostal;
    private int numPorta;
    private String rua;

    public Localidade(String pais, String distrito, int codigoPostal, int numPorta, String rua) {
        this.pais = pais;
        this.distrito = distrito;
        this.codigoPostal = codigoPostal;
        this.numPorta = numPorta;
        this.rua = rua;
    }

    public Localidade() {
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public int getNumPorta() {
        return numPorta;
    }
    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Localidade: Pais = " + pais + ", Distrito = " + distrito + ", CodigoPostal = " + codigoPostal + ", NumPorta = "
                + numPorta + ", Rua = " + rua;
    }

    
}
