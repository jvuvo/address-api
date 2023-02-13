package org.vuvo.address;

import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/api/countries")
public class CountryStateResource {

    @Inject
    CountryService countryService;

    @GET
    public Uni<List<Country>> countries() {
        return countryService.list();
    }

    @Path("/{country}/states")
    @GET
    public Uni<List<State>> statesByCountry(@PathParam("country") String country) {
        return countryService.getStatesByCountry(country);
    }

    @Path("/{country}/states/{state}/cities")
    @GET
    public Uni<List<State>> states(@PathParam("country") String country, @PathParam("state") String state) {
        return countryService.getCities(country, state);
    }

}