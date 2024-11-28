
// import org.xml.sax.SAXException;

// class shape{
//     public void draw(){
//         System.out.println("cannot say any shape.");
//     }
// }
// class square extends shape{

//     public void draw(){
//         System.out.println("The area of  square is a2.");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         shape area=new shape();
//         area.draw();
//         //OUTPUT FOR SHAPE CLASS
//         shape square=new square();
//         square.draw();
//         //OUTPUT FOR SQUARE SUCLASS
//     }
// }


// OTHER ONE
class Animal{
    public void makesound(){
        System.out.println("ANIMAL CAN MAKE SOUND.");
    }
}
class dog extends Animal{
    public void makesound(){
        System.out.println("Dogs can Bark.");
    }
}
class cow extends Animal{
    public void makesound(){
        System.out.println("Cow make sound 'moww-moww'");
    }
}
public class Main{
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.makesound();//output for Animal
         
        dog say=new dog();
        say.makesound();//output for dog

        cow did=new cow();
        did.makesound();
    }

    }


