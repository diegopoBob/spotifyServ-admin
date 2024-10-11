/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author dylan
 */
public interface IUsuarioController {
    public abstract void registroUsuario(String nickname, String nombre, String apellido, String mail, LocalDate FecNac, String imagen, String biografia, String link, String tipo, String contraseña) throws Exception;
    public abstract List<String> obtenerNombresClientes();
    public abstract List<String> obtenerNicknamesseguidos(String usuario) throws Exception;
    public abstract List<String> obtenerNicknamesseguidores(String usuario) throws Exception;
    public abstract List<String> obtenerNicknamesDisponiblesASeguir(String usuario, List<String> usuariosSeguidos) throws Exception;
    public abstract void seguirUsuario(String usuario, String usuarioASeguir) throws Exception;
    public abstract void dejarSeguirUsuario(String usuario, String usuarioASeguir) throws Exception;
    public abstract Object[][] obtenerDatosCliente(String nick);
    public abstract Object[][] obtenerDatosClientes();
    public abstract void registrarPlaylistFavorita(String nick, String nombrePlaylist)throws Exception;
    public abstract List<String> obtenerNombresDePlaylistsNoFavoritas(String clienteNick);
    public abstract Object[][] obtenerDatosArtista(String nick);
    public abstract Object[][] obtenerDatosArtistas();
    public abstract void registrarAlbumFavorito(String nick, String nombreAlbum) throws Exception;
    public abstract void registrarCancionFavorita(String nick, String nombreCancion) throws Exception;
    public abstract void eliminarCancionFavorita(String nick, String nombreCancion)throws Exception;
    public abstract void eliminarAlbumFavorito(String nick, String nombreAlbum) throws Exception;
    public abstract void eliminarPlaylistFavorita(String nick, String nombrePlaylist) throws Exception;
    public abstract List<String> obtenerNombresArtistas();
    public abstract boolean esCliente(String nickname);
    //encriptado contraseñas
    public abstract String hashPassword(String password);
    public abstract boolean checkPassword(String password, String hashedPassword);

}
