public class calculations {
    void SI() {
        int principal = 12000;
        int rate = 2;
        int time = 4;
        int simpleInterest;
        simpleInterest = principal * rate * time;
        System.out.println("Simple Interest ");
        System.out.println(simpleInterest);
    }
    void areaOfTheTriangle(){
        int b=7;
        int h=10;
        double area=0.5*b*h;
        System.out.println("The area of the triangle ");
        System.out.println(area);
    }
    void volumeOfTheCube(){
        int l=9;
        int vol=l^3;
        System.out.println("The volume of the cube ");
        System.out.println(vol);
    }
    void volumeOfTheCuboid(){
        int ln=2;
        int br=8;
        int ht=10;
        int volume=ln*br*ht;
        System.out.println("The volume of the cuboid ");
        System.out.println(volume);
    }
    public static void main(String[] args) {
       calculations demo= new calculations();
       demo.SI();
       demo.areaOfTheTriangle();
       demo.volumeOfTheCube();
       demo.volumeOfTheCuboid();
    }
}
