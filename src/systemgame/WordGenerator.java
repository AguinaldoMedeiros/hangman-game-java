package systemgame;

import systemgame.gamemode.Language;
import systemgame.gamemode.WordCategory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WordGenerator {
    private Random random = new Random();
    private String randomWord = "";

    private Map<WordCategory, Map<Language, String[]>> words;

    public WordGenerator() {
        words = new HashMap<>();

        Map<Language, String[]> allWords = new HashMap<>();
        allWords.put(Language.ENGLISH, new String[]{"CAT", "DOG", "TREE", "HOUSE", "CAR"});
        allWords.put(Language.SPANISH, new String[]{"GATO", "PERRO", "ARBOL", "CASA", "COCHE"});
        allWords.put(Language.FRENCH, new String[]{"CHAT", "CHIEN", "ARBRE", "MAISON", "VOITURE"});
        allWords.put(Language.GERMAN, new String[]{"KATZE", "HUND", "BAUM", "HAUS", "AUTO"});
        allWords.put(Language.ITALIAN, new String[]{"GATTO", "CANE", "ALBERO", "CASA", "AUTO"});
        allWords.put(Language.PORTUGUESE, new String[]{"GATO", "CACHORRO", "ARVORE", "CASA", "CARRO"});
        words.put(WordCategory.ALL, allWords);

        Map<Language, String[]> animalsWords = new HashMap<>();
        animalsWords.put(Language.ENGLISH, new String[]{"CAT", "DOG", "LION", "ELEPHANT", "TIGER"});
        animalsWords.put(Language.SPANISH, new String[]{"GATO", "PERRO", "LEON", "ELEFANTE", "TIGRE"});
        animalsWords.put(Language.FRENCH, new String[]{"CHAT", "CHIEN", "LION", "ELEPHANT", "TIGRE"});
        animalsWords.put(Language.GERMAN, new String[]{"KATZE", "HUND", "LOWE", "ELEFANT", "TIGER"});
        animalsWords.put(Language.ITALIAN, new String[]{"GATTO", "CANE", "LEONE", "ELEFANTE", "TIGRE"});
        animalsWords.put(Language.PORTUGUESE, new String[]{"GATO", "CACHORRO", "LEAO", "ELEFANTE", "TIGRE"});
        words.put(WordCategory.ANIMALS, animalsWords);

        Map<Language, String[]> countriesWords = new HashMap<>();
        countriesWords.put(Language.ENGLISH, new String[]{"BRAZIL", "UNITED STATES", "CANADA", "FRANCE", "JAPAN"});
        countriesWords.put(Language.SPANISH, new String[]{"BRASIL", "ESTADOS UNIDOS", "CANADA", "FRANCIA", "JAPON"});
        countriesWords.put(Language.FRENCH, new String[]{"BRESIL", "ETATS UNIS", "CANADA", "FRANCE", "JAPON"});
        countriesWords.put(Language.GERMAN, new String[]{"BRASILIEN", "VEREINIGTE STAATEN", "KANADA", "FRANKREICH", "JAPAN"});
        countriesWords.put(Language.ITALIAN, new String[]{"BRASILE", "STATI UNITI", "CANADA", "FRANCIA", "GIAPPONE"});
        countriesWords.put(Language.PORTUGUESE, new String[]{"BRASIL", "ESTADOS UNIDOS", "CANADA", "FRANCA", "JAPAO"});
        words.put(WordCategory.COUNTRIES, countriesWords);


        Map<Language, String[]> fruitsWords = new HashMap<>();
        fruitsWords.put(Language.ENGLISH, new String[]{"APPLE", "BANANA", "ORANGE", "STRAWBERRY", "PINEAPPLE"});
        fruitsWords.put(Language.SPANISH, new String[]{"MANZANA", "PLATANO", "NARANJA", "FRESA", "PINA"});
        fruitsWords.put(Language.FRENCH, new String[]{"POMME", "BANANE", "ORANGE", "FRAISE", "ANANAS"});
        fruitsWords.put(Language.GERMAN, new String[]{"APFEL", "BANANE", "ORANGE", "ERDBEERE", "ANANAS"});
        fruitsWords.put(Language.ITALIAN, new String[]{"MELA", "BANANA", "ARANCIA", "FRAGOLA", "ANANAS"});
        fruitsWords.put(Language.PORTUGUESE, new String[]{"MACA", "BANANA", "LARANJA", "MORANGO", "ABACAXI"});
        words.put(WordCategory.FRUITS, fruitsWords);

        Map<Language, String[]> occupationsWords = new HashMap<>();
        occupationsWords.put(Language.ENGLISH, new String[]{"DOCTOR", "TEACHER", "ENGINEER", "LAWYER", "CHEF"});
        occupationsWords.put(Language.SPANISH, new String[]{"MEDICO", "MAESTRO", "INGENIERO", "ABOGADO", "CHEF"});
        occupationsWords.put(Language.FRENCH, new String[]{"MEDECIN", "ENSEIGNANT", "INGENIEUR", "AVOCAT", "CHEF"});
        occupationsWords.put(Language.GERMAN, new String[]{"ARZT", "LEHRER", "INGENIEUR", "ANWALT", "KOCH"});
        occupationsWords.put(Language.ITALIAN, new String[]{"MEDICO", "INSEGNANTE", "INGEGNERE", "AVVOCATO", "CHEF"});
        occupationsWords.put(Language.PORTUGUESE, new String[]{"MÉDICO", "PROFESSOR", "ENGENHEIRO", "ADVOGADO", "CHEF"});
        words.put(WordCategory.OCCUPATIONS, occupationsWords);

        Map<Language, String[]> sportsWords = new HashMap<>();
        sportsWords.put(Language.ENGLISH, new String[]{"SOCCER", "BASKETBALL", "TENNIS", "SWIMMING", "VOLLEYBALL"});
        sportsWords.put(Language.SPANISH, new String[]{"FUTBOL", "BALONCESTO", "TENIS", "NATACION", "VOLEIBOL"});
        sportsWords.put(Language.FRENCH, new String[]{"FOOTBALL", "BASKETBALL", "TENNIS", "NATATION", "VOLLEYBALL"});
        sportsWords.put(Language.GERMAN, new String[]{"FUSSBALL", "BASKETBALL", "TENNIS", "SCHWIMMEN", "VOLLEYBALL"});
        sportsWords.put(Language.ITALIAN, new String[]{"CALCIO", "BASKET", "TENNIS", "NUOTO", "PALLAVOLO"});
        sportsWords.put(Language.PORTUGUESE, new String[]{"FUTEBOL", "BASQUETE", "TENIS", "NATACAO", "VOLEI"});
        words.put(WordCategory.SPORTS, sportsWords);

        Map<Language, String[]> moviesWords = new HashMap<>();
        moviesWords.put(Language.ENGLISH, new String[]{"AVENGERS", "TITANIC", "JURASSIC PARK", "STAR WARS", "THE LION KING"});
        moviesWords.put(Language.SPANISH, new String[]{"LOS VENGADORES", "TITANIC", "PARQUE JURASICO", "LA GUERRA DE LAS GALAXIAS", "EL REY LEON"});
        moviesWords.put(Language.FRENCH, new String[]{"LES AVENGERS", "TITANIC", "JURASSIC PARK", "STAR WARS", "LE ROI LION"});
        moviesWords.put(Language.GERMAN, new String[]{"DIE AVENGERS", "TITANIC", "JURASSIC PARK", "STAR WARS", "DER KONIG DER LOWEN"});
        moviesWords.put(Language.ITALIAN, new String[]{"GLI AVENGERS", "TITANIC", "JURASSIC PARK", "STAR WARS", "IL RE LEONE"});
        moviesWords.put(Language.PORTUGUESE, new String[]{"OS VINGADORES", "TITANIC", "PARQUE JURASSICO", "STAR WARS", "O REI LEAO"});
        words.put(WordCategory.MOVIES, moviesWords);

        Map<Language, String[]> foodsWords = new HashMap<>();
        foodsWords.put(Language.ENGLISH, new String[]{"PIZZA", "BURGER", "PASTA", "SUSHI", "SALAD"});
        foodsWords.put(Language.SPANISH, new String[]{"PIZZA", "HAMBURGUESA", "PASTA", "SUSHI", "ENSALADA"});
        foodsWords.put(Language.FRENCH, new String[]{"PIZZA", "HAMBURGER", "PATES", "SUSHI", "SALADE"});
        foodsWords.put(Language.GERMAN, new String[]{"PIZZA", "BURGER", "NUDELN", "SUSHI", "SALAT"});
        foodsWords.put(Language.ITALIAN, new String[]{"PIZZA", "HAMBURGER", "PASTA", "SUSHI", "INSALATA"});
        foodsWords.put(Language.PORTUGUESE, new String[]{"PIZZA", "HAMBURGUER", "MACARRAO", "SUSHI", "SALADA"});
        words.put(WordCategory.FOODS, foodsWords);

        Map<Language, String[]> transportationWords = new HashMap<>();
        transportationWords.put(Language.ENGLISH, new String[]{"CAR", "BUS", "TRAIN", "BIKE", "PLANE"});
        transportationWords.put(Language.SPANISH, new String[]{"COCHE", "AUTOBUS", "TREN", "BICICLETA", "AVION"});
        transportationWords.put(Language.FRENCH, new String[]{"VOITURE", "BUS", "TRAIN", "VELO", "AVION"});
        transportationWords.put(Language.GERMAN, new String[]{"AUTO", "BUS", "ZUG", "FAHRRAD", "FLUGZEUG"});
        transportationWords.put(Language.ITALIAN, new String[]{"AUTO", "BUS", "TRENO", "BICICLETTA", "AEREO"});
        transportationWords.put(Language.PORTUGUESE, new String[]{"CARRO", "ÔNIBUS", "TREM", "BICICLETA", "AVIAO"});
        words.put(WordCategory.MODES_OF_TRANSPORTATION, transportationWords);

        Map<Language, String[]> celebritiesWords = new HashMap<>();
        celebritiesWords.put(Language.ENGLISH, new String[]{"TOM HANKS", "JENNIFER ANISTON", "LEONARDO DICAPRIO", "ANGELINA JOLIE", "BRAD PITT"});
        celebritiesWords.put(Language.SPANISH, new String[]{"PENELOPE CRUZ", "ANTONIO BANDERAS", "JAVIER BARDEM", "SALMA HAYEK", "PENELOPE CRUZ"});
        celebritiesWords.put(Language.FRENCH, new String[]{"MARION COTILLARD", "JEAN DUJARDIN", "AUDREY TAUTOU", "OMAR SY", "BRIGITTE BARDOT"});
        celebritiesWords.put(Language.GERMAN, new String[]{"DIANE KRUGER", "DANIEL BRÜHL", "CHRISTOPH WALTZ", "HEIDI KLUM", "KARL LAGERFELD"});
        celebritiesWords.put(Language.ITALIAN, new String[]{"SOPHIA LOREN", "MONICA BELLUCCI", "ROBERTO BENIGNI", "GINA LOLLOBRIGIDA", "MARCELLO MASTROIANNI"});
        celebritiesWords.put(Language.PORTUGUESE, new String[]{"GISELE BUNDCHEN", "RODRIGO SANTORO", "FERNANDA MONTENEGRO", "WAGNER MOURA", "LAZARO RAMOS"});
        words.put(WordCategory.CELEBRITIES, celebritiesWords);

        Map<Language, String[]> instrumentsWords = new HashMap<>();
        instrumentsWords.put(Language.ENGLISH, new String[]{"GUITAR", "PIANO", "VIOLIN", "DRUMS", "TRUMPET"});
        instrumentsWords.put(Language.SPANISH, new String[]{"GUITARRA", "PIANO", "VIOLIN", "BATERIA", "TROMPETA"});
        instrumentsWords.put(Language.FRENCH, new String[]{"GUITARE", "PIANO", "VIOLON", "BATTERIE", "TROMPETTE"});
        instrumentsWords.put(Language.GERMAN, new String[]{"GITARRE", "KLAVIER", "VIOLINE", "SCHLAGZEUG", "TROMPETE"});
        instrumentsWords.put(Language.ITALIAN, new String[]{"CHITARRA", "PIANOFORTE", "VIOLINO", "BATTERIA", "TROMBA"});
        instrumentsWords.put(Language.PORTUGUESE, new String[]{"GUITARRA", "PIANO", "VIOLINO", "BATERIA", "TROMPETE"});
        words.put(WordCategory.MUSICAL_INSTRUMENTS, instrumentsWords);
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void generateRandomWord(Language language, WordCategory category) {
        Map<Language, String[]> wordCategory = words.get(category);
        String[] wordsByLanguage = wordCategory.get(language);
        int randomIndex = random.nextInt(wordsByLanguage.length);
        randomWord = wordsByLanguage[randomIndex];
    }
}
