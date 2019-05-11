package com.holestic.repository;

import com.holestic.models.Location;
import com.holestic.models.Stic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface SticRepository extends MongoRepository<Stic, String> {

    //@Query("SELECT s FROM stics s WHERE s.location = :location ORDER BY updateTs DESC FETCH 1 ROW ONLY")
    //public List<Stic> scan(@Param("location") Location location);

    public List<Stic> findByLocation(Location location);
}
