import java.util.Scanner;

public class Opciones {

    double valorConvertir = 0;
    Errores caso = new Errores();
    int opcionUsuario = 0;

    String menu = """
                ********************************************************
               API conversor de moneda =)
                                
                1) Dolar → Peso Argentino
                2) Peso Argentino → Dolar
                3) Dolar → Real Brasileño
                4) real Brasileño → Dolar
                5) Dolar → Peso Colombiano
                6) Peso Colombiano → Dolar
                7) Salir
                Favor escoger la opcion de su interes
                                
                ********************************************************
                """;

    public void opcionesElegibles() {

        Scanner lectura = new Scanner(System.in);

        while (opcionUsuario != 7) {

            System.out.println(menu);

            try {
                opcionUsuario = lectura.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion NO permitida");
                opcionesElegibles();
            }
            switch (opcionUsuario) {

                case 1:
                    caso.primerCaso(valorConvertir);
                    break;

                case 2:

                    caso.segundoCaso(valorConvertir);
                    break;

                case 3:

                    caso.tercerCaso(valorConvertir);
                    break;

                case 4:

                    caso.cuartoCaso(valorConvertir);
                    break;

                case 5:

                    caso.quintoCaso(valorConvertir);
                    break;

                case 6:

                    caso.sextoCaso(valorConvertir);
                    break;

                case 7:

                    System.out.println("Fin. Te esperamos de nuevo");
                    break;

                default:

                    System.out.println("Esta opción no es permitida, favor intentar de nuevo");
                    break;

            }
        }
    }
}

