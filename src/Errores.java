import java.util.Scanner;

public class Errores {

    double valorNuevo = 0;

    public void primerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedaConvertir = new API();

        System.out.println("Digita los Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedasConvertir.AtraerApi("USD", "ARS", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            primerCaso(valorNuevo);
        }
    }

    public void segundoCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();

        System.out.println("Digita los Pesos Argentinos a convertir");
        try {
            valor = lectura.nextDouble();
            monedasConvertir.AtraerApi("ARS", "USD", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            segundoCaso(valorNuevo);
        }
    }

    public void tercerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedaConvertir = new API();

        System.out.println("Digita los de Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedaConvertir.AtraerApi("USD", "BRL", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            tercerCaso(valorNuevo);
        }
    }

    public void cuartoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasConvertir = new API();

        System.out.println("Digita los Reales Brasileños a convertir");
        try {
            valor = lectura.nextDouble();
            monedaConvertir.AtraerApi("BRL", "USD", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            cuartoCaso(valorNuevo);
        }
    }

    public void quintoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedaConvertir = new API();

        System.out.println("Digita los Dolares a convertir");
        try {
            valor = lectura.nextDouble();
            monedaConvertir.obtencionDeApi("USD", "COP", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            quintoCaso(valorNuevo);
        }
    }

    public void sextoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedaConvertir = new API();

        System.out.println("Digita los Pesos Colombianos a convertir");
        try {
            valor = lectura.nextDouble();
            monedaConvertir.obtencionDeApi("COP", "USD", valor);
        } catch (Exception i) {
            System.out.println("Debes escribir la cantidad numerica");
            sextoCaso(valorNuevo);
        }
    }
}

