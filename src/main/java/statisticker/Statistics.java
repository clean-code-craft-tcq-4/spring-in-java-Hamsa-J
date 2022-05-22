package statisticker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Statistics 
{
    public static class Stats {
    	float average;
    	float min;
    	float max;
		public float getAverage() {
			return average;
		}
		public void setAverage(float average) {
			this.average = average;
		}
		public float getMin() {
			return min;
		}
		public void setMin(float min) {
			this.min = min;
		}
		public float getMax() {
			return max;
		}
		public void setMax(float max) {
			this.max = max;
		}
		
		Stats(){
		}
		
		@Override
		public String toString() {
			return "Stats [average=" + average + ", min=" + min + ", max=" + max + "]";
		}
    
		
	}
    
	public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
		
		Stats stats= new Stats();
		float minValue = Float.NEGATIVE_INFINITY;
		float maxValue = -1;
		float total = 0.0f;
		float average = 0;

		if (numbers != null && numbers.size() > 0) {
	        Collections.sort(numbers);
	        minValue = numbers.get(0);
	        maxValue = numbers.get(numbers.size() - 1);
	        for (int count = 0; count < numbers.size(); ++count) {
			    total +=  numbers.get(count);
	        }
			average = total/numbers.size();

		}

		stats.setAverage(average);
		stats.setMax(maxValue); 
		stats.setMin(minValue);  

		return stats;
		
    }
}
