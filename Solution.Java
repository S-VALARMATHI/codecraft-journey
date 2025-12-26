class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] county = new int[n];

        county[0] = customers.charAt(0) == 'Y' ? 1: 0;
        for(int i = 1;i<n;i++){
            county[i]  = county[i-1]  + (customers.charAt(i) == 'Y' ? 1 : 0);
        }
        int totaly = county[n-1];

        int minPenality = totaly;
        int bestHour = 0;

        for(int i = 1;i<n;i++){

            int openPenality = i - county[i-1];

            int closedPenality = totaly - county[i];

            int hourPenality = (customers.charAt(i) == 'Y' )? 1 : 0;
            int penality = openPenality + closedPenality + hourPenality;
            if(penality < minPenality){
                minPenality = penality;
                bestHour = i;
            }
        }
        int allDayopenPenality = n - totaly;
        return allDayopenPenality < minPenality? n:  bestHour;
        
    }
}
