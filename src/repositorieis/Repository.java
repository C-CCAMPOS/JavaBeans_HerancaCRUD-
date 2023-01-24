package repositorieis;

import entitieis.Funcionario;

import java.io.PrintWriter;

public class Repository {

    public void exportarDados(Funcionario funcionario) throws Exception {

        PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario.xml");

        printWriter.write("<?xml version='1.0' encoding='ISO-8859-1'?>");

        printWriter.write("<FUNCIONARIO>");
        printWriter.write("<ID>" + funcionario.getId() + "</ID>");
        printWriter.write("<NOME>" + funcionario.getNome() + "</NOME>");
        printWriter.write("<CPF>" + funcionario.getCpf() + "</CPF>");
        printWriter.write("<MATRICULA>" + funcionario.getMatricula() + "</MATRICULA>");
        printWriter.write("<SALARIO>" + funcionario.getSalario() + "</SALARIO>");
        printWriter.write("<ENDERECO>");
        printWriter.write("<LOGRADOURO>" + funcionario.getEndereco().getLogradouro() + "</LOGRADOURO>");
        printWriter.write("<NUMERO>" + funcionario.getEndereco().getNumero()+ "</NUMERO>");
        printWriter.write("<COMPLEMENTO>" + funcionario.getEndereco().getComplemento()+ "</COMPLEMENTO>");
        printWriter.write("<BAIRRO>" + funcionario.getEndereco().getBairro() + "</BAIRRO>");
        printWriter.write("<CIDADE>" + funcionario.getEndereco().getCidade() + "</CIDADE>");
        printWriter.write("<ESTADO>" + funcionario.getEndereco().getEstado()+ "</ESTADO>");
        printWriter.write("<CEP>" + funcionario.getEndereco().getCep() + "</CEP>");
        printWriter.write("</ENDERECO>");
        printWriter.write("</FUNCIONARIO>");

        printWriter.flush();
        printWriter.close();
    }


}
