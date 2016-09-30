class Rectangle {
  private int width;
  private int height;
  public Rectangle(int w, int h) {
    this.width=w;
    this.height=h;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int h) {
    height=h;
  }
  public void setWidth(int newWidth){
    width=newWidth;
  }
  public void setSize(int w, int h){
    setWidth(w);
    setHeight(h);
  }
  public int calcArea() {
    return width*height;
  }
}

a.calcArea();

Rectangle a= new Rectangle(6,8);

System.out.println("24: " +a.calcArea());

a.setSize(6,4);

System.out.println("24: " +a.calcArea());
