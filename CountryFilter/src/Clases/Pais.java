/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Santo Tomas
 */
public class Pais {
    private String nombre;
    private String continente;
    private String ciudades; // posible lista
    private String region;
    private float superficie;
    private int añoIndependencia;
    private int poblacion;
    private float expectLife;
    private float pib;
    private String gobierno;
    private String jefeGobierno;
    private String capital;
    private String codPais; // ej; 'CHL'
    private String idioma; // posible lista

    public Pais() {
    }

    public Pais(String nombre, String continente, String ciudades, String region, float superficie, int añoIndependencia, int poblacion, float expectLife, float pib, String gobierno, String jefeGobierno, String capital, String codPais, String idioma) {
        this.nombre = nombre;
        this.continente = continente;
        this.ciudades = ciudades;
        this.region = region;
        this.superficie = superficie;
        this.añoIndependencia = añoIndependencia;
        this.poblacion = poblacion;
        this.expectLife = expectLife;
        this.pib = pib;
        this.gobierno = gobierno;
        this.jefeGobierno = jefeGobierno;
        this.capital = capital;
        this.codPais = codPais;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCiudades() {
        return ciudades;
    }

    public void setCiudades(String ciudades) {
        this.ciudades = ciudades;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getAñoIndependencia() {
        return añoIndependencia;
    }

    public void setAñoIndependencia(int añoIndependencia) {
        this.añoIndependencia = añoIndependencia;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public float getExpectLife() {
        return expectLife;
    }

    public void setExpectLife(float expectLife) {
        this.expectLife = expectLife;
    }

    public float getPib() {
        return pib;
    }

    public void setPib(float pib) {
        this.pib = pib;
    }

    public String getGobierno() {
        return gobierno;
    }

    public void setGobierno(String gobierno) {
        this.gobierno = gobierno;
    }

    public String getJefeGobierno() {
        return jefeGobierno;
    }

    public void setJefeGobierno(String jefeGobierno) {
        this.jefeGobierno = jefeGobierno;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
