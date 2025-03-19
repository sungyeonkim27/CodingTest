package 코딩기초트레이님;

public class 꼬리문자열 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
