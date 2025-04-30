/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author ANDERSONSANTIAGODELI
 */
public class Vendedor {
    private String Nome ;
    private int Idade;
    private double Salario;
    private String sexo;

    public Vendedor() {
    }

    public Vendedor(String Nome, int Idade, double Salario, String sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Salario = Salario;
        this.sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void imprimirValorFerias(){
        double ferias = Salario+ (Salario/3);
        System.out.println("o valor a receber nas ferias é "+ ferias);
    }
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Binho", 14,200,"F");
        vendedor.imprimirValorFerias();
        System.out.println("o bonus dela é " + vendedor.calcularBonusMulheres());
    }
    public double calcularBonusMulheres(){
        double bonus = 0;
        if(sexo.equalsIgnoreCase("F")){
            bonus = Salario * 0.10;
        }else{
            bonus = 0;
        }
       return bonus;
    }
}
