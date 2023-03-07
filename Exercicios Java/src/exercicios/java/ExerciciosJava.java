/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.java;
import java.util.Scanner;

/**
 *
 * @author 36127512022.1
 */
public class ExerciciosJava {
    
static void exercicio1(){
    int estoqueMedio,qntMin,qntMax;
    Scanner input = new Scanner(System.in);
    System.out.println("Insira a Quantidade Minima!");
    qntMin = input.nextInt();
    System.out.println("Insira a Quantidade Maxima!");
    qntMax = input.nextInt();
    estoqueMedio = (qntMin+qntMax)/2;
    System.out.println("Estoque medio = "+ estoqueMedio);
}
static void exercicio2(){
 double cota,valorReal,valorDolar;
 Scanner input = new Scanner(System.in);
 cota = 0.19;
 int op;
        System.out.println("Selecione uma Opcao");
        System.out.println("1 para conversao de dolar para real");
        System.out.println("2 para conversao de real para dolar");
        op = input.nextInt();

                
      
    switch(op){
    case(1) -> {
        System.out.println("Insira o valor em dolares");
        valorDolar = input.nextDouble();
        valorReal = (valorDolar/cota);
        System.out.println("Valor em Reais = "+valorReal);
            }
    case(2) -> {
        System.out.println("Insira o valor em Reais");
        valorReal = input.nextDouble();
        valorDolar = (valorReal*cota);
        System.out.println("Valor em Dolares = "+valorDolar);
            }
    default -> {
        System.out.println("Opcao errada, TCHAU!");
        break;   }
    }
}
static void exercicio3(){
    int op;
    double celsius,fahrenheit,kelvin;
    Scanner input = new Scanner(System.in);
System.out.println("==================================================================");
System.out.println("Conversor de temperaturas Universal: Celsius, Kelvin, Fahrenheit");
System.out.println("Celsius = ºC");
System.out.println("Kelvin = ºK");
System.out.println("Fahrenheit = ºF");
System.out.println("==================================================================");

System.out.println("[1] Celsius para Fahrenheit");
System.out.println("[2] Celsius para Kelvin");
System.out.println("[3] Fahrenheit para Celsius");
System.out.println("[4] Fahrenheit para Kelvin");
System.out.println("[5] Kelvin para Fahrenheit");
System.out.println("[6] Kelvin para Celsius");
System.out.println("Digite o numero para a conversão:");
op = input.nextInt();
//limitar as opções de OP
while ((op<1) || (op>6)) {
System.out.println("[1] Celsius para Fahrenheit");
System.out.println("[2] Celsius para Kelvin");
System.out.println("[3] Fahrenheit para Celsius");
System.out.println("[4] Fahrenheit para Kelvin");
System.out.println("[5] Kelvin para Fahrenheit");
System.out.println("[6] Kelvin para Celsius");
System.out.println("Digite o numero para a conversão:");
op = input.nextInt();
}

if (op==1) {
System.out.println("Digite a temperatura em Celsius:");
celsius = input.nextDouble();
fahrenheit = ((celsius/100)*180)+32;
System.out.printf("%.2f ºF", fahrenheit);
}

if (op==2) {
System.out.println("Digite a temperatura em Celsius:");
celsius = input.nextDouble();
kelvin = celsius+273.15;
System.out.printf("%.2f K", kelvin);
}

if (op==3) {
System.out.println("Digite a temperatura em Fahrenheit:");
fahrenheit = input.nextDouble();
celsius = ((fahrenheit-32)/1.8);
System.out.printf("%.2f ºC", celsius);
}

if (op==4) {
System.out.println("Digite a temperatura em Fahrenheit:");
fahrenheit = input.nextDouble();
kelvin = (((fahrenheit-32)/(5/9))+273);
System.out.printf("%.2f K", kelvin);
}

if (op==5) {
System.out.println("Digite a temperatura em Kelvin:");
kelvin = input.nextDouble();
celsius = kelvin-273;
System.out.printf("%.2f ºC", celsius);
}

if (op==6) {
System.out.println("Digite a temperatura em Kelvin:");
kelvin = input.nextDouble();
fahrenheit = ((kelvin-273)*1.8)+32;
System.out.printf("%.2f ºF", fahrenheit);
}
}
static void exercicio4(){
    float peso, altura, media;
    String nome;
Scanner input = new Scanner(System.in);
    // Seção de Comandos, procedimento, funções, operadores, etc...
    System.out.print("Insira o nome do paciente: ");
    nome = input.nextLine();
    System.out.print("Insira o peso do paciente: ");
    peso = input.nextFloat();
    System.out.print("Insira a altura do paciente: ");
    altura = (input.nextFloat()/100);

    media = peso/(altura*altura);

    if (media > 40.0) {
      System.out.println("O paciente " + nome + " esta com obesidade grave");
    } else if (media > 30.0) {
      System.out.println("O paciente " + nome + " esta com obesidade normal");
    } else if (media > 25.0) {
      System.out.println("O paciente " + nome + " esta com sobrepeso");
    } else {
      System.out.println("O paciente " + nome + " esta normal");
    }
  }

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o numero equivalente ao exercicio que deseja: ");
        System.out.print("1 para Media de estoque");
        System.out.print("2 para conversor entre dolar e real");
        System.out.print("3 para conversor de temperaturas");
        System.out.print("4 para calculadora de IMC");
        
        opcao = input.nextInt();
        
        switch (opcao) {
            case 1 -> exercicio1();
            case 2-> exercicio2();
            case 3 ->exercicio3();
            case 4 ->exercicio4();
        }


    }
    
}
