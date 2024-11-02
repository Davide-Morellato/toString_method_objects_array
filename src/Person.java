public class Person {
    //dichiaro le proprietà
    String name;
    String surname;
    int age;

    //dichiaro il costruttore
    Person(String name, String surname, int age){
        //richiamo le proprietà per assegnarne i valori
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    /*
     * PER VEDERE CIO' CHE CONTIENE L'OGGETTO PERSON
     * E' NECESSARIO SOVRASCRIVERE IL METODO toString() -> Metodo degli oggetti
     * DICHIARANDOLO COME public
     * IMPOSTANDO IL Tipo di Dato (String)
     * DICHIARANDO UNA VARIABILE IN CUI SALVARE LE PROPRIETA' DELL'OGGETTO
     */
    public String toString(){
        //"/n" -> per andare a capo
        String objElementsPerson = this.name + "\n" + this.surname + "\n" + this.age;

        return objElementsPerson;
    }
}
