package figure;

public class TriangleException extends Exception{
	public TriangleException(){
	    super("Unreal triangle");
	  }
  public TriangleException(String msg){
    super(msg);
  }
  @Override
  public String toString(){
    return "Unreal triangle";
  }
	
}
