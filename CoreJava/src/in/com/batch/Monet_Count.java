package in.com.batch;

public class Monet_Count {
    public static void main(String[] args) {
	  int money = 18945;
	  int[] note = {500,200,100,50,10,5};
	  int count =0;
	  for(int i=0; i<note.length; i++) {
		  count=money/note[i];
		  if(count>0) {
		  System.out.println(note[i]+"    "+count);
	  }
		  money = money % note[i];
	}
}
}