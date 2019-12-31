package adp;

// Adapter Class
public class ElectroAcousticGuitar extends Guitar
{
    AcousticGuitar aG = new AcousticGuitar();
    
    @Override
    public void turnOnGuitar() 
    {
       aG.play();
    }

    @Override
    public void turnOffGuitar() 
    {
       aG.stopPlay();
    }
      
}
