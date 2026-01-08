
import java.util.Random;

public class Tile {
    private char letter;
    // Private field to store the letter of the tile


    public Tile( ) { // constructor that generates a random letter

        this.letter = generateRandomLetter();
        // Assigning a randomly generated letter to the tile
    }

    public Tile(char c) { // Constructor that accepts a character and sets it as the tile's letter

        this.letter = c;
        // Assigning the provided letter to the tile

    }

    // Private method to generate a random letter
    private char generateRandomLetter() {
        Random random = new Random(); // this is to Create a Random object to generate random numbers
        // the ASCII value of ‘A’ is 65 and ‘Z’ is 90
        return (char) (random.nextInt(26) + 'A');
        // Generate a random letter from 'A' to 'Z'

    }

    //  Method to get the letter of the tile
    public char getLetter() {

        return this.letter;
        // // Return the letter of the tile
    }
}

