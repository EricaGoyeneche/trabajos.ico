package codigorelojtarea;

import static java.time.Clock.system;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public void mostrarHora(){
        System.out.println(this.hora + ":"+this.minuto + ":"+this.segundo);
    }
  int hora=0, minutos=0, segundos=0;
while(true){
if(hora<10){
system.out.print("0");
}
system.out.print(horas);
if(minutos<10){
system.out.print("0");
}
system.out.print(minutos);
if(segundos<10){
system.out.print("0");
}
system.out.println(segundos);
segundos++;
if(segundos==60){
segundos=0;
minutos++;==60){
minutos=0;
horas++;
if(horas==24){
horas=0;
}
}
}
  Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
			
}
}

