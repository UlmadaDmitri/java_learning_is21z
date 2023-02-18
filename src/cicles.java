public class cicles {
    public static void main(String[] args) {
      /*for(float i = 100; i > 10; i /= 2) {
          System.out.println("Element: " + i);*/

       /* int i = 0;
        while(i <= 10) {
            System.out.println("Element " + i);
            i++;*/
        for(double num = 23.5; num < 222.45; num += 13.45 ) {
            /*if(num % 12 == 0)
                continue;*/ // нет смысла в данном случае(заметка для себя)

            if(num >= 175.666)
                break;
            System.out.println("Result: " + num );
      }
    }
}
