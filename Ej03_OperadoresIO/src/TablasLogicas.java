public class TablasLogicas {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("         TABLAS DE VERDAD LÓGICAS      ");
        System.out.println("=======================================\n");

        // Tabla AND
        System.out.println("------------ TABLA AND (Y) ------------");
        System.out.println("|  A  |  B  |  A AND B  |");
        System.out.println("---------------------------------------");
        System.out.println("|  V  |  V  |     V     |");
        System.out.println("|  V  |  F  |     F     |");
        System.out.println("|  F  |  V  |     F     |");
        System.out.println("|  F  |  F  |     F     |");
        System.out.println("---------------------------------------\n");

        // Tabla OR
        System.out.println("------------ TABLA OR (O) -------------");
        System.out.println("|  A  |  B  |  A OR B   |");
        System.out.println("---------------------------------------");
        System.out.println("|  V  |  V  |     V     |");
        System.out.println("|  V  |  F  |     V     |");
        System.out.println("|  F  |  V  |     V     |");
        System.out.println("|  F  |  F  |     F     |");
        System.out.println("---------------------------------------\n");

        // Tabla de Negación
        System.out.println("----------- TABLA NEGACIÓN ------------");
        System.out.println("|  A  |  NOT A  |");
        System.out.println("-----------------");
        System.out.println("|  V  |    F    |");
        System.out.println("|  F  |    V    |");
        System.out.println("-----------------");

        System.out.println("\n=======================================");
        System.out.println("            FIN DEL PROGRAMA           ");
        System.out.println("=======================================");
    }
}
