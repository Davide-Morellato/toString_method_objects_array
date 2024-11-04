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


    /*
     * 
     * OGGETTO COME PARAMAETRO DI UN METODO
     * 
     */
    //
    //dichiaro un metodo a cui passo un oggetto per accesso alle sue proprietà
    //dichiaro il tipo di funzione in base a cosa deve ritornare (in questo caso niente, quindi void)
    //nomino il metodo
    //dichiaro il tipo di dato da passare come parametro (in questo caso è l'oggetto Person) 
    void greed(Person greedingPerson){
        //stampo nel terminale
        //greedingPerson.name => proprietà name dell'oggetto che verrà elaborato come parametro
        //this.name => proprietà dell'oggetto che ha invocato il metodo greed()
        System.out.println("Ciao " + greedingPerson.name + " io sono " + this.name);
    }
}
