public class Pantalla{

    private Frame[] frames;
    private Grafica grafica;

    public void mostrar(){
        this.grafica = new Grafica();
    
        while(true){
            frames = grafica.devolverDosFrames();
    
            if(frames != null && frames[0] != null && frames[1] != null){
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(frames[0].devolverPixeles()[i][j].devolverColor().devolverRepresentacion() + " ");
                    } 
                    for (int j = 0; j < 7; j++) {
                        System.out.print(frames[1].devolverPixeles()[i][j].devolverColor().devolverRepresentacion() + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Aún no se han generado los frames suficientes.");
            }
        }
    }
    

    public static void main(String[] args) {
        new Pantalla().mostrar();
    }
}