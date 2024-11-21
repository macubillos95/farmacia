/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.util.List;

public interface Crud<T> {
    
    public List<T> listar();
    public int setAgregar(T tr);
    public int setActualizar(T tr);
    public int setEliminar(int tr);
}
