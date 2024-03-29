package org.jlobato.gpro.dao.mybatis.facade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jlobato.gpro.dao.mybatis.mappers.PitstopMapper;
import org.jlobato.gpro.dao.mybatis.mappers.RaceDataMapper;
import org.jlobato.gpro.dao.mybatis.mappers.RaceLapDataMapper;
import org.jlobato.gpro.dao.mybatis.mappers.TechProblemMapper;
import org.jlobato.gpro.dao.mybatis.mappers.TyreCompoundMapper;
import org.jlobato.gpro.dao.mybatis.mappers.WeatherMapper;
import org.jlobato.gpro.dao.mybatis.model.Manager;
import org.jlobato.gpro.dao.mybatis.model.Pitstop;
import org.jlobato.gpro.dao.mybatis.model.Race;
import org.jlobato.gpro.dao.mybatis.model.RaceData;
import org.jlobato.gpro.dao.mybatis.model.RaceLapData;
import org.jlobato.gpro.dao.mybatis.model.Season;
import org.jlobato.gpro.dao.mybatis.model.TechProblem;
import org.jlobato.gpro.dao.mybatis.model.Track;
import org.jlobato.gpro.dao.mybatis.model.TyreCompound;
import org.jlobato.gpro.dao.mybatis.model.TyreCompoundExample;
import org.jlobato.gpro.dao.mybatis.model.Weather;
import org.jlobato.gpro.dao.mybatis.model.WeatherExample;
import org.jlobato.gpro.sheetparser.RaceDataSheetModel;
import org.jlobato.gpro.sheetparser.RaceLapInfo;
import org.jlobato.gpro.sheetparser.RaceStopInfo;
import org.jlobato.gpro.sheetparser.TechProblemInfo;
import org.jlobato.gpro.utils.GPROUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


//TODO - Quitar la dependencia con el sheet parser

@Repository
@Transactional
public class FachadaRaceData {
	
	private static final transient Logger logger = LoggerFactory.getLogger(FachadaRaceData.class);
	
	/**
	 * 
	 */
    @Autowired
    protected RaceDataMapper racedataDAO;
    
    /**
     * 
     */
    @Autowired
    protected RaceLapDataMapper racedataLapDAO;
    
    /**
     * 
     */
    @Autowired
    protected TyreCompoundMapper tyreCompoundDAO;
    
    /**
     * 
     */
    @Autowired
    protected WeatherMapper weatherDAO;
    
    /**
     * 
     */
    @Autowired
    protected PitstopMapper pitstopDAO;

    /**
     * 
     */
    @Autowired
    protected TechProblemMapper techProblemDAO;
    
	/**
	 * 
	 */
    @Autowired
	FachadaManager managerFacade;
	
	/**
	 * 
	 */
	@Autowired
	FachadaTrack trackFacade;
	
	/**
	 * 
	 */
	@Autowired
	FachadaSeason seasonFacade;
	
    
    /**
     * 
     * @param record
     */
    public void addRaceData(RaceData record) {
    	logger.debug("Inserting racedata '" + record + "'");
    	racedataDAO.insert(record);
    	logger.debug("Racedata inserted '" + record + "'");
    }


    /**
     * 
     * @param raceLapData
     */
	public void addRaceLapData(RaceLapData raceLapData) {
    	logger.debug("Inserting racedata '" + raceLapData + "'");
    	racedataLapDAO.insert(raceLapData);
    	logger.debug("Racedata inserted '" + raceLapData + "'");
		
	}
	
	/**
	 * 
	 * @param description
	 * @return
	 */
	public Integer getTyreIdFromDescription(String description) {
		Integer result = null;
		TyreCompoundExample tyreExample = new TyreCompoundExample();
		tyreExample.createCriteria().andDescriptionCompoundEqualTo(description);
		List<TyreCompound> matches = tyreCompoundDAO.selectByExample(tyreExample);
		if (!matches.isEmpty()) {
			result = matches.get(0).getIdTyrecompound();
		}
		return result;		
	}


	/**
	 * 
	 * @param lapWeather
	 * @return
	 */
	public Integer getWeatherIdFromDescription(String description) {
		Integer result = null;
		WeatherExample weatherExample = new WeatherExample();
		weatherExample.createCriteria().andDescriptionWeatherEqualTo(description);
		List<Weather> matches = weatherDAO.selectByExample(weatherExample);
		if (!matches.isEmpty()) {
			result = matches.get(0).getIdWeather();
		}
		return result;	
	}

