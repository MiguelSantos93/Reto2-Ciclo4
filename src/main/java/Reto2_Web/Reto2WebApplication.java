
package Reto2_Web;
import Reto2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import Reto2_Web.interfaces.InterfaceAlbahaca;


@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner{
     @Autowired
     private InterfaceAlbahaca interfaceSupplements;
     @Autowired
     private InterfaceUser interfaceUser;

	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
