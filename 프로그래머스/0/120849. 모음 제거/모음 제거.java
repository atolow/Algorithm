class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] remove = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < remove.length; i++) {
            if(answer.contains(remove[i])){
                answer = answer.replaceAll(remove[i], "");
            }
        }
        return answer;
    }
}