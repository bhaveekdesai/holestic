package com.holestic.service;

import com.holestic.models.Location;
import com.holestic.models.Stic;

import java.util.List;

public interface SticManager {
    public Boolean report(Stic stic);
    public List<Stic> scan(Location location);
}
