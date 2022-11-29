import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        Hospital saoJoao = new Hospital("São João", 4050400, 932764214, "CHSJ@gmail.com");
        Hospital santoAntonio = new Hospital("Santo António", 4050678, 222054201, "CHU@gmail.com");

        Doctor a = new Doctor(
            "Diogo",
            30, 
            "Diogo@gmail.com", 
            "Portuguesa", 
            "Mascunlino", 
            saoJoao, 
            new Localidade("Portugal", "Porto", 4050120, 2, "Cedofeita"), 
            "Neurologia", 
            2, 
            10);
        

        Person b = new Doctor(
            "Diogo",
            30, 
            "Diogo@gmail.com", 
            "Portuguesa", 
            "Mascunlino", 
            santoAntonio, 
            new Localidade("Portugal", "Porto", 4050120, 2, "Cedofeita"), 
            "Neurologia", 
            2, 
            10);


        Pacient c = new Pacient(
            "Jose",
            16, 
            "Jose@gmail.com", 
            "francês", 
            "masculino", 
            santoAntonio, 
            new Localidade("Portugal", "Porto", 4050120, 2, "Cedofeita"),
            "nenhuma",
            "nenhuma",
            "nenhuma",
            "nenhum");

        Person d = (Person)a;
        
        a.consultas.add(LocalDateTime.of(1990, Month.FEBRUARY, 20, 12, 30));
        a.consultas.add(LocalDateTime.of(2015, Month.FEBRUARY, 15, 9, 15));

        //Antes de adicionar consulta
        System.out.println(a);
        
        System.out.println("\n\n(Exemplo de método para introduzir nova consulta)");
        a.setConsulta(c);
        
        //depois de adicionar consulta
        System.out.println(a);
        System.out.println(c);
    }
}
