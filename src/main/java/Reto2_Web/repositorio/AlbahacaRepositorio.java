
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Albahaca;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceAlbahaca;


@Repository
public class AlbahacaRepositorio {
    @Autowired
    private InterfaceAlbahaca repository;

    public List<Albahaca> getAll() {
        return repository.findAll();
    }

    public Optional<Albahaca> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Albahaca create(Albahaca clothe) {
        return repository.save(clothe);
    }

    public void update(Albahaca clothe) {
        repository.save(clothe);
    }
    
    public void delete(Albahaca clothe) {
        repository.delete(clothe);
    }
}
