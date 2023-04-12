public class MiPrograma {
    public static void main(String[] args) {


        //Verificar si una cadena es un número entero:
        String regex = "\\d+";
        String input = "1234E";
        System.out.println(input.matches(regex));


        //Verificar si una cadena es una dirección de correo electrónico válida:
        regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        input = "correo @example.com";
        System.out.println(input.matches(regex));


        //Verificar si una cadena es una URL válida:
        regex = "^(https?:\\/\\/)?([\\da-z\\.\\-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.\\-]*)*\\/?$";
        input = "www.ejemplo_com%";
        System.out.println(input.matches(regex));


        //Verificar si una cadena es una fecha en formato DD/MM/YYYY:
        regex = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/(\\d{4})$";
        input = "31/12/20217";
        System.out.println(input.matches(regex));


        //Verificar si una cadena contiene solo letras mayúsculas y/o minúsculas:
        regex = "^[a-zA-Z]+$";
        input = "holamundo1";
        System.out.println(input.matches(regex));


        //Verificar si una cadena es una dirección IPv4 válida:
        regex = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        input = "192.168.0.256";
        System.out.println(input.matches(regex));


        //Verificar si una cadena contiene solo números y letras:
        regex = "^[a-zA-Z0-9]+$";
        input = "Ejemplo123&";
        System.out.println(input.matches(regex));


        //Verificar si una cadena es una dirección MAC válida:
        regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
        input = "01:23:45:67:89:aR";
        System.out.println(input.matches(regex));

    }
}
