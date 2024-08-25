package com.ismailmesutmujde.oopproject;

import android.os.Bundle;
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

    }
}