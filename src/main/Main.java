package main;

import main.com.conversormoedas.api.CurrencyConverterService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String moeda = sc.nextLine().toUpperCase();

        System.out.println(CurrencyConverterService.currencyApi(moeda));
    }
}