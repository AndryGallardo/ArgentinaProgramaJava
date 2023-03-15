import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class Archivos {
    public static void main(String[] args) throws IOException {



        int numero = Integer.parseInt("P");

//        String direccionArchivo = "/Users/jandres/Documents/ArgentinaPrograma/Clase4/ventas.csv" ;

//        for (String linea : Files.readAllLines(Paths.get(direccionArchivo))) {
//            System.out.println(linea);
//        }

        //Files.writeString(Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase4/Archivo1.txt" ), "Texto nuevo", StandardOpenOption.APPEND);
//
        Path unArchivo = Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase4/ProdSamplTrans.txt");
        System.out.println(unArchivo.toAbsolutePath());

        FileTime lastModifiedTime = Files.getLastModifiedTime(unArchivo);
        System.out.println(lastModifiedTime);

        Path otroArch = Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase4");
        System.out.println(Files.exists(otroArch));

        //Files.createFile(otroArch);
        //System.out.println(Files.exists(otroArch));

        //Path unTemporal = Files.createTempFile("unArchivoTemporal",".txt");
        //System.out.println(unTemporal.toAbsolutePath());

        System.out.println("Es una carperta ? : " + Files.isDirectory(otroArch) );

        Path arch1 = Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase4/Archivo1.txt" );
        Path arch2 = Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase4/Archivo2.txt" );
        Path arch3 = Paths.get("/Users/jandres/Documents/ArgentinaPrograma/Clase3/Archivo3.txt" );



        //Files.copy(arch1, arch2);
        //Files.move(arch1, arch3);

//        Path utfFile = Files.createTempFile("some", ".txt");
//        Files.write(utfFile, "un texto \n con eñes ".getBytes()); // UTF 8
         //Files.write(utfFile, (System.lineSeparator() + "y acentos á ").getBytes(), StandardOpenOption.APPEND);
//        System.out.println(utfFile.toAbsolutePath());
//        System.out.println(Files.readAllLines(utfFile) .size());
//        for (String line: Files.readAllLines(utfFile) ) {
//            System.out.println(line);
//        }


        Path iso88591File = Files.createTempFile("some", ".txt");
        Files.write(iso88591File, "otro texto con eñes".getBytes(StandardCharsets.ISO_8859_1));
        System.out.println(iso88591File.toAbsolutePath());

    }
}
