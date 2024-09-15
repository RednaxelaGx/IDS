/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg4;

import java.util.Scanner;

/**
 *
 * @author Alexa
 */

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            insertarAux(raiz, nuevoNodo);
        }
    }

    private void insertarAux(Nodo nodo, Nodo nuevoNodo) {
        if (nuevoNodo.getEmpleado().getId() < nodo.getEmpleado().getId()) {
            if (nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(nuevoNodo);
            } else {
                insertarAux(nodo.getIzquierdo(), nuevoNodo);
            }
        } else {
            if (nodo.getDerecho() == null) {
                nodo.setDerecho(nuevoNodo);
            } else {
                insertarAux(nodo.getDerecho(), nuevoNodo);
            }
        }
    }

    public void preorden() {
        if (raiz != null) {
            System.out.print(raiz.getEmpleado().toString() + " ");
            preordenAux(raiz);
        }
    }

    private void preordenAux(Nodo nodo) {
        if (nodo != null) {
            preordenAux(nodo.getIzquierdo());
            System.out.print(nodo.getEmpleado().toString() + " ");
            preordenAux(nodo.getDerecho());
        }
    }

    public void inorden() {
        if (raiz != null) {
            inordenAux(raiz);
        }
    }

    private void inordenAux(Nodo nodo) {
        if (nodo != null) {
            inordenAux(nodo.getIzquierdo());
            System.out.print(nodo.getEmpleado().toString() + " ");
            inordenAux(nodo.getDerecho());
        }
    }

    public void postorden() {
        if (raiz != null) {
            postordenAux(raiz);
        }
    }

    private void postordenAux(Nodo nodo) {
        if (nodo != null) {
            postordenAux(nodo.getIzquierdo());
            postordenAux(nodo.getDerecho());
            System.out.print(nodo.getEmpleado().toString() + " ");
        }
    }

    public void eliminar(int id) {
        raiz = eliminarAux(raiz, id);
    }

    private Nodo eliminarAux(Nodo nodo, int id) {
        if (nodo == null) {
            return null;
        }
        if (id < nodo.getEmpleado().getId()) {
            nodo.setIzquierdo(eliminarAux(nodo.getIzquierdo(), id));
        } else if (id > nodo.getEmpleado().getId()) {
            nodo.setDerecho(eliminarAux(nodo.getDerecho(), id));
        } else {
            if (nodo.getIzquierdo() == null) {
                return nodo.getDerecho();
            } else if (nodo.getDerecho() == null) {
                return nodo.getIzquierdo();
            } else {
                Nodo aux = nodo;
                nodo = nodo.getIzquierdo();
                while (nodo.getDerecho() != null) {
                    nodo = nodo.getDerecho();
                }
                nodo.setDerecho(aux.getDerecho());
                return aux.getIzquierdo();
            }
        }
        return nodo;
    }
}