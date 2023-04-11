package LV_01;

import java.util.*;

public class Solution42576 {
	public static void main(String[] args) {
		
	String[] participant = {"leo", "kiki", "eden"};
	String[] completion = {"eden", "kiki"};
	
	}
	
	public String solution(String[] participant, String[] completion) {
		int i;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(i=0; i<participant.length-1; i++){
          if(!participant[i].equals(completion[i])) break;
        }

        return participant[i];
    }
}
