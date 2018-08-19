//purpose of this exercise: we can create multiple objects of the same class
// and yess... each object has its own personality :) 
class Box{
    double width;
    double height;
    double length;    
    }

class BoxDemo{
    
    public static void main(String arg[]){
        
        // what boxes do you want? 
        // let they be mybox1 AND mybox2
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;        
        //again the volume be vol;
        
        //filling 1
        mybox1.width = 1;
        mybox1.height = 2;
        mybox1.length = 3;

        //filling 2
        mybox2.width = 2;
        mybox2.height = 4;
        mybox2.length = 6;
        
        vol = mybox1.width * mybox1.height * mybox1.length;  
        System.out.println("1 has a volume: "+vol);

        vol = mybox2.width * mybox2.height * mybox2.length;
        System.out.println("2 has a volume: "+vol);
        
        }
    
    }
