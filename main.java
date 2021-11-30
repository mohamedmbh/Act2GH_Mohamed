public class main {

   private static int[] array = new int[30];

   public static void main(String[] args) {
      array = new int[] { 12, 234, 346, 457, 76, 68, 76, 45, 623, 57, 58, 67, 8, 54, 24, 3, 6, 476, 83, 24, 67, 63, 2, 6, 9, 2, 1, 6, 235, 56 };
      numeroRepeticionesArray();
      insertarNumeros();
   }

   public static void insertarNumeros() {
      for (int i = 0; i < array.length; i++) {
         int n = (int) Math.random() * (10 + 1);
         array[i] = n;
      }
      System.out.println("Esto es una prueba");
   }

   public static void verContenidoArray() {
      for (int i = 0; i < array.length; i++) {
         System.out.println(array[i]);
      }
   }

   public static void numeroRepeticionesArray() {
      for (int i = 0; i < array.length; i++) {
         int contador = 0;
         
         for (int x = 0; x < array.length; x++) {
            if (array[i] == array[x])
               contador++;
         }

         System.out.println("El número " + array[i] + " se repite " + contador + " veces.");
      }
   }

}