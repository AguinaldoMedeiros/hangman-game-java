package systemgame;

import systemgame.gamemode.GameMode;
import systemgame.gamemode.Language;
import systemgame.gamemode.WordCategory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WordGenerator {
    private Random random;

    private Map<WordCategory, Map<Language, String[]>> words;

    public WordGenerator(){
        words = new HashMap<>();

        Map<Language, String[]> allWords = new HashMap<>();
        allWords.put(Language.ENGLISH, new String[]{"cat", "dog", "tree", "house", "car"});
        allWords.put(Language.SPANISH, new String[]{"gato", "perro", "árbol", "casa", "coche"});
        allWords.put(Language.FRENCH, new String[]{"chat", "chien", "arbre", "maison", "voiture"});
        allWords.put(Language.GERMAN, new String[]{"Katze", "Hund", "Baum", "Haus", "Auto"});
        allWords.put(Language.ITALIAN, new String[]{"gatto", "cane", "albero", "casa", "auto"});
        allWords.put(Language.PORTUGUESE, new String[]{"gato", "cachorro", "árvore", "casa", "carro"});
        words.put(WordCategory.ALL, allWords);

        Map<Language, String[]> animalsWords = new HashMap<>();
        animalsWords.put(Language.ENGLISH, new String[]{"cat", "dog", "lion", "elephant", "tiger"});
        animalsWords.put(Language.SPANISH, new String[]{"gato", "perro", "león", "elefante", "tigre"});
        animalsWords.put(Language.FRENCH, new String[]{"chat", "chien", "lion", "éléphant", "tigre"});
        animalsWords.put(Language.GERMAN, new String[]{"Katze", "Hund", "Löwe", "Elefant", "Tiger"});
        animalsWords.put(Language.ITALIAN, new String[]{"gatto", "cane", "leone", "elefante", "tigre"});
        animalsWords.put(Language.PORTUGUESE, new String[]{"gato", "cachorro", "leão", "elefante", "tigre"});
        words.put(WordCategory.ANIMALS, animalsWords);


        Map<Language, String[]> countriesWords = new HashMap<>();
        countriesWords.put(Language.ENGLISH, new String[]{"Brazil", "United States", "Canada", "France", "Japan"});
        countriesWords.put(Language.SPANISH, new String[]{"Brasil", "Estados Unidos", "Canadá", "Francia", "Japón"});
        countriesWords.put(Language.FRENCH, new String[]{"Brésil", "États-Unis", "Canada", "France", "Japon"});
        countriesWords.put(Language.GERMAN, new String[]{"Brasilien", "Vereinigte Staaten", "Kanada", "Frankreich", "Japan"});
        countriesWords.put(Language.ITALIAN, new String[]{"Brasile", "Stati Uniti", "Canada", "Francia", "Giappone"});
        countriesWords.put(Language.PORTUGUESE, new String[]{"Brasil", "Estados Unidos", "Canadá", "França", "Japão"});
        words.put(WordCategory.COUNTRIES, countriesWords);


        Map<Language, String[]> fruitsWords = new HashMap<>();
        fruitsWords.put(Language.ENGLISH, new String[]{"apple", "banana", "orange", "strawberry", "pineapple"});
        fruitsWords.put(Language.SPANISH, new String[]{"manzana", "plátano", "naranja", "fresa", "piña"});
        fruitsWords.put(Language.FRENCH, new String[]{"pomme", "banane", "orange", "fraise", "ananas"});
        fruitsWords.put(Language.GERMAN, new String[]{"Apfel", "Banane", "Orange", "Erdbeere", "Ananas"});
        fruitsWords.put(Language.ITALIAN, new String[]{"mela", "banana", "arancia", "fragola", "ananas"});
        fruitsWords.put(Language.PORTUGUESE, new String[]{"maçã", "banana", "laranja", "morango", "abacaxi"});
        words.put(WordCategory.FRUITS, fruitsWords);

        Map<Language, String[]> occupationsWords = new HashMap<>();
        occupationsWords.put(Language.ENGLISH, new String[]{"doctor", "teacher", "engineer", "lawyer", "chef"});
        occupationsWords.put(Language.SPANISH, new String[]{"médico", "maestro", "ingeniero", "abogado", "chef"});
        occupationsWords.put(Language.FRENCH, new String[]{"médecin", "enseignant", "ingénieur", "avocat", "chef"});
        occupationsWords.put(Language.GERMAN, new String[]{"Arzt", "Lehrer", "Ingenieur", "Anwalt", "Koch"});
        occupationsWords.put(Language.ITALIAN, new String[]{"medico", "insegnante", "ingegnere", "avvocato", "chef"});
        occupationsWords.put(Language.PORTUGUESE, new String[]{"médico", "professor", "engenheiro", "advogado", "chef"});
        words.put(WordCategory.OCCUPATIONS, occupationsWords);

        Map<Language, String[]> sportsWords = new HashMap<>();
        sportsWords.put(Language.ENGLISH, new String[]{"soccer", "basketball", "tennis", "swimming", "volleyball"});
        sportsWords.put(Language.SPANISH, new String[]{"fútbol", "baloncesto", "tenis", "natación", "voleibol"});
        sportsWords.put(Language.FRENCH, new String[]{"football", "basketball", "tennis", "natation", "volleyball"});
        sportsWords.put(Language.GERMAN, new String[]{"Fußball", "Basketball", "Tennis", "Schwimmen", "Volleyball"});
        sportsWords.put(Language.ITALIAN, new String[]{"calcio", "basket", "tennis", "nuoto", "pallavolo"});
        sportsWords.put(Language.PORTUGUESE, new String[]{"futebol", "basquete", "tênis", "natação", "vôlei"});
        words.put(WordCategory.SPORTS, sportsWords);

        Map<Language, String[]> moviesWords = new HashMap<>();
        moviesWords.put(Language.ENGLISH, new String[]{"Avengers", "Titanic", "Jurassic Park", "Star Wars", "The Lion King"});
        moviesWords.put(Language.SPANISH, new String[]{"Los Vengadores", "Titanic", "Parque Jurásico", "La Guerra de las Galaxias", "El Rey León"});
        moviesWords.put(Language.FRENCH, new String[]{"Les Avengers", "Titanic", "Jurassic Park", "Star Wars", "Le Roi Lion"});
        moviesWords.put(Language.GERMAN, new String[]{"Die Avengers", "Titanic", "Jurassic Park", "Star Wars", "Der König der Löwen"});
        moviesWords.put(Language.ITALIAN, new String[]{"Gli Avengers", "Titanic", "Jurassic Park", "Star Wars", "Il Re Leone"});
        moviesWords.put(Language.PORTUGUESE, new String[]{"Os Vingadores", "Titanic", "Parque Jurássico", "Star Wars", "O Rei Leão"});
        words.put(WordCategory.MOVIES, moviesWords);

        Map<Language, String[]> foodsWords = new HashMap<>();
        foodsWords.put(Language.ENGLISH, new String[]{"pizza", "burger", "pasta", "sushi", "salad"});
        foodsWords.put(Language.SPANISH, new String[]{"pizza", "hamburguesa", "pasta", "sushi", "ensalada"});
        foodsWords.put(Language.FRENCH, new String[]{"pizza", "hamburger", "pâtes", "sushi", "salade"});
        foodsWords.put(Language.GERMAN, new String[]{"Pizza", "Burger", "Nudeln", "Sushi", "Salat"});
        foodsWords.put(Language.ITALIAN, new String[]{"pizza", "hamburger", "pasta", "sushi", "insalata"});
        foodsWords.put(Language.PORTUGUESE, new String[]{"pizza", "hambúrguer", "macarrão", "sushi", "salada"});
        words.put(WordCategory.FOODS, foodsWords);

        Map<Language, String[]> transportationWords = new HashMap<>();
        transportationWords.put(Language.ENGLISH, new String[]{"car", "bus", "train", "bike", "plane"});
        transportationWords.put(Language.SPANISH, new String[]{"coche", "autobús", "tren", "bicicleta", "avión"});
        transportationWords.put(Language.FRENCH, new String[]{"voiture", "bus", "train", "vélo", "avion"});
        transportationWords.put(Language.GERMAN, new String[]{"Auto", "Bus", "Zug", "Fahrrad", "Flugzeug"});
        transportationWords.put(Language.ITALIAN, new String[]{"auto", "bus", "treno", "bicicletta", "aereo"});
        transportationWords.put(Language.PORTUGUESE, new String[]{"carro", "ônibus", "trem", "bicicleta", "avião"});
        words.put(WordCategory.MODES_OF_TRANSPORTATION, transportationWords);

        Map<Language, String[]> celebritiesWords = new HashMap<>();
        celebritiesWords.put(Language.ENGLISH, new String[]{"Tom Hanks", "Jennifer Aniston", "Leonardo DiCaprio", "Angelina Jolie", "Brad Pitt"});
        celebritiesWords.put(Language.SPANISH, new String[]{"Penélope Cruz", "Antonio Banderas", "Javier Bardem", "Salma Hayek", "Penélope Cruz"});
        celebritiesWords.put(Language.FRENCH, new String[]{"Marion Cotillard", "Jean Dujardin", "Audrey Tautou", "Omar Sy", "Brigitte Bardot"});
        celebritiesWords.put(Language.GERMAN, new String[]{"Diane Kruger", "Daniel Brühl", "Christoph Waltz", "Heidi Klum", "Karl Lagerfeld"});
        celebritiesWords.put(Language.ITALIAN, new String[]{"Sophia Loren", "Monica Bellucci", "Roberto Benigni", "Gina Lollobrigida", "Marcello Mastroianni"});
        celebritiesWords.put(Language.PORTUGUESE, new String[]{"Gisele Bündchen", "Rodrigo Santoro", "Fernanda Montenegro", "Wagner Moura", "Lázaro Ramos"});
        words.put(WordCategory.CELEBRITIES, celebritiesWords);

        Map<Language, String[]> instrumentsWords = new HashMap<>();
        instrumentsWords.put(Language.ENGLISH, new String[]{"guitar", "piano", "violin", "drums", "trumpet"});
        instrumentsWords.put(Language.SPANISH, new String[]{"guitarra", "piano", "violín", "batería", "trompeta"});
        instrumentsWords.put(Language.FRENCH, new String[]{"guitare", "piano", "violon", "batterie", "trompette"});
        instrumentsWords.put(Language.GERMAN, new String[]{"Gitarre", "Klavier", "Violine", "Schlagzeug", "Trompete"});
        instrumentsWords.put(Language.ITALIAN, new String[]{"chitarra", "pianoforte", "violino", "batteria", "tromba"});
        instrumentsWords.put(Language.PORTUGUESE, new String[]{"guitarra", "piano", "violino", "bateria", "trompete"});
        words.put(WordCategory.MUSICAL_INSTRUMENTS, instrumentsWords);

        random = new Random();
    }

    public String getRandomWord(GameMode gameMode) {
        Map<Language, String[]> wordCategory = words.get(gameMode.getWordCategory());
        String[] wordsByLanguage = wordCategory.get(gameMode.getLanguage());
        int randomIndex = random.nextInt(wordsByLanguage.length);
        return wordsByLanguage[randomIndex];
    }
}
