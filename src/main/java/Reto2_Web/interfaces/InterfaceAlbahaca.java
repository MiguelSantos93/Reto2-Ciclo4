
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Albahaca;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfaceAlbahaca extends MongoRepository<Albahaca, String> {
    
}
