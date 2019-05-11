package com.holestic.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "stics")
@Data
public class Stic {

    @Id
    String id;

    private Location location;
    private Flag[] flags;
    private Date updateTs;
}
