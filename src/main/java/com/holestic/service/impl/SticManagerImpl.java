package com.holestic.service.impl;

import com.holestic.models.Location;
import com.holestic.models.Stic;
import com.holestic.repository.SticRepository;
import com.holestic.service.SticManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
public class SticManagerImpl implements SticManager {

    @Autowired
    private SticRepository repository;

    @Override
    public Boolean report(Stic stic) {
        stic.setUpdateTs(Timestamp.from(Instant.now()));
        return ((null != repository.save(stic)) ? true : false);
    }

    @Override
    public List<Stic> scan(Location location) {
        return repository.findByLocation(location);
    }
}
