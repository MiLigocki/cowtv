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

    @Test
    void last_station_is_stopklatka() {
        StationLoader sl = new StationLoader();
        List<Station> stationList = sl.getAllStations();

        int index = stationList.size()-1;
        assertEquals(stationList.get(index).getName(), "Stopklatka");
    }






}