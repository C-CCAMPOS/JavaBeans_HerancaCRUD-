package principal;

import entitieis.Endereco;
import entitieis.Funcionario;
import repositorieis.Repository;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario(1, "Cleber Campos", "123.456.789-25", "025", 1500.00);

        System.out.println(funcionario);

        Endereco endereco = new Endereco("Rua Guarani", 40, "Casa", "Com. Soares", "N Iguaçu", "RJ", "26.262-200");

        funcionario.setEndereco(endereco);

        Repository repository = new Repository();

        try{
            repository.exportarDados(funcionario);
            System.out.println("Cadastrado com sucesso!");
        }
        catch(Exception e){
            System.out.println("\nErro" + e.getMessage());
        }

    }


}