package n2Exercise1;

public class Numero implements Comparable<Numero>{
     private Integer numero;

    public Numero() {
        numero = (int) (Math.random()*(101));
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return ""+numero ;
    }

    @Override
    public int compareTo(Numero o) {
        int result;
        if (numero > o.getNumero()) {
            result = 1;
        } else if (numero < o.getNumero()) {
            result =  -1;
        } else {
            result =  0;
        }
        return result;
    }
}
