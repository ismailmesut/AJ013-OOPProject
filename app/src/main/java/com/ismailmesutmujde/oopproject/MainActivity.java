package com.ismailmesutmujde.oopproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name = "Mesut";
        myUser.job = "Student";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";*/

        User myUser = new User("Mesut", "Student");
        System.out.println(myUser.information());
        System.out.println(myUser.name);

        // Encapsulation (Kapsülleme)
        // Kapsülleme; kısaca bir sınıfın, içerisindeki metod ve değişkenleri korumasıdır. Bünyesindeki metod ve değişkenlere dışarıdan
        // erişmenin sakıncalı  olduğu durumlarda kapsülleme mekanizması kullanılır. Kapsülleme sayesinde sınıf üyeleri, dış dünyadan
        // gizlenir. Tabi bu gizliliğin dereceleri vardır. Bu dereceler erişim belirleyiciler (access modifiers) sayesinde olur.
        // Nesneye yönelik programlamanın temellerinden biri de kapsüllemedir. Çünkü sınıftaki bilgilerin dışarıya kapalı olması gerekir.

        // Access Modifiers (Erişim Belirleyiciler)
        // public    : Bir elemanı public olarak tanımlarsak, bu elemana herkes ulaşabilir.
        // protected : Bir sınıfın protected olarak tanımlanmış elemanına o sınıftan, o sınıftan türetilmiş sınıflardan ve o sınıf ile aynı pakette bulunan sınıflar erişebilir.
        // private   : private olarak tanımlanmış sınıf elemanlarına, yalnızca o sınıftan erişilebilir. O sınıftan türetilen sınıflardan veya aynı pakette bulunan sınıflardan erişilemez.
        // default   : Herhangi bir erişim belirleyici tanımlanmamışsa, default olarak kabul edilir. Default tanımlanmış sınıf elemanlarına, o sınıftan ve aynı paketteki sınıftan erişilebilir.

        Musician james = new Musician("James", "Guitar", 50);
        System.out.println(james.getName());
        james.setAge(60, "Mesut");
        System.out.println(james.getAge());

        // Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        // Polymorphism (Çok Biçimlilik)
        // Polimorphism; yani Çok Biçimlilik, Kalıtım kavramı ile iç içedir. Birbirleriyle beslenirler. Kalıtım konusunda sınıfları türetmeyi görmüştük.
        // Türetilen sınıflar, türediği üst sınıfın öğelerine sahip oluyorken bunun tersi geçerli değildi. Yani temel sınıflar, alt sınıfların üyelerine
        // sahip olamazlar. Polimorphizm yapabilmek için Kalıtım mantığını bilmek gerekir.

        // Polimorphizm, çoklu biçim veya çoklu şekil anlamına gelir. Yani Polimorphizm yapılarak bir nesne, farklı nesneler gibi davranabilir. Bir nesneye,
        // farklı sınıflardan oluşturulmuş nesneler yüklenebilir.

        // Static Polymorphism : Aynı sınıfın içerisinde farklı metodları aynı isimle kullanmaya static polymorphism denir.
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        // Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        // Abstract Classes and Methods (Soyut Sınıflar ve Metodlar)
        // Nesneye yönelik programlamada, sınıfları miras bırakırken bazı metodların içeriğinin farklı olmasını isteyebiliriz veya bir üst sınıfta tanımladığımız ortak metod,
        // sınıfı miras bırakacağımız alt sınıfların bazılarının ihtiyacını karşılamıyor olabilir. Bu gibi durumlarda soyut sınıfları kullanmak bizim için avantaj sağlayacaktır.

        // Soyut sınıflarda amaç, nesne türetirken şablon oluşturmaktır. Soyut sınıfta tanımlanan şablon, bu sınıfı miras alan alt sınıflarda override edilerek yeniden tanımlanır.

        // Soyut sınıf tanımladığımızda içerisinde mutlaka bir soyut metod bulundurması gerekmektedir. Tersini düşündüğümüzde, yani sınıf içerisinde bir soyut metod tanımladığımızda ise,
        // sınıfı soyut işaretçisiyle işaretlemeliyiz(Sınıfı soyut sınıfa çevirmeliyiz) Bir sınıfı veya metodu soyut olarak tanımlamak için erişim belirtecinden sonra abstract anahtar
        // sözcüğünü kullanmalıyız.

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }
}