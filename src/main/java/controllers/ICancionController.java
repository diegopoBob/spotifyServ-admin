/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers;

import java.util.List;

/**
 *
 * @author lilia
 */
public interface ICancionController {
    public abstract boolean CrearCancion(String nombre, int duracion);
    public abstract List<String> obtenerNombresCanciones();
    public abstract List<String> obtenerNombresCancionesFavoritas(String clienteNick);
}
