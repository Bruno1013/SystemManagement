import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pacient extends Person {
    private String doencas;
    private String prescricoes;
    private String alergias;
    private String cuidadosEspeciais;
    protected ArrayList<LocalDateTime> consultas;
   
    public Pacient(String nome, int idade, String email, String nacionalidade, String sexo, Hospital hospital,Localidade localidade, String doencas, String prescricoes, String alergias, String cuidadosEspeciais) {
        super(nome, idade, email, nacionalidade, sexo, hospital, localidade);
        this.doencas = doencas;
        this.prescricoes = prescricoes;
        this.alergias = alergias;
        this.cuidadosEspeciais = cuidadosEspeciais;
        this.consultas = new ArrayList<LocalDateTime>();
    }

    public Pacient() {
    }

    public String getDoencas() {
        return doencas;
    }
    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }
    public String getPrescricoes() {
        return prescricoes;
    }
    public void setPrescricoes(String prescricoes) {
        this.prescricoes = prescricoes;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getCuidadosEspeciais() {
        return cuidadosEspeciais;
    }
    public void setCuidadosEspeciais(String cuidadosEspeciais) {
        this.cuidadosEspeciais = cuidadosEspeciais;
    }




    @Override
    public String toString() {
        return "\n\n" + super.toString() + "Doenças = " + doencas + ", \nPrescrições=" + prescricoes + ", \nAlergias=" + alergias
                + ", \nCuidados Especiais=" + cuidadosEspeciais + ", \nConsultas=" + consultas;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Doencas: " + doencas + ", prescricoes: " + prescricoes + ", alergias: " + alergias
        + ", cuidadosEspeciais: " + cuidadosEspeciais + ", consultas: " + consultas);
    }

    
}
