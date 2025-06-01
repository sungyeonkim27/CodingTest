package innerClass.실전주석달기;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface // 추상 메서드가 하나만 있는 인터페이스
interface Printable {
    void print();
}

class EmptyDeckException extends RuntimeException { //예외 클래스를 선언하는 문장. 자바의 기본 예외클래스인 RuntimeException를 상속받음
    public EmptyDeckException(String msg) {
        super(msg);
    }
}

public class Example { // 메인 클래스

    // record 사용. 인터페이스 Printable 구현. 정적 내부 클래스 선언
    public static record Card(String suit, String rank, LocalDateTime createdAt) implements Printable {
        public Card(String suit, String rank) {
            this(suit, rank, LocalDateTime.now()); // 현재 클래스의 다른 생성자, Card를 의미함.
        }
        @Override
        public void print() { // 추상 메서드 오버로딩.
            System.out.println(this); // this는 현재 객체 자신을 의미함
        }
    }
    // 정적 내부 클래스
    public static class Utils {
        public static List<Card> createDeck() {
            List<Card> deck = new ArrayList<>();
            String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
            String[] ranks = {
                    "2","3","4","5","6","7","8","9","10",
                    "Jack","Queen","King","Ace"
            };
            for (var s : suits)
                for (var r : ranks)
                    deck.add(new Card(s, r));
            return deck;
        }
        public static void shuffle(List<Card> deck) {
            Collections.shuffle(deck);
        }
        public static void sortByRank(List<Card> deck) {
            deck.sort(Comparator
                    .comparing(Card::rank)
                    .thenComparing(Card::suit));
        }
        public static Card draw(List<Card> deck) {
            if (deck.isEmpty()) throw new EmptyDeckException("Deck is empty!"); // 덱이 비어있으면 예외로 처리하고 프로그램을 멈춤
            return deck.remove(0);
        }
        public static List<Card> draw(List<Card> deck, int count) {
            var hand = new ArrayList<Card>();
            for (int i = 0; i < count; i++) {
                hand.add(draw(deck));
            }
            return hand;
        }
    }
    // 추상 클래스 선언: 직접 인스턴스 생성 불가능
    public static abstract class Game {
        public abstract void start(); // 추상 메서드
        public void end() {
            var time = LocalDateTime.now()
                    .format(DateTimeFormatter.ISO_LOCAL_TIME);
            System.out.println("===== 게임 종료 시각: " + time + " =====");
        }
    }
    // 추상 클래스에서 상속받음
    public static class CardGame extends Game {
        private List<Card> deck;
        private final Example outer;

        public CardGame() { // 정적 내부 클래스의 생성자
            deck = Utils.createDeck();
            outer = new Example();
        }
        // 추상 클래스의 추상메서드를 오버라이드함
        @Override
        public void start() {
            System.out.println("===== CardGame 시작 =====");
            Utils.shuffle(deck);
            Card first = Utils.draw(deck);
            System.out.println("뽑은 첫 카드: " + first);
            Hand hand = outer.new Hand(deck, 5); // Example 클래스의 객체 outer의 내부 클래스 Hand의 인스턴스를 생성
            System.out.print("내 손패: ");
            hand.showHand();
            long hearts = hand.countSuit("Hearts");
            System.out.println("하트 개수: " + hearts);
            Map<String, Long> suitCount = hand.getCards().stream()
                    .collect(
                            Collectors.groupingBy(Card::suit, Collectors.counting())
                    );
            System.out.println("모양별 개수: " + suitCount);
        }
    }
    //일반 내부 클래스
    public class Hand {
        private final List<Card> cards;

        public Hand(List<Card> source, int count) {
            cards = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                cards.add(Utils.draw(source));
            }
        }

        public List<Card> getCards() {
            return List.copyOf(cards);
        }

        public void showHand() {
            class Formatter {
                String format(Card c) {
                    return "[" + c.rank() + " of " + c.suit() + "]";
                }
            }
            Formatter fmt = new Formatter();
            for (var c : cards) {
                System.out.print(fmt.format(c) + " ");
            }
            System.out.println();
        }

        public long countSuit(String suit) {
            return cards.stream()
                    .filter(c -> c.suit().equals(suit))
                    .count();
        }
    }

    public static void main(String[] args) {
        Game game = new CardGame();
        game.start();
        game.end();
    }
}

