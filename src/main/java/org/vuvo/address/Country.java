package org.vuvo.address;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Setter
@Getter
@MongoEntity(collection = "countries")
public class Country extends ReactivePanacheMongoEntity {

    @BsonProperty("id")
    private int id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("iso2")
    private String code;
}
