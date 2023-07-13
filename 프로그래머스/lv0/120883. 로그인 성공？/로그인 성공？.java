class Solution {
    public String solution(String[] id_pw, String[][] db) {
        StringBuffer sb = new StringBuffer();
        
        // id 배열 만들기
        String[] id = new String[db.length];
        boolean isExistId = false;
        int idIndex = 0;
        for(int i=0; i<db.length; i++) {
            id[i] = db[i][0];
            if(id_pw[0].equals(id[i])) {
                isExistId = true;
                idIndex = i;
            }
        }
        
        if(isExistId) {
            if(id_pw[1].equals(db[idIndex][1])) {
                sb.append("login");
            }
            else {
                sb.append("wrong pw");
            }
        }
        else {
            sb.append("fail");
        }
        
        String answer = sb.toString();
        return answer;
    }
}