package org.example;

import entities.Linha;
import entities.Plano;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtivacao = LocalDate.parse("11/08/2023", formatter);
        String dataFormatada = formatter.format(dataAtivacao);
        System.out.println("\n*************************Cadastrando um plano********************************\n");
        Plano planoNatal = new Plano("Plano Natal",100, 50,0.55,1.00);
        System.out.println(planoNatal.toString());
        System.out.println("\n*****************************************************************************\n");
        System.out.println("\n*************************Cadastrando um cliente com ddd aceito***********************\n");
        Linha clienteUm = new Linha("11","94588-5082", dataFormatada, planoNatal);
        System.out.println(clienteUm.toString());
        System.out.println("\n*************************************************************************************\n");
        System.out.println("\n********************Cadastrando um cliente com ddd  nao aceito***********************\n");
        Linha clienteDois = new Linha("25","94588-5082", dataFormatada, planoNatal);
        System.out.println("\n**************************************************************************************\n");
        sc.close();
    }
}