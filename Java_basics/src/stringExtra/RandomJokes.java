package stringExtra;

import java.util.Random;

public class RandomJokes 
{
    public static void main(String[] args) 
    {
        String[] jokes = {
            "Why don't scientists trust atoms? Because they make up everything!",
            "Why did the computer go to therapy? It had too many bytes of emotional data.",
            "What do you call a fish wearing a bowtie? Sofishticated.",
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "I told my computer I needed a break… and now it won’t stop sending vacation ads!"
        };
        Random randomJokes = new Random();
        int index = randomJokes.nextInt(5);
        System.out.println("Joke of the Day :-)");
        System.out.println(jokes[index]);
    }
}
