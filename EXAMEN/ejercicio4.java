package EXAMEN;


public class ejercicio4 extends Thread {
    String nombre;
    public ejercicio4 (int prioridad,String nombre){
    this.nombre=nombre;
    setPriority(prioridad);
   }
    public void run(){
    for(int c=1;c<=30;c++){
    System.out.print(c+"mt ");
    yield(); 
    }
    System.out.println("\n Llego a la meta " + nombre);
   }
    static ejercicio4 liebre;
    static ejercicio4 conejo;
    static ejercicio4 tortuga;
    static ejercicio4 pollo;
    public static void main(String []args) throws InterruptedException {
    conejo = new ejercicio4(1," leopardo 1 ");
    liebre = new ejercicio4(5," leopardo 2 ");
    tortuga = new ejercicio4(8," leopardo 3 ");
    pollo = new ejercicio4(4, "leopardo 4");
    conejo.start();
    liebre.start();
    pollo.start();
    tortuga.start();
    pollo.start();

    conejo.join();
    pollo.join();
    liebre.join();
   tortuga.join();
    }
   }