package br.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execute {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<Usuario>();
        Usuario pedro = new Usuario(1,"Pedro", "12345");
        Usuario enzo = new Usuario(2,"Enzo", "54321");
        Usuario borba = new Usuario(3,"Borba", "34521");
        Usuario luigi = new Usuario(4,"Luigi", "56789");
        Usuario gustavo = new Usuario(5,"Gustavo", "98765");
        lista.add(pedro);
        lista.add(enzo);
        lista.add(borba);
        lista.add(luigi);
        lista.add(gustavo);
        Collections.sort(lista);
        for(Usuario user : lista){
            System.out.println(user.getId());
        }
    }
}
