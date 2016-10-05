 class Dice {
   private int number = 0;
   public void roll() {
     number = (int) (Math.random() *6);
     System.out.println("turn on" + number);
   }
 }

 Dice a=new Dice();


 for(int i=0; i<10; i++)
   a.roll()
