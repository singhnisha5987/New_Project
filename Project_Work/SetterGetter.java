package project_java;

public class SetterGetter {
	   int width;
	   public void setter(int w)
	   {
		  width=(w>0)?w:1; 
	   }
	   public int getter()
	   {
		   return width;
	   }

}
