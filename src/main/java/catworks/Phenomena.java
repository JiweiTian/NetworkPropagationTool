package catworks;

public interface Phenomena {

  final static int UNAFFLICTED = 0;
  final static int AFFLICTED = 1;
  final static int IMMUNE = -1;
  
  int[]  propagate(Integer[][] matrix, int[] start);

}
