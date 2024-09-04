package com.targetSistemas;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Desafio03 {
    public static void main(String[] args) {
        String jsonFilePath = "dados.json"; // Caminho para o arquivo JSON

        try {
            // Ler o JSON do arquivo
            FileReader reader = new FileReader(jsonFilePath);
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            reader.close();

            // Parsear o JSON

            JSONArray faturamentoDiario = new JSONArray(sb.toString());

            List<Double> valores = new ArrayList<>();
            double soma = 0;
            int diasComFaturamento = 0;

            // Encontrando o menor e maior valor e calcular a média

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;

            for (int i = 0; i < faturamentoDiario.length(); i++) {
                JSONObject dia = faturamentoDiario.getJSONObject(i);
                double valor = dia.getDouble("valor");

                if (valor > 0) {
                    valores.add(valor);
                    soma += valor;
                    diasComFaturamento++;

                    if (valor < menorValor) {
                        menorValor = valor;
                    }

                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                }
            }

            double media = diasComFaturamento > 0 ? soma / diasComFaturamento : 0;
            int diasAcimaDaMedia = 0;

            for (double valor : valores) {
                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            // Imprimindo resultados
            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
