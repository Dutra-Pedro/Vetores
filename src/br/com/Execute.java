package br.com;

public class Execute {
    public static void main(String[] args) {
        Usuario usuarios[] = new Usuario[2];
        usuarios[0] = new Usuario("José", "root");
        usuarios[1] = new Usuario("Maria", "root");

        for (int i = 0; i < usuarios.length; i++){
            System.out.println(usuarios[i].getNome());
        }
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }
}
