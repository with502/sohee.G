package LV_01;

import java.util.*;

public class Solution12906 {
	public int[] solution() {
		
		int[] arr = {1,1,3,3,0,1,1};
		int[] answer = {};
		
		Stack<Integer> stack = new Stack<>();
        for (int n : arr) {
            if (stack.isEmpty()) {
            	stack.push(n);
            } else if (stack.peek() != n) {
            	stack.push(n);
            }
        }
        
        answer = new int[stack.size()];
        
        for (int i = stack.size()-1; i >= 0; i--) {
        	answer[i] = stack.pop();
        }
        
        return answer;
	}
}
