public class App {
    public static void main(String[] args){

        //creo 3 istanze per la classe Person
        Person personOne = new Person("Luca", "Rossi", 25);

        Person personTwo = new Person("Marco", "Verdi", 35);

        Person personThree = new Person("Anna", "Neri", 28);


        //Invoco il metodo toString() per stampare nel terminale gli elementi dell'oggetto
        System.out.println(personOne.toString() + "\n"); //-> "\n" per andare a capo
        //
        //OPPURE
        //
        System.out.println(personTwo); //è possibile visualizzare a schermo gli elementi dell'oggetto, anche senza invocare il metodo toString, dato che è stato sovrascritto


        /////////////////////////////////////////////
        /*
         * ARRAY DI OGGETTI
         * 
         * MODO 1:
         * 1. Creo un Array Vuoto defininendo sia il Tipo di Array, in base alla Classe da usare, sia la lunghezza che deve avere
         * 
         * 2. Creo gli Oggetti (istanze della classe) in base alla lunghezza dell'array
         * 
         * 3. Assegno l'indice dell'array al rispettivo oggetto
         * 
         * 
         * MODO 2:
         * 1. Creo gli Oggetti
         * 
         * 2. Popolo l'array con gli oggetti già definiti
         * 
         */


        //MODO 1
        //creo l'array vuoto
        Person[] people = new Person[3]; //generalmente un array vuoto si crea: String/int[] nomeArray = new String/int[valore_lunghezza_array]

        //creo le istanze
        Person personFour = new Person("Gianni", "Bianchi", 25);
        Person personFive = new Person("Cecilia", "Neri", 30);
        Person personSix = new Person("Matteo", "Grigio", 33);

        //assegno l'indice all'istanza
        people[0] = personFour;
        people[1] = personFive;
        people[2] = personSix;

        //stampo nel terminale l'array
        System.out.println("Elemento 1 dell'array di oggetti people: \n" + people[0]);
        System.out.println("Elemento 2 dell'array di oggetti people: \n" + people[1]);
        System.out.println("Elemento 3 dell'array di oggetti people: \n" + people[2]);


        //MODO 2
        //creo le istanze
        Person personSeven = new Person("Giagi", "Bianchi", 50);
        Person personEight = new Person("Luciana", "Indico", 78);

        //popolo l'array
        Person[] strangersPeople = {personSeven, personEight};
        System.out.println("Elemento 1 (indice: [0]) array di oggetti strangersPeople: \n" + strangersPeople[0] + "\n" + "Elemento 2 (indice: [1]) array di oggetti strangersPeople: \n" + strangersPeople[1]);


        /////////////////////////
        //
        //
        // CREO DUE ISTANZE DELLA CLASSE PERSONA
        Person personNine = new Person("Matteo", "Verdi", 33);
        Person personTen = new Person("Davide", "Neri", 35);

        //invoco il metodo greed() passandogli come parametro l'oggetto personTen
        //greedingPerson.name => Davide -> proprietà name dell'istanza personTen che verrà elaborata come parametro del metodo greed()
        //this.name => Matteo -> proprietà name dell'istanza che invoca il metodo greed()
        personNine.greed(personTen);
    }
}
