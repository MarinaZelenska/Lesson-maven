public class Salary {

    private int value;

    public String getCurrency() {
        return currency;
    }

    private String currency;

    public Salary(int v, String с){
        value = v;
        currency = с;
    }

    public Salary() {

    }

    public Salary add(Salary s){
        return new Salary(value + s.getValue(), currency);
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "value=" + value +
                ", currency='" + currency + '\'' +
                '}';
    }
}

