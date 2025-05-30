package aplicacao;

import entidade.ServidorPublico;

public class Programa {
    public static void main(String [] args ){
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.com");
        isabela.setNome("João");
        isabela.calcularSalariohorasExtras(10, 5.60);


        System.out.println("Servidor: " + isabela.getNome());
        System.out.printf("Horas extras R$ % 2.f : "+isabela, ServidorPublico.getHorasExtras());
        isabela.calcularNumeros(4,6,28,56);










    }