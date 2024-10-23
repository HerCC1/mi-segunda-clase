public class VideojuegoPC{
    //Nombre del juego
    String nombreVideojuego;
    //Cantidad de jugadores que queremos
    int cantidadDeJugadores;
    //Encendido o apagao
    boolean encendido;
    
    public VideojuegoPC(int jugadores, boolean corriente){
        nombreVideojuego = "ComoEstasElJuego";
        cantidadDeJugadores = jugadores;
        encendido = corriente;
    }
    /**
     Vemos el nombre*/
    public String getNombre(){
        return nombreVideojuego;
    }
    
    /**
     Vemos los jugadores*/
    public int getJugadores(){
        return cantidadDeJugadores;
    }
    /**
     Vemos si esta encendido*/
    public boolean getEstado(){
        return encendido;
    }
    /**
     cambiamos el nombre del juego*/
    public void setNombreDelJuegoPC(String name){
        nombreVideojuego = name;
    }
    /**
     añadimos mas jugadores*/
    public void setCantidadJugadoresNuevos(int jugadoresNuevos){
        cantidadDeJugadores = cantidadDeJugadores + jugadoresNuevos;
    }
    /**
     hacemos que si esta encendido se apaga y al reves*/
    public void setEncender(){
        boolean jugarOno;
        if (encendido){
            jugarOno = false;
        } else {
            jugarOno = true;
        }
        encendido = jugarOno;
    }
    
    public String getInfo(){
        String apagadoONo;
        if(encendido) {
            apagadoONo = "Encendido";
        } else {
            apagadoONo= "Apagado";
        }
        String todo = " | Nombre " + nombreVideojuego + " | Jugadores " + cantidadDeJugadores + "| Estado " + apagadoONo;
        return todo;
    }
    
    public void getTodaInfo(){
        String apagadoONo;
        if(encendido) {
            apagadoONo = "Encendido";
        } else {
            apagadoONo= "Apagado";
        }
        String pluralONo;
        if(cantidadDeJugadores == 1) {
            pluralONo = " jugador";
        } else {
            pluralONo = " jugadores";
        }
        System.out.println("-------");
        System.out.println("Este juego se llama " + nombreVideojuego);
        System.out.println("Hay un total de " + cantidadDeJugadores + pluralONo);
        System.out.println("Estado " + apagadoONo);
        System.out.println("-------");
    }
}
