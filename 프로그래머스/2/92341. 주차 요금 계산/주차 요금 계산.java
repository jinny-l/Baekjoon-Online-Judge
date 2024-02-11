import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> inTimeMap = new HashMap<>();
        Map<String, Integer> feeMap = new TreeMap<>();
        
        // 내역 파싱
        for(int i = 0; i < records.length; i++) {
            String[] infos = records[i].split(" ");
            String time = infos[0];
            String carNo = infos[1];
            String io = infos[2];
            
            if(io.equals("IN")) {
                inTimeMap.put(carNo, time);
            }
            
            if(io.equals("OUT")) {
                int min = calculateMin(inTimeMap.get(carNo), time);
                
                // 정산 기록이 없는 경우, 정산 진행
                if(!feeMap.containsKey(carNo)) {
                    feeMap.put(carNo, min);
                    
                } else if(feeMap.containsKey(carNo)) { // 정산 기록이 있는 경우, 기존 시간에 누적
                    feeMap.put(carNo, feeMap.get(carNo) + min);
                }
                
                inTimeMap.remove(carNo);
            }
        }
        
        // 출차 기록이 없는 경우, 정산
        if(!inTimeMap.isEmpty()) {
            for(String carNo : inTimeMap.keySet()) {
                int min = calculateMin(inTimeMap.get(carNo), "23:59");
                feeMap.put(carNo, feeMap.getOrDefault(carNo, 0) + min);
            }
        }
        
        // 결과 정리
        int[] answer = new int[feeMap.size()];
        int index = 0;
        for(int min : feeMap.values()) {
            answer[index++] = calculateFee(fees, min);
        }
        
        return answer;
    }
    
    private int calculateMin(String inTime, String outTime) {
        String[] out = outTime.split(":");
        String[] in = inTime.split(":");
        
        return (Integer.parseInt(out[0]) - Integer.parseInt(in[0])) * 60 
            + (Integer.parseInt(out[1]) - Integer.parseInt(in[1]));
    }
    
    private int calculateFee(int[] fees, int minutes) {
        if(minutes <= fees[0]) {
            return fees[1];
        }
        
        return fees[1] + (int) Math.ceil((double) (minutes - fees[0]) / fees[2]) * fees[3];
    }
}