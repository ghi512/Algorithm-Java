class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] polyArr = polynomial.split(" ");
        
        int xNum = 0;
        int constNum = 0;
        for(int i=0; i<polyArr.length; i++) {
            if(polyArr[i].equals("+")) {
                continue;
            }
            
            if(polyArr[i].contains("x")) {
                if(polyArr[i].equals("x")) {
                    xNum++;
                    continue;
                }
                else {
                    int xStrLen = polyArr[i].length();
                    String temp = polyArr[i].substring(0,xStrLen-1);
                    xNum += Integer.parseInt(temp);
                }
                
            }
            else {
                constNum += Integer.parseInt(polyArr[i]);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        if(xNum == 0) {
            answer = Integer.toString(constNum);
        }
        else if(constNum == 0) {
            if(xNum == 1) {
                answer = "x";
            }
            else {
                sb.append(xNum);
                sb.append("x");
                answer = sb.toString();                
            }
        }
        else if(xNum == 1) {
            sb.append("x + ");
            sb.append(constNum);
            answer = sb.toString();
        }
        else {
            sb.append(xNum);
            sb.append("x + ");
            sb.append(constNum);
            answer = sb.toString();
        }
        
        return answer;
    }
}