class DataOnly {
    int dataInt;
    double dataDouble;
    boolean dataBoolean;
/**
 * @see DataOnly
 */
public static void main(String[] args) {
    DataOnly value = new DataOnly();
    value.dataInt = 47;
    value.dataDouble = 1.1;
    value.dataBoolean = false;
System.out.println(value.dataInt);
    System.out.println(value.dataDouble);
    System.out.println(value.dataBoolean);
}

}
