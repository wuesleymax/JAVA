package aulas;
class Pessoa {
    int idade; 
    String nome;
    int Altura;
}


class Dados{

    String name;
    String data_nasc;
    String email;
    Endereco endereco;

    public Dados () {
        System.out.println("Dado novo");
        data_nasc= "00/00/0000";
        endereco = new Endereco();
    
        
    }

    public void setNome(String n) {
    name = n;
    }

    public void setDataNasc(String d) {
    data_nasc = d;
    }

    public void setEmail(String e) {
    email = e;
    }

    public void setEndereco(String rua, int numero, String cidade, String estado, String CEP, String pais){
        endereco.rua = rua;
        endereco.numero = numero;
        endereco.cidade = cidade;
        endereco.estado = estado;
        endereco.CEP = CEP;
        endereco.pais = pais;
    
}
public String getNome() {
    return name;
}

public String getDataNasc() {
    return data_nasc;
}

public String getEmail() {
    return email;
}

public Endereco getEndereco() {
    return endereco;
}
}







class Endereco{
   String rua;
    int numero;
   String cidade;
   String estado;
   String CEP;
   String pais;

}










public class Aula33{
    public static void aula() {
        System.out.println("## Registros##");

        ex03();
    }


public static void ex01() {
    Pessoa darlon = new Pessoa();
    Pessoa paulo = new Pessoa();

    darlon.idade = 28;
    darlon.nome = "Darlon Vasata";
    mostrarPessoa(darlon);

    paulo.idade = 25;
    paulo.nome = "Paulo Silva";
    mostrarPessoa(paulo);}


    public static void mostrarPessoa(Pessoa p) {
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Altura: " + p.Altura);
    }

    public static void ex02() {
        Dados darlon = new Dados();
       Dados paulo = new Dados();

        darlon.setNome("Darlon Vasata");
        darlon.setDataNasc(null);
        darlon.setEmail("darlon@example.com");
        darlon.setEndereco("Av. Brasil", 100, "São Paulo", "SP", "01234-567", "Brasil");
        mostrarDados(darlon);
   
    

        paulo.setNome("Paulo Silva");
        paulo.setDataNasc("20/05/1995");
        paulo.setEmail("paulo@example.com");
        paulo.setEndereco("Rua dos Bobos", 200, "Rio de Janeiro", "RJ", "12345-678", "Brasil");
        mostrarDados(paulo);
        

}

public static void ex03(){
    Dados[] pessoas = new Dados[10];
    int i;

    Dados p1;
    p1 = new Dados();
    p1.setNome("Wesley Silva");
    p1.setDataNasc("20/05/1995");
    p1.setEmail("wesley@example.com");
    p1.setEndereco("Rua dos Bobos", 200, "Rio de Janeiro", "RJ", "12345-678", "Brasil");
    pessoas[0] = p1;
    pessoas[1] = new Dados();
    pessoas[1].setNome("Maria Silva");
    pessoas[1].setDataNasc("15/08/1990");
    pessoas[1].setEmail("maria@example.com");
    pessoas[1].setEndereco("Av. Brasil", 100, "São Paulo", "SP", "01234-567", "Brasil");
    pessoas[2] = new Dados();
    pessoas[2].setNome("Pedro Silva");
    pessoas[2].setDataNasc("05/02/1992");
    pessoas[2].setEmail("pedro@example.com");
    pessoas[2].setEndereco("Rua das Flores", 300, "Rio de Janeiro", "RJ", "12345-678", "Brasil");
    pessoas[3] = new Dados();
    pessoas[3].setNome("Julia Silva");
    pessoas[3].setDataNasc("25/07/1985");
    pessoas[3].setEmail("julia@example.com");
    pessoas[3].setEndereco("Av. Brasil", 100, "São Paulo", "SP", "01234-567", "Brasil");
    pessoas[4] = new Dados();
    pessoas[4].setNome("Marcos Silva");
    pessoas[4].setDataNasc("10/10/1980");
    
            

    for (i=0; i<pessoas.length; i++){
        pessoas[i] = new Dados();
       
        
    }



}

public static void mostrarDados ( Dados d) {
    // System.out.println("Nome: " + d.getNome());
    // System.out.println("Data de Nascimento: " + d.getDataNasc());
    // System.out.println("Email: " + d.getEmail());
    // System.out.println("Endereço: ");
    // System.out.println("Rua: " + d.getEndereco().rua);
    // System.out.println("Numero: " + d.getEndereco().numero);
    // System.out.println("Cidade: " + d.getEndereco().cidade);
    // System.out.println("Estado: " + d.getEndereco().estado);
    // System.out.println("CEP: " + d.getEndereco().CEP);
    // System.out.println("País: " + d.getEndereco().pais);
   
}


}



