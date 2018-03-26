package catworks;

import java.lang.System;

public class ThresholdPhenomena implements Phenomena{
  private static double threshold;

  public ThresholdPhenomena(float thresh){
    threshold = thresh;
  }
  /**
    * [propagate]
    * @param matrix Adjacency matrix representation of the Network
    * @param start Array of 1's and 0's representing node affliction, there is
    *              an entry for each node in the array.
    */
    public int[] propagate(Integer[][] matrix, int[] start){
      int len = start.length;
      int[] rtn = new int[len];
      System.arraycopy(start, 0, rtn, 0, len);
      for(int i = 0; i < len; i ++){
        if(start[i] == Phenomena.UNAFFLICTED){ //if node i is unafflicted
          double neighbors = 0.0;
          double threshSum = 0.0;
          for(int j = 0; j < len; j++){ //check if it's beyond the threshold
            threshSum += (double)matrix[i][j]*start[j]; //add to threshSum if a neighbor of i is AFFLICTED
            neighbors += (double)matrix[i][j];
          }
            if ((threshSum/neighbors)>threshold && start[i] != Phenomena.IMMUNE){ //if above threshold
              rtn[i] = Phenomena.AFFLICTED; //afflict node i
            }
        }
      }
      return rtn;
    }

    @Override
    public String toString() {
        return "threshold";
    }

}
