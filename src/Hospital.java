public class Hospital {
    private String nome;
    private int codigoPostal;
    private int telefone;
    private String email;
    
    public Hospital(String nome, int codigoPostal, int telefone, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.telefone = telefone;
        this.email = email;
    }

    public Hospital() {
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hospital: Nome = " + nome + ", codigoPostal = " + codigoPostal + ", telefone = " + telefone 
        + ", email = " + email;
    }

    
    
}
