import fr.exemple.config.ApplicationConfiguration;
import fr.exemple.entity.*;

import fr.exemple.entity.factory.MusicienFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void dependanceDirecte() {
//        Instrument laGuitare = new Guitare("power3000");
//        Musicien leMusicien = new Guitariste("bob",laGuitare);
        Musicien leMusicien = new Guitariste("bob", new Guitare("power3000")); /*ou en une seule ligne*/
        leMusicien.jouer();
    }

    public static void injectionDependance() {
        Musicien leMusiscien = MusicienFactory.getGuitariste("vanH", "gibson");
        leMusiscien.jouer();
        Musicien lAutre = MusicienFactory.getPianiste("Mozart", "Yamaha");
        lAutre.jouer();
    }

    public static void withApllicationContext(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Musicien leMusicien = (Musicien) context.getBean("guitariste");
        leMusicien.jouer();
/*  Musicien LePianiste = (Musicien) context.getBean("pianiste"); selection par l'id */
          Musicien LePianiste = (Musicien) context.getBean(Pianiste.class); /* selection par le nom de la class */
        LePianiste.jouer();

        context.close();
    }

    public static void withConfClass(){
//        Methode de class
        AbstractApplicationContext contextClass = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        Methode Xml
        AbstractApplicationContext contextXml = new ClassPathXmlApplicationContext("application-context.xml");

        Instrument laCornemuse = contextClass.getBean(Cornemuse.class);
        System.out.println(laCornemuse.toString());
        Musicien leMusicien = contextClass.getBean(Sonneur.class);
        leMusicien.jouer();
        Musicien lAutre = contextXml.getBean(Guitariste.class);
        lAutre.jouer();

        contextClass.close();
        contextXml.close();

    }

    public static void main(String[] args) {
        System.out.println("================ dependance directe ================");
        dependanceDirecte();
        System.out.println("================ Injection de dependance ================");
        injectionDependance();
        System.out.println("================ utilisation d'un application-contexte en xml ================");
        withApllicationContext();
        System.out.println("================ utilisation d'une class de configuration ================");
        withConfClass();

    }
}


