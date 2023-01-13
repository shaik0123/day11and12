package day11day12;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] card_rank = new String[13];
        for(int i=0;i<card_rank.length;i++){
            if(i==0)
                card_rank[i]="Ace";
            else if(i==10)
                card_rank[i]="Jack";
            else if(i==11)
                card_rank[i]="Queen";
            else if(i==12)
                card_rank[i]="King";
            else
                card_rank[i]=Integer.toString(i+1);
        }
        String[] card_suit = {"Clubs", "Hearts", "Spades", "Diamonds"};
        int len = 52;
        String[] cards_deck = new String[len];
        int rank_len=card_rank.length;
        int suit_len=card_suit.length;
        for (int i=0; i<rank_len; i++) {
            for (int j=0; j<suit_len; j++) {
                cards_deck[(suit_len)*i + j] = card_rank[i] + " of " + card_suit[j];
            }}
        String player_1[] = new String[13];
        String player_2[] = new String[13];
        String player_3[] = new String[13];
        String player_4[] = new String[13];
        for (int i=0; i<len; i++) {
            int index = i + (int) (Math.random() * (len-i));
            String temp = cards_deck[index];
            cards_deck[index] = cards_deck[i];
            cards_deck[i] = temp;
        }
        for (int i=0; i<13; i++) {
            player_1[i] = cards_deck[i];
        }
        for (int i=13; i<26; i++) {
            player_2[26-i-1] = cards_deck[i];
        }
        for (int i=26; i<39; i++) {
            player_3[39-i-1] = cards_deck[i];
        }
        for (int i=39; i<52; i++) {
            player_4[52-i-1] = cards_deck[i];
        }
        System.out.println("Player_1 Cards");
        for (int i=0; i<13; i++) {

            System.out.print(player_1[i]+",");
        }
        System.out.println();
        System.out.println("Player_2 Cards");
        for (int i=0; i<13; i++) {
            System.out.print(player_2[i]+",");
        }
        System.out.println();
        System.out.println("Player_3 Cards");
        for (int i=0; i<13; i++) {
            System.out.print(player_3[i]+",");
        }
        System.out.println();
        System.out.println("Player_4 Cards");
        for (int i=0; i<13; i++) {
            System.out.print(player_4[i]+",");
        }
        System.out.println();
    }
}
