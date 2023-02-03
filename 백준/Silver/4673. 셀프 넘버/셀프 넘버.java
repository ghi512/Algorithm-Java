public class Main {
  public static void main(String[] args) {
    boolean[] constructorList = new boolean[10000];

    for(int i=0; i<10000; i++) {
      int con = d(i+1);
      if(con >= 1 && con <= 10000) {
        constructorList[con-1] = true;
      }
    }

    for(int i=0; i<10000; i++) {
      if(!constructorList[i]) {
        System.out.println(i+1);
      }
    }
  }

  public static int d(int num) {
    int constructor = num;
    int len = (int)(Math.log10(num)+1);
    for(int i=1; i<=len; i++) {
      constructor += num%10;
      num = num/10;
    }
    return constructor;
  }
}
