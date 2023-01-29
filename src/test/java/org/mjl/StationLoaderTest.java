package org.mjl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class StationLoaderTest {

    @Test
    void kultura_has_first_index() {
        StationLoader sl = new StationLoader();
        List<Station> stationList = sl.getAllStations();

        String kultura = stationList.get(0).getName();
        assertEquals(kultura, "TVP Kultura");
    }




}