

public class Picture implements InterfacePrint{
    int width,height;
    Picture(int width,int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void print(){
        System.out.println("Width : "+width+"\n"+"Height: "+height);
    }
}
