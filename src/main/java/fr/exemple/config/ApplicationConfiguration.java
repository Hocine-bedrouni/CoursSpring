package fr.exemple.config;

import fr.exemple.entity.Cornemuse;
import fr.exemple.entity.Instrument;
import fr.exemple.entity.Musicien;
import fr.exemple.entity.Sonneur;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath : application-context.xml")
public class ApplicationConfiguration {

    @Bean(name="cornemuse")
    public Instrument getCornemuse(){
        Instrument instru = new Cornemuse();
        return instru;
    }

//   Injection de bean par l'attribut this
    @Bean
    public Musicien getSonneur() {
        Musicien leSonneur = new Sonneur("hanZ", this.getCornemuse());
        return leSonneur;
    }

//    @Bean desactivé double fonction creation d'un sonneur
    public Musicien getSonneur2(String nom, @Qualifier("cornemuse") Instrument cornemuse) {
        Musicien leSonneur = new Sonneur(nom, cornemuse);
        return leSonneur;
    }

}
