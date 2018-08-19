class Box {
    double width;     
     double height;     
     double depth;     
    
    }

//this class declares an object of type box
class BoxDemo {
    public static void main(String arg[]){
        
        Box mybox = new Box();//here memory is assignd for obj
        double vol;

        //fill the object 
        mybox.width = 10;
        mybox.height = 200;
        mybox.depth = 120;
        
        //let's find the volume
        vol = mybox.width* mybox.height * mybox.depth;
        System.out.println("Volume is : " + vol);
        
        }   
       
    }
