 class Dice {
   private int number = 0;
   public void roll() {
     number = (int) (Math.random() * 6);
     System.out.println("turn on" + number);
   }
   public int getNum() {         \\기존 class Dice에서 public int getNum()를 추가하여 Player와 연동
     return this.number;
   }
 }

 class Player {
   private String name=null;
   private int num=0;
   public Player(String _name) {
     name= _name;
   }
   public void play() {
     Dice a=new Dice();
     a.roll();
     num=a.getNum();
   }
   public String getName() {
     return this.name;
   }
   public int getNum() {
     return this.num;
   }
 }


 Player w= new Player("wanjin");


 w.play();
