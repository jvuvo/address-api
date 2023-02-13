package org.vuvo.address;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;


@ApplicationScoped
public class CountryService {

    public Uni<List<Country>> list() {
        return Country.listAll();
    }

    public Uni<List<State>> getStatesByCountry(String country) {
        return State.list("country", country);
    }

    public Uni<List<State>> getCities(String country, String state) {
        return City.list("country =?1 and state =?2", country, state);
    }
}
