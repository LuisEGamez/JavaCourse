package n1Excercise1;

public class NoGenericMethods {

    private String lista[];
    private int i;

    public NoGenericMethods(String uno, String dos, String tres) {
        lista = new String[3];
        lista[0] = uno;
        lista[1] = dos;
        lista[2]= tres;
    }

    public String getLista(int indice) {
        return lista[indice];
    }

    public void setLista(String str) {
        lista[i]= str;
        i++;
    }
}
