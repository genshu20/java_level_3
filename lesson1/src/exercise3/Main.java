package exercise3;

public class Main {
    public static void main(String[] args) {
        BoxWithFruits<Apple>boxApple1=new BoxWithFruits<>(30);
        BoxWithFruits<Apple>boxApple2=new BoxWithFruits<>(30);
        BoxWithFruits<Orange>boxOrange1=new BoxWithFruits<>(30);
        BoxWithFruits<Orange>boxOrange2=new BoxWithFruits<>(30);

        boxApple1.replace(15,boxApple2);
        System.out.println("boxApple1: "+boxApple1.getNumber()+" "+"boxApple2: "+boxApple2.getNumber());
       // boxApple1.replace(15,boxOrange2);// ошибка, что и требовалось

    }
}
