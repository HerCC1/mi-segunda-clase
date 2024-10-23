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
}
