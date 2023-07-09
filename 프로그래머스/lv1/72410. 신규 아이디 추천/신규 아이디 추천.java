class Solution {
    public String solution(String new_id) {
        // 대문자 -> 소문자
        new_id = new_id.toLowerCase();
        
        // 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 2번 이상 연속된 마침표 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 처음이나 긑에 위치한 마침표 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        // 빈문자열 확인 후, "a" 대입
        if(new_id.length() == 0) {
            new_id = "a";
        }
        
        // 길이 확인 후, 점 제거
        if(new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("^\\.|\\.$", "");
        }
        
        // 최종 길이 확인
        if(new_id.length() <= 2) {
            char last = new_id.charAt(new_id.length() - 1);
            
            while(new_id.length() != 3) {
                new_id += last;
            }
        }
        
        return new_id;
    }
}