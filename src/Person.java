public abstract class Person {
    private String nome;
    private int idade;
    private String email;
    private String nacionalidade;
    private String sexo;
    private Hospital hospital;
    private Localidade localidade;
    
    public Person() {
    }

    public Person(String nome, int idade, String email, String nacionalidade, String sexo, Hospital hospital, Localidade localidade) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.hospital = hospital;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Hospital getHospital() {
        return hospital;
    }
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public Localidade getLocalidade() {
        return localidade;
    }
    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome + ", \nIdade = " + idade + ", \nEmail = " + email + ", \nNacionalidade = " + nacionalidade
                + ", \nSexo = " + sexo + "\n" + hospital + ",\n" + localidade;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print(){
        System.out.println("Nome: " + nome + ", \nIdade: " + idade + ", \nEmail: " + email + ", \nNacionalidade: " + nacionalidade
        + ", \nSexo: " + sexo + "\n" + hospital + ",\n" + localidade);
    }

    
    
}
