public class Agenda {
    private Usuario[] usuario;
    public Agenda(){
        usuario = new Usuario[10];
    }

    public Agenda(int tamanoAgenda){
        usuario = new Usuario[tamanoAgenda]
    }

    public Usuario[] getContacto() {
        return usuario;
    }

    public void setContacto(Usuario[] usuario) {
        this.usuario = usuario;
    }

    public boolean anadirContacto(Usuario c){
        if(!existeContacto(c.getName()))
            this.usuario[]
    }

    public boolean eliminarContacto(String name){

    }

    public boolean existeContacto(String name){

    }

    public int buscaContacto(String name){

    }
}
