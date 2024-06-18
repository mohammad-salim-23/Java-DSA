public class Getters {
    public static void main(String[] args) {
       Pen p1=new Pen();
       p1.setColor("Blue");
       System.out.println(p1.getcolor());
       p1.setTip(5);
       System.out.println(p1.gettip());
       
    }
}
    class  Pen{
      private  String color;
      private  int tip;
     //******getter
        String getcolor(){
            return this.color;
        }
        int gettip(){
            return this.tip;
        }
    //*****setter 
        void setColor(String newColor){
            color=newColor;
        }
        void setTip(int newTip){
            tip=newTip;
        }
    }
}
