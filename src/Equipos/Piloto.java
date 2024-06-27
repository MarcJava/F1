package Equipos;

public class Piloto {
    String nombre;
    int victorias, polePosition,campeonesDelMundo;

    //CONSTRUCTORES
    public Piloto(String nombre) {
        this.nombre = nombre;
        this.victorias = 0;
        this.polePosition = 0;
        this.campeonesDelMundo = 0;
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getPolePosition() {
        return polePosition;
    }

    public void setPolePosition(int polePosition) {
        this.polePosition = polePosition;
    }

    public int getCampeonesDelMundo() {
        return campeonesDelMundo;
    }

    public void setCampeonesDelMundo(int campeonesDelMundo) {
        this.campeonesDelMundo = campeonesDelMundo;
    }
}
