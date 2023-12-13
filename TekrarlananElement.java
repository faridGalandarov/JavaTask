public class TekrarlananElement {
    public static void main(String[] args) {
        int [] eded = {5, 4, 3, 4, 2};
        boolean tekrarVar = false;

        for (int i = 0; i < eded.length-1; i++) {
            for (int j = i+1; j < eded.length ; j++) {
                if (eded[i] == eded[j]){
                    tekrarVar = true;
                    break;
                }
            }
        }
        if (tekrarVar) {
            System.out.println("True, tekrarlanan eded var");
        }
        else {
            System.out.println("False, tekrarlanan eded yoxdu");
        }
    }
}
