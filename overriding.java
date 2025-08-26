class overriding{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat()
    }
    class Amimals{
        void eat(){
            System.out.print("eat anything");
        }
    }
    class deer extends Animals{
        void eat(){
        System.out.println("eat grass");
        }
    }
}