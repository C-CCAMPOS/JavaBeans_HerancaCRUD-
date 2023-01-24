package entitieis;

public class Funcionario extends Pessoa {

    private String cpf;
    private String matricula;
    private Double salario;
    private Endereco endereco;

    public Funcionario() {
    }


    public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario) {
        super(id, nome);
        this.cpf = cpf;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "[Id= " + getId() + ", Nome= " + getNome() + ", Cpf= " + cpf + ", Matricula= " + matricula + ", Salario= R$ " + salario + "]";
    }

}