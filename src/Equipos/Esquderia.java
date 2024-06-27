package Equipos;

public class Esquderia {
    String nombre;
    Monoplaza[] monoplazas = new Monoplaza[2];
    Piloto[] pilotos = new Piloto[2];
    int victorias,campeonesDelMundo;

    //CONSTRUCTORES

    public Esquderia(String nombre, Monoplaza[] monoplazas, Piloto[] pilotos) {
        this.nombre = nombre;
        this.monoplazas = monoplazas;
        this.pilotos = pilotos;
        victorias = 0;
        campeonesDelMundo = 0;
    }
}
