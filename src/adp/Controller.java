
package adp;


class Controller
{
   public void start()
   {
       Guitar g = new ElectricGuitar();
       g.turnOnGuitar();
       g.turnOffGuitar();
       
      Guitar g2 = new ElectroAcousticGuitar();
      g2.turnOnGuitar();
      g2.turnOffGuitar();

   }
}
