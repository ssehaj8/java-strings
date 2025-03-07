import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks);

        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numOfPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numOfCardsPerPlayer = sc.nextInt();

        if (numOfPlayers * numOfCardsPerPlayer > numOfCards) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        String[][] players = distributeCards(deck, numOfPlayers, numOfCardsPerPlayer);
        displayPlayersCards(players);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numOfPlayers, int numOfCardsPerPlayer) {
        String[][] players = new String[numOfPlayers][numOfCardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void displayPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
} 
