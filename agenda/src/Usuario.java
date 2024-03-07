public class Usuario {

    private String name;
    private int telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario(){
        this.name="";
        this.telephone=0;
    }

    public Usuario(String name, int telephone){
        this.name=name;
        this.telephone=telephone;
    }



    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

}
