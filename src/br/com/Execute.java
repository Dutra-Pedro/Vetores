package br.com;

public class Execute {
    public static void main(String[] args) {
        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("José", "root");
        usuario[1] = new Usuario("Maria", "root");

        for (int i = 0; i < usuario.length; i++){
            System.out.println(usuario[i].getNome());
        }
    }
}
