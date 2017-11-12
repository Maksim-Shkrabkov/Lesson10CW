package by.htp.speq.logic;

import java.io.FileNotFoundException;

import by.htp.speq.station.Catalog;

public interface StationLogic {
	
	Catalog readCatalog() throws FileNotFoundException;

}
