import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);

    System.out.printf("O seu IMC é de %f kg/m²", imc);

    if( 25 < imc && imc < 29.9) {
      System.out.println("Você está acima do peso.");
    }

    if(30 < imc) {
      System.out.println("Você apresenta Obesidade de Grau I.");
    }
    if(18.5 < imc && imc < 24.9) {
      System.out.println("Você está no peso normal.");
    }
    if(17 < imc && imc < 18.4) {
      System.out.println("Você está abaixo do peso.");
    }
    if(16 < imc && imc < 17) {
      System.out.println("Você está muito abaixo do peso.");
    }
    if(35 < imc && imc < 39.9) {
      System.out.println("Você apresenta Obesidade de Grau II.");
    }
    if(40 < imc) {
      System.out.println("Você apresenta Obesidade de Grau III.");
    }

    
    sc.close();

    
  }


}