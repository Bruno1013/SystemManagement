import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Doctor extends Person {
    private String especialidade;
    private int numFuncionario;
    private int anosServico;
    protected ArrayList<LocalDateTime> consultas;
    
    Scanner scanner = new Scanner(System.in);

    public Doctor(String nome, int idade, String email, String nacionalidade, String sexo, Hospital hospital,Localidade localidade, String especialidade, int numFuncionario, int anosServico) {
        super(nome, idade, email, nacionalidade, sexo, hospital, localidade);
        this.especialidade = especialidade;
        this.numFuncionario = numFuncionario;
        this.anosServico = anosServico;
        this.consultas = new ArrayList<LocalDateTime>();
    }

    public Doctor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public int getNumFuncionario() {
        return numFuncionario;
    }
    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }
    public int getAnosServico() {
        return anosServico;
    }
    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    @Override
    public String toString() {
        return "\n\n" + super.toString() + "\nEspecialidade = " + especialidade + ", \nNúmero de Funcionario = " + numFuncionario 
        + ", \nAnos de serviço = "+ anosServico + ", \nConsultas = " + consultas;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    protected void setConsulta(Pacient pacient){
        System.out.print("Indique o ano da consulta:");
        int ano = scanner.nextInt();

        System.out.print("Indique o mês da consulta:");
        int mes = scanner.nextInt();
        
        System.out.print("Indique o dia da consulta:");
        int dia = scanner.nextInt();
        
        System.out.print("Indique a hora da consulta:");
        int hora = scanner.nextInt();

        System.out.print("Indique o minuto da consulta:");
        int minuto = scanner.nextInt();

        consultas.add(LocalDateTime.of(ano, mes, dia, hora, minuto));
        pacient.consultas.add(LocalDateTime.of(ano, mes, dia, hora, minuto));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void print(){
        super.print();
        System.out.println("\nEspecialidade: " + especialidade + ", \nNúmero de Funcionario: " + numFuncionario 
        + ", \nAnos de serviço: "+ anosServico + ", \nConsultas: " + consultas);
    }
}
