class Solution {
    public int solution(int n) {
        int temp=0;
        for(int i=2;i<=n;i+=2){
            temp += i;

        }
        return temp;
    }
}