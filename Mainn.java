class Undefined {
    double dim1,dim2;
    Undefined( double x,double y) {
        dim1 = x;
        dim2 = y;
    }
    void display() {
        System.out.println("\nundefined area");
    }  }
class Rectangle extends Undefined{
    Rectangle (double a, double b) {
        super(a,b);
    }
    void display() {
        System.out.println("Rectangle area : "+dim1 * dim2 );
      }   }
class Triangle extends Undefined {
    Triangle (int x,int y) {
        super(x,y);
    }
    void display() {
         System.out.println("Triangle area : " +(dim1 * dim2)*1/2);
     }   }

class Mainn{
    public static void main(String args[]) {
        
    Undefined un = new Undefined(10,15);
    Rectangle rt = new Rectangle(15,20);
    Triangle tr = new Triangle(2,8);
    un.display();
    rt.display();
    tr.display();

   Undefined a;
    a=un;
    a.display();
    a=rt;
    a.display();
    a=tr;
    a.display();
  } }
