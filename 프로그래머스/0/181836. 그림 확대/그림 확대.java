class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int index = 0;
            
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] pixels = picture[i].split("");
            
            for(int j = 0; j < pixels.length; j++) {
                sb.append(pixels[j].repeat(k));
            }
            
            for(int l = 0; l < k; l++) {
                answer[index++] = sb.toString();
            }
        }

        return answer;
    }
}