
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


public class Scrabble {
    private Tile[] tiles; // // Array to hold the tiles of the Scrabble game


    // Default constructor that initializes the tiles with random letters
    public Scrabble() {
        this.tiles = new Tile[7];
        // Creating an array of 7 Tile objects
        for (int z = 0; z < 7; z++) { // Loop through each position in the array

            this.tiles[z] = new Tile();
            // // Initializing each position with a new Tile with a random letter
        }
    }

    // Constructor that accepts an array of Tile objects
    public Scrabble(Tile[] tiles) {
        if (tiles.length != 7) {
            throw new IllegalArgumentException("Array length must be 7");
            // Throwing an exception if not

        }
        this.tiles = tiles;
        // Assign the provided array to the tiles field
    }

    // Method to get the letters of the tiles as a string
    public String getLetters() {
        StringBuilder letters = new StringBuilder();
        // Creating a StringBuilder to build the string
        for (Tile tile : tiles) { // Loop through each tile in the array

            letters.append(tile.getLetter());
            // Append the letter of each tile to the StringBuilder
        }
        return letters.toString();
        // Converting the StringBuilder to a string and return it after

    }

    public ArrayList<String> getWords() throws FileNotFoundException {
        ArrayList<String> spellableWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("CollinsScrabbleWords2019.txt"))) {
            String word; // stores the word that we are currently looking at
            while ((word = br.readLine()) != null) { // loops through each individual word in the collinsScrabbleWords.txt file

                if (canSpellWord(word)) {
                    // Check if the word can be spelled with the current tiles
                    spellableWords.add(word);
                    // Add the word to the ArrayList if it can be spelled
                }
                /*
                Our job is to check to see if this word can be spelled using only the letters we have available to use (we can use the getLetters method to get a String with each available letter in it)
                We might want to consider looping through each letter in the current word and seeing if that letter exists in the String returned from the getLetters method (we'll call this 'myLetters')
                If it does, we might want to remove that letter from myLetters (you could use the String method replaceFirst) and continue on to the next letter in the current word
                If we reach the end of the word and the length of myLetters is equal to 7 minus the length of the current word, we know that the current word is spellable
                We should add the current word to the spellableWords ArrayList, reset myLetters back to the String returned from the getLetters method, and do the entire process again for the next word
                */
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        return spellableWords;
    }

    //Private method to check if a word can be spelled with the current tiles
    private boolean canSpellWord(String word) {
        StringBuilder AllAlphabets= new StringBuilder(getLetters());  // Get the Alphabet of the tiles as a StringBuilder

        for (char c : word.toCharArray()) { // Loop through each character in the word

            int index = AllAlphabets.indexOf(String.valueOf(c)); // Find the index of the character in the available letters
            if (index == -1) {  // If the character is not found

                return false; // Return false, meaning the word cannot be spelled

            }
            AllAlphabets.deleteCharAt(index); // Remove the character from the available letters

        }
        return true;
        // Return true, meaning the word can be spelled
    }



    public int[] getScores() throws FileNotFoundException {
        ArrayList<String> spellableWords = this.getWords();
        int[] wordScores = new int[spellableWords.size()];

        // Loop through each spellable word
        for (int z = 0; z < spellableWords.size(); z++) {
            wordScores[z] = getWordScore(spellableWords.get(z));
            // getting the score of the word through method and store it in the array

        }

        Arrays.sort(wordScores);
        return wordScores;
    }

    private int getWordScore(String word) { // Private method to get the score of a word

        int score = 0; // Initializing the score to 0

        // Loop through each character in the word
        for (char alphabet : word.toCharArray()) {
            score += getLetterValue(alphabet);  // Add the value of the character to the score

        }
        return score;
        // Return the total score of the word

    }


    private int getLetterValue(char letter) {
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'L' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'T' || letter == 'U') {
            return 1;
        } else if (letter == 'D' || letter == 'G') {
            return 2;
        } else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
            return 3;
        } else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            return 4;
        } else if (letter == 'K') {
            return 5;
        } else if (letter == 'J' || letter == 'X') {
            return 8;
        } else if (letter == 'Q' || letter == 'Z') {
            return 10;
        } else {
            throw new IllegalArgumentException("Invalid Scrabble letter: " + letter);
        }
    }

    public boolean equals(Scrabble other) {
        //Method to check if two Scrabble objects have the same tiles

        char[] thisAlphabets = getLetters().toCharArray();
        // this will Get the Alphabets of this Scrabble object as a char array

        char[] otherAlphabets = other.getLetters().toCharArray();
        // this will Get the Alphabets of the other Scrabble object as a char array

        Arrays.sort(thisAlphabets);
        // Sorting the Alphabets of this Scrabble object

        Arrays.sort(otherAlphabets);
        // Sorting the Alphabets of the other Scrabble object

        return Arrays.equals(thisAlphabets, otherAlphabets);
        // Checking if the sorted arrays are equal and return it
    }


}

