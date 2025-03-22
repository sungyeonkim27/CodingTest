package 코딩기초트레이님;

public class x사이의개수 {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] part = myString.split("x", -1);
        int[] length = new int[part.length];
        for (int i = 0; i < part.length; i++) {
            length[i] = part[i].length();
        }
        return length;
    }
}
