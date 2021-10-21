package main.java;

public class Main {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    String function = args[0];
    int num1 = Integer.parseInt(args[1]);

    if (args.length == 2){
      if (function.equals("fibonacci")){
        System.out.println(calc.fibonacciNumberFinder(num1));
      }
      else if (function.equals("binary")){
        System.out.println(calc.intToBinaryNumber(num1));
      }
    }else {
      int num2 = Integer.parseInt(args[2]);

      if (function.equals("add")) {
        System.out.println(calc.add(num1, num2));
      }
      else if (function.equals("subtract")){
        System.out.println(calc.subtract(num1, num2));
      }
      else if (function.equals("multiply")){
        System.out.println(calc.multiply(num1, num2));
      }
      else if (function.equals("divide")){
        System.out.println(calc.divide(num1, num2));
      }
    }

  }
}
