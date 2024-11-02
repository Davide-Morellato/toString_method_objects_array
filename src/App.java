public class App {
    public static void main(String[] args){

        //creo 3 istanze per la classe Person
        Person personOne = new Person("Luca", "Rossi", 25);

        Person personTwo = new Person("Marco", "Verdi", 35);

        Person personThree = new Person("Anna", "Neri", 28);


        //Invoco il metodo toString() per stampare nel terminale gli elementi dell'oggetto
        System.out.println(personOne.toString() + "\n");
        //
        //OPPURE
        //
        System.out.println(personTwo); //è possibile visualizzare a schermo gli elementi dell'oggetto, anche senza invocare il metodo toString, dato che è stato sovrascritto
    }
}
