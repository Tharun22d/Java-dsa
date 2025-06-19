/*
1854. Maximum Population Year
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.

approach : draw a timeline from 1993 - 1999 and 2000 to 2010 and try to connect youll get a approach
           create a array with size 101(constraint)
           mark +1 if theres a birthrate
           mark -1 if there is death
           find the prefix sum , then max value , add the 1950 with the index of the max value
 */

package leetcode;

public class Maximum_population {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[101]; //as per constraints
        for(int i = 0 ; i<logs.length ; i++){
            int birthrate = logs[i][0];
            int deathrate = logs[i][1];

            pop[birthrate-1950] +=1 ; //[1,0,0,-1,1,0,0] marking 1 for birthrate
            pop[deathrate-1950] -=1; //marking -1 for deathrate
        }
        //calculating prefix sums
        for(int j = 1 ; j<pop.length;j++){
            pop[j] = pop[j]+pop[j-1];
        }
        int max = pop[0];
        int index = 0;
        for(int i = 0 ; i<pop.length;i++){
            if(pop[i]>max){
                max = pop[i];
                index = i;
            }
        }

        return 1950 + index;
    }
}
