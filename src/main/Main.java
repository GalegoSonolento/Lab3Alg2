package main;

import funcionarios.CriacaoDeFuncionarios;

public class Main {
    public static void main(String[] args){
        CriacaoDeFuncionarios cria1 = new CriacaoDeFuncionarios(10);
        cria1.criandoFuncionarios();
        cria1.relacaoFuncionarios();
    }
}
