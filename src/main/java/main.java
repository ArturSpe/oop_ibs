import Box.*;
import Sweetness.*;


public class main {
    public static void main (String [] args){

        Box box = new BoxImpl();

        BaseSweetness milka = new ChocolateString<Double>(2.5, "Милка", 500, 1000);
        BaseSweetness koster = new CandiesInt<String>("asd", "Костер", 250, 500);
        BaseSweetness kkofe = new CookieChar<Box>(box,"Ккофе", 600, 100);
        box.addSweetness(milka).addSweetness(koster).addSweetness(kkofe);

        box.about();
        System.out.println(" ");

        box.smartOptimization(600, TypeSmartOptimisation.PRICE);

        box.about();
        System.out.println(" ");

        BaseSweetness alenka = new ChocolateString<>(2.5, "Аленка", 500, 1000);
        BaseSweetness monomah = new CandiesInt<>("asd", "Мономах", 250, 500);
        BaseSweetness chocoPie = new CookieChar<>(box,"Чоко пай", 600, 100);
        box.addSweetness(alenka).addSweetness(monomah).addSweetness(chocoPie);

        box.about();
        System.out.println(" ");

        box.remove(alenka);

        box.about();
        System.out.println(" ");

        box.smartOptimization(1200, TypeSmartOptimisation.MASS);

        box.about();
        System.out.println(" ");

    }
}