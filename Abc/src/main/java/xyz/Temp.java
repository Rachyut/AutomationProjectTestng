package xyz;



public class Temp {
	
public int GetMax(int[] values) {
	int max = values[0];
	for (int i=0; i<values.length;i++) {
		
		if (values[i]<max) {
			max = values[i];
		}
	}
	return max;
	
}


} 