package org.vuvo.address;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Setter
@Getter
@MongoEntity(collection = "cities")
public class City extends ReactivePanacheMongoEntity {

    @BsonProperty("id")
    private int id;
    @BsonProperty("name")
    private String name;

    @BsonProperty("state_code")
    private String state;

    @BsonProperty("country_code")
    private String country;
}