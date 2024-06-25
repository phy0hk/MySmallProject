

public class TestLamda {
    public static class  Doubler implements Operator {
        @Override
        public int Operate(int x){
            return x*2;
        }
    }
    public static void main(String[] args) {
        Operator doubler = new Doubler();
        System.out.println("Double value of 4: "+doubler.Operate(4));
        Operator halve = new Operator(){
            @Override
            public int Operate(int x){
                return x/2;
            }
        };
        System.out.println("halve value of 4: "+ halve.Operate(4));
        Operator square = x -> x*x;
        System.out.println("Square of 4:"+square.Operate(4));

        BinaryOperator plus = ( x,y) -> x+y;
        System.out.println(" 10+5 : " +plus.Operate(10,5));

        BinaryOperator modulus = (x,y) -> x%y;
        System.out.println("10 Mod 3 : " +modulus.Operate(10, 3));


        Operator squareRoot = x -> (int)Math.sqrt(x);
        System.out.println("SquareRoot of 8 : "+ squareRoot.Operate(8));
        
    Operator highDivision = x -> {
        for(int i = x-1;i>0;i--){
            if (x%i==0) {
                return i;
            }
        }
        return 0;
    };  
        System.out.println("Highest division of 12 : "+ highDivision.Operate(12));




    }

    interface BinaryOperator{
        int Operate(int x,int y);
    }
}
