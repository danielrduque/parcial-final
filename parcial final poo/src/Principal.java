public class Principal {
    public static void main(String[] args) {

        LibroFisico libroFisico1 = new LibroFisico("Naruto: El Camino del Ninja", "Masashi Kishimoto", 2000, 220);
        LibroFisico libroFisico2 = new LibroFisico("One Piece: Aventuras en el Grand Line", "Eiichiro Oda", 1997, 1000);
        LibroFisico libroFisico3 = new LibroFisico("Attack on Titan: El Asedio de los Titanes", "Hajime Isayama", 2009, 139);
        LibroFisico libroFisico4 = new LibroFisico("My Hero Academia: El Ascenso de los Héroes", "Kohei Horikoshi", 2014, 348);
        LibroFisico libroFisico5 = new LibroFisico("Dragon Ball: La Búsqueda de las Esferas del Dragón", "Akira Toriyama", 1984, 153);
        LibroElectronico libroElectronico1 = new LibroElectronico("Naruto: El Camino del Ninja", "Masashi Kishimoto", 2000, "EPUB");
        LibroElectronico libroElectronico2 = new LibroElectronico("One Piece: Aventuras en el Grand Line", "Eiichiro Oda", 1997, "PDF");
        LibroElectronico libroElectronico3 = new LibroElectronico("Attack on Titan: El Asedio de los Titanes", "Hajime Isayama", 2009, "EPUB");
        LibroElectronico libroElectronico4 = new LibroElectronico("My Hero Academia: El Ascenso de los Héroes", "Kohei Horikoshi", 2014, "PDF");
        LibroElectronico libroElectronico5 = new LibroElectronico("Dragon Ball: La Búsqueda de las Esferas del Dragón", "Akira Toriyama", 1984, "EPUB");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroFisico3);
        biblioteca.agregarLibro(libroFisico4);
        biblioteca.agregarLibro(libroFisico5);
        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroElectronico2);
        biblioteca.agregarLibro(libroElectronico3);
        biblioteca.agregarLibro(libroElectronico4);
        biblioteca.agregarLibro(libroElectronico5);

        System.out.println(" ");
        biblioteca.imprimirLibros();
    }
}



