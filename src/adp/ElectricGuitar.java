package adp;

//Target Class
public class ElectricGuitar extends Guitar
{

    @Override
    public void turnOnGuitar() 
    {
      System.out.println("Playing!!");        
    }

    @Override
    public void turnOffGuitar()
    {
      System.out.println("Silenceeee!!");
    }
    
}
