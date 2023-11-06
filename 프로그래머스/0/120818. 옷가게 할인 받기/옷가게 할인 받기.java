class Solution {
    public int solution(int price) {
        double discount = getDiscount(price);        
        int answer = (int)((double)price - discount);   
        return answer;
    }
    double getDiscount(int price) {
        double discount = 0;     
        if(price >= 500000) {
            discount = price * 0.2;
        }
        else if (price >= 300000) {
            discount = price * 0.1;
        }
        else if (price >= 100000)
        {
            discount = price * 0.05;
        }   
        return discount;
    }
}