	/**
	 * 
	 * @param pitstop
	 */
	public void addPitStop(Pitstop pitstop) {
    	logger.debug("Inserting pitstop '" + pitstop + "'");
    	pitstopDAO.insert(pitstop);
    	logger.debug("Pitstop inserted '" + pitstop + "'");
	}


	/**
	 * 
	 * @param techProblem
	 */
	public void addTechProblem(TechProblem techProblem) {
    	logger.debug("Inserting techProblem '" + techProblem + "'");
    	techProblemDAO.insert(techProblem);
    	logger.debug("TechProblem inserted '" + techProblem + "'");
	}
	
	/**
	 * 
	 * @param raceDescription
	 * @param codManager
	 * @param model
	 */
	public void importRace(String raceDescription, String codManager, RaceDataSheetModel model) {
		String raceDetailedDescription = raceDescription;
		try {
			//TODO Controlar que la carrera ya está importada
			//Ahora habría que importar la información. Para empezar averiguarmos a qué manager pertenece
			Manager manager = managerFacade.getManagerByCode(codManager);
			if (manager == null) {
				throw new IllegalArgumentException("Manager con código '" + codManager + "' no encontrado");
			}
			
			Short idseason = Short.valueOf((short)model.getSeasonNumber().intValue()); 
			
			//Encontramos el circuto al que corresponde la carrera
			Track track = trackFacade.getTrackByName(model.getTrackName());
			if (track == null) {
				throw new IllegalArgumentException("Circuito con nombre '" + model.getTrackName() + "' no encontrado");
			}
			
			//Creamos el objeto RaceData
			RaceData raceData = new RaceData();
			//TODO (hay que cambiar los shorts por los ints)
			raceData.withIdManager(manager.getIdManager()).withIdTrack(track.getIdTrack()).withIdSeason(idseason);
			
			Race theRace = seasonFacade.getRace(new Season().withIdSeason(idseason), track);
			if (theRace != null) {
				raceData.setIdRace(theRace.getIdRace());
			}
			
			raceDetailedDescription = manager.getFirstName() + " " + manager.getLastName() + " de la temporada " + model.getSeason() + ((theRace != null) ? " carrera " + theRace.getIdRace() : "") + " en el circuito " + model.getTrackName();
			
			logger.info("Importando raceanalysis de " + raceDetailedDescription);
			
			//setup utilizado
			raceData.withSetupEn(Short.valueOf((short)model.getEngineSetup())).
				withSetupFw(Short.valueOf((short)model.getFrontWingSetup())).
				withSetupRw(Short.valueOf((short)model.getRearWingSetup())).
				withSetupBr(Short.valueOf((short)model.getBrakesSetup())).
				withSetupSu(Short.valueOf((short)model.getSuspensionSetup())).
				withSetupGe(Short.valueOf((short)model.getGearboxSetup()));
			
			//riesgos utilizados
			raceData.withOvertakeRisks(Short.valueOf((short)model.getOvertakeRisks())).
				withDefendRisks(Short.valueOf((short)model.getDefendRisks())).
				withDryRisks(Short.valueOf((short)model.getClearDryRisks())).
				withWetRisks(Short.valueOf((short)model.getClearWetRisks())).
				withMalfunctionRisks(Short.valueOf((short)model.getMalfunctRisks()));
			
			//wears iniciales
			raceData.withWeastaCh(Short.valueOf((short)model.getChassisStartWear())).
				withWeastaEn(Short.valueOf((short)model.getEngineStartWear())).
				withWeastaFw(Short.valueOf((short)model.getFrontWingStartWear())).
				withWeastaRw(Short.valueOf((short)model.getRearWingStartWear())).
				withWeastaUn(Short.valueOf((short)model.getUnderbodyStartWear())).
				withWeastaSi(Short.valueOf((short)model.getSidepodsStartWear())).
				withWeastaCo(Short.valueOf((short)model.getCoolingStartWear())).
				withWeastaGe(Short.valueOf((short)model.getGearboxStartWear())).
				withWeastaBr(Short.valueOf((short)model.getBrakesStartWear())).
				withWeastaSu(Short.valueOf((short)model.getSuspensionStartWear())).
				withWeastaEl(Short.valueOf((short)model.getElectronicsStartWear()));
			
			//wears finales
			raceData.withWeaendCh(Short.valueOf((short)model.getChassisEndWear())).
				withWeaendEn(Short.valueOf((short)model.getEngineEndWear())).
				withWeaendFw(Short.valueOf((short)model.getFrontWingEndWear())).
				withWeaendRw(Short.valueOf((short)model.getRearWingEndWear())).
				withWeaendUn(Short.valueOf((short)model.getUnderbodyEndWear())).
				withWeaendSi(Short.valueOf((short)model.getSidepodsEndWear())).
				withWeaendCo(Short.valueOf((short)model.getCoolingEndWear())).
				withWeaendGe(Short.valueOf((short)model.getGearboxEndWear())).
				withWeaendBr(Short.valueOf((short)model.getBrakesEndWear())).
				withWeaendSu(Short.valueOf((short)model.getSuspensionEndWear())).
				withWeaendEl(Short.valueOf((short)model.getElectronicsEndWear()));
			
			//car levels
			raceData.withCarlvlCh(Short.valueOf((short)model.getChassisLevel())).
				withCarlvlEn(Short.valueOf((short)model.getEngineLevel())).
				withCarlvlFw(Short.valueOf((short)model.getFrontWingLevel())).
				withCarlvlRw(Short.valueOf((short)model.getRearWingLevel())).
				withCarlvlUn(Short.valueOf((short)model.getUnderbodyLevel())).
				withCarlvlSi(Short.valueOf((short)model.getSidepodsLevel())).
				withCarlvlCo(Short.valueOf((short)model.getCoolingLevel())).
				withCarlvlGe(Short.valueOf((short)model.getGearboxLevel())).
				withCarlvlBr(Short.valueOf((short)model.getBrakesLevel())).
				withCarlvlSu(Short.valueOf((short)model.getSuspensionLevel())).
				withCarlvlEl(Short.valueOf((short)model.getElectronicsLevel()));
			
			//Fuel and tyres data
			raceData.withFuelSta(Short.valueOf((short)model.getStartFuel()));
			if (model.getEndFuel() != null) {
				raceData.withFuelEnd(Short.valueOf((short)model.getEndFuel().intValue()));
			}
			if (model.getEndTyres() != null) {
				raceData.withTyrEnd(Short.valueOf((short)model.getEndTyres().intValue()));
				
			}
				
			addRaceData(raceData);
			
			logger.debug("Creado registro en racedata con id: " + raceData.getIdRacedata());
			
			//Ahora vamos con el resto de datos asociados a la carrera
			//Detalle de las vueltas
			Iterator<RaceLapInfo> lapsInfoIterator = model.getLapsList().iterator();
			Integer raceTyreCompound = null;
			List<RaceLapData> noTyresInfoLaps = new ArrayList<>();
			while(lapsInfoIterator.hasNext()) {
				RaceLapInfo lap = lapsInfoIterator.next();
				//Creamos el DAO para las vueltas de carrera
				RaceLapData raceLapData = new RaceLapData();
				WornLap wornLap = new WornLap();
				raceLapData.withIdRacedata(raceData.getIdRacedata())
					.withLapNo((short)lap.getLapNumber())
					.withLapTime(GPROUtils.getMilis(lap.getLapTime()))
					.withLapPosition((short)lap.getLapPosition())
					.withLapTemp((short)lap.getLapTemperature())
					.withLapHumidity((short)lap.getLapHumidity())
					.withIdTyrecompound(raceTyreCompound = getTyreCompound(lap.getLapTyres(), wornLap))
					.withIdWeather(getIdWeather(lap.getLapWeather()))
					.withWornTyres(wornLap.isWornLap())
					.withLapEvents(lap.getLapEvent());
				
				
				if (raceTyreCompound != null) {
					addRaceLapData(raceLapData);
				}
				else {
					//No tenemos el dato de los neumáticos. Lo dejamos para más tarde
					noTyresInfoLaps.add(raceLapData);
				}
			}
			
			//Repasamos las vueltas que puedan no tener información sobre los neumáticos
			//Si hemos averiguado el neumático de la carrera
			if (raceTyreCompound != null) {
				Iterator<RaceLapData> noTyresIteraror = noTyresInfoLaps.iterator();
				while(noTyresIteraror.hasNext()) {
					RaceLapData raceLapData = noTyresIteraror.next();
					//Le asignamos el dato que falta
					raceLapData.withIdTyrecompound(raceTyreCompound);
					//Añadimos a la lista de vueltas a importar
					addRaceLapData(raceLapData);
				}
			}
			
			logger.debug("Creados registros en racelapdata para el racedata con id: " + raceData.getIdRacedata());
			
			//Pitstops
			Iterator<RaceStopInfo> pitstopsInfo = model.getStopsList().iterator();
			while(pitstopsInfo.hasNext()) {
				RaceStopInfo pitstop = pitstopsInfo.next();
				
				//Creamos el DAO para las paradas en boxes
				Pitstop pitstopObject = new Pitstop();
				pitstopObject.withIdRacedata(raceData.getIdRacedata())
					.withPitLap((short)pitstop.getStopLapNumber())
					.withPitNo(GPROUtils.getPitNo(pitstop.getStopInfo()).shortValue())
					.withPitFuel((short)pitstop.getStopFuelLeft())
					.withPitTime(pitstop.getStopPitTime())
					.withPitTyres((short) pitstop.getStopTyresCondition())
					.withPitRefill((short) pitstop.getStopRefilledLitres())
					.withPitReason(pitstop.getStopReason()); //TODO Incorporar "on the fly" las posibles razones para una parada
				
				addPitStop(pitstopObject);
			}

			logger.debug("Creados registros en pitstop para el racedata con id: " + raceData.getIdRacedata());
			
			//Techproblems
			Iterator<TechProblemInfo> techProblemsInfo = model.getTechProblemsList().iterator();
			while(techProblemsInfo.hasNext()) {
				TechProblemInfo techProblem = techProblemsInfo.next();
				
				//Creamos el DAO para los problemas técnicos
				TechProblem techProblemObject = new TechProblem();
				techProblemObject.withIdRacedata(raceData.getIdRacedata())
					.withDescriptionTp(techProblem.getTechProblemInfo())
					.withTpLap((short) techProblem.getLapInfo());
				
				addTechProblem(techProblemObject);
			}
			logger.info("Carrera importada " + raceDetailedDescription);
			
		}catch (Exception e) {
			System.out.println("NO SE PUDO IMPORTAR LA CARRERA " + raceDetailedDescription);
			throw e;
		}
	}
	
