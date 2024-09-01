package com.targetSistemas;

public class Desafio04 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es+ outros;

        //Exibindo os respectivos percentuais
        System.out.printf("Percentual de representação de SP: %.2f%%\n", calcularPercentual(sp,total));
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", calcularPercentual(rj,total));
        System.out.printf("Percentual de representação de MG: %.2f%%\n", calcularPercentual(mg,total));
        System.out.printf("Percentual de representação de ES: %.2f%%\n", calcularPercentual(es,total));
        System.out.printf("Percentual de representação de Outros: %.2f%%\n", calcularPercentual(outros,total));
    }

    public static double calcularPercentual(double local, double total){
        return(local / total) * 100;
    }
}