	/**
	 * 
	 * @param lapWeather
	 * @return
	 */
	public Integer getIdWeather(String lapWeather) {
		Integer result =  getWeatherIdFromDescription(lapWeather);
		if (result == null) {
			//Incorporamos un nuevo Id Weather
			//Chapu: asignamos un codigo "ACME" que no debe exitir para la creacion del id weather. Luego cambiamos ese codigo en funcion del del id weather generado
			Weather weather = new Weather().withDescriptionWeather(lapWeather).withCodWeather("AC");
			weatherDAO.insert(weather);
			//Ahora con el id weather generamos el codigo unico
			//Habria que formatearlo a dos caracteres rellando con 0 por delante
			//TODO Dejar el formateo a hexadecimal, pero asegurando que no hay mas de dos caracteres
			String code = Integer.toHexString(weather.getIdWeather());
			weather.setCodWeather(code);
			//Actualizamos
			weatherDAO.updateByPrimaryKey(weather);
			result = weather.getIdWeather();
		}
		return result;
	}
	

	/**
	 * 
	 * @param lapTyres
	 * @param wornLap 
	 * @return
	 */
	private Integer getTyreCompound(String lapTyres, WornLap wornLap) {
		Integer result = null;
		if (lapTyres != null) {
			int worn = lapTyres.indexOf("(worn)");
			String tyreCompoundDescription = lapTyres;
			if (worn > 0) {
				//Esta vuelta se ha dado con los neumáticos desgastados
				wornLap.setWornLap(Boolean.TRUE);
				//Recalculamos la descripcion
				tyreCompoundDescription = lapTyres.substring(0, worn - 1).trim();
			}
			result =  getTyreIdFromDescription(tyreCompoundDescription);
		}
		return result;
	}


	
	/**
	 * 
	 * @author JLOBATO
	 *
	 */
	private static class WornLap {
		/**
		 * 
		 */
		private Boolean wornLap;
		/**
		 * 
		 */
		private WornLap() {
			this.wornLap = Boolean.FALSE;
		}
		
		/**
		 * 
		 * @return
		 */
		public Boolean isWornLap() {
			return wornLap;
		}
		
		/**
		 * 
		 * @param wornLap
		 */
		public void setWornLap(Boolean wornLap) {
			this.wornLap = wornLap;
		}
	}
	
}
