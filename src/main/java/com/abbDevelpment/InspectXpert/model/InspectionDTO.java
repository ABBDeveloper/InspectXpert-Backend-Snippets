package com.abbDevelpment.InspectXpert.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class InspectionDTO {
    public Long id = 0L;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm")
    public LocalDateTime inspection_date = null;
    public String inspector = "";
    public String manufacturer = "";
    public String model = "";
    public Integer construction_year = 0;
    public String license_plate = "";
    public String chassis_number = "";
    public Integer mileage = 0;
    private String thumbnail = "";
    private String[] inspectionPhotos = null;
    public String selektive_katalytische_reduktion_scr = "";
    public String motor_ol = "";
    public String olfilter = "";
    public String kuhlsystem = "";
    public String kraftstofffilter = "";
    public String luftfilter = "";
    public String getriebe = "";
    public String achsmanschetten = "";
    public String gelenkwelle = "";
    public String lenkungseinheit = "";
    public String bremsanlage = "";
    public String bremswirkung = "";
    public String bremsstarke = "";
    public String bcheibenbremsen = "";
    public String beitungen = "";
    public String schlauche_und_anschlusse = "";
    public String profiltiefe_und_verschleissmuster = "";
    public String aufhangung = "";
    public String stossdampfer = "";
    public String kugelgelenke = "";
    public String reifendruck = "";
    public String anlasser = "";
    public String aussenleuchten = "";
    public String scheinwerfen_ausrichtung = "";
    public String kofferraumbeleuchtung = "";
    public String hupe = "";
    public String kombifilter = "";
    public String windschutzscheibe = "";
    public String wischer_und_waschanlage = "";
    public String wischblatter = "";
    public String fahrzeugboden = "";
    public String stossstange_vorne = "";
    public String motorhaube = "";
    public String linker_kotflugel_vorne = "";
    public String rechter_kotflugel_vorne = "";
    public String linke_tuer_vorne = "";
    public String rechte_tuer_vorne = "";
    public String dach = "";
    public String linke_tuer_hinten = "";
    public String rechte_tuer_hinten = "";
    public String linker_kotflugel_hinten = "";
    public String rechter_kotflugel_hinten = "";
    public String heckklappe = "";
    public String stossstange_hinten = "";


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInspection_date() {
        return inspection_date;
    }

    public void setInspection_date(LocalDateTime inspection_date) {
        this.inspection_date = inspection_date;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getConstruction_year() {
        return construction_year;
    }

    public void setConstruction_year(Integer construction_year) {
        this.construction_year = construction_year;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getChassis_number() {
        return chassis_number;
    }

    public void setChassis_number(String chassis_number) {
        this.chassis_number = chassis_number;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String[] getInspectionPhotos() {
        return inspectionPhotos;
    }

    public void setInspectionPhotos(String[] inspectionPhotos) {
        this.inspectionPhotos = inspectionPhotos;
    }

    public String getSelektive_katalytische_reduktion_scr() {
        return selektive_katalytische_reduktion_scr;
    }

    public void setSelektive_katalytische_reduktion_scr(String selektive_katalytische_reduktion_scr) {
        this.selektive_katalytische_reduktion_scr = selektive_katalytische_reduktion_scr;
    }

    public String getMotor_ol() {
        return motor_ol;
    }

    public void setMotor_ol(String motor_ol) {
        this.motor_ol = motor_ol;
    }

    public String getOlfilter() {
        return olfilter;
    }

    public void setOlfilter(String olfilter) {
        this.olfilter = olfilter;
    }

    public String getKuhlsystem() {
        return kuhlsystem;
    }

    public void setKuhlsystem(String kuhlsystem) {
        this.kuhlsystem = kuhlsystem;
    }

    public String getKraftstofffilter() {
        return kraftstofffilter;
    }

    public void setKraftstofffilter(String kraftstofffilter) {
        this.kraftstofffilter = kraftstofffilter;
    }

    public String getLuftfilter() {
        return luftfilter;
    }

    public void setLuftfilter(String luftfilter) {
        this.luftfilter = luftfilter;
    }

    public String getGetriebe() {
        return getriebe;
    }

    public void setGetriebe(String getriebe) {
        this.getriebe = getriebe;
    }

    public String getAchsmanschetten() {
        return achsmanschetten;
    }

    public void setAchsmanschetten(String achsmanschetten) {
        this.achsmanschetten = achsmanschetten;
    }

    public String getGelenkwelle() {
        return gelenkwelle;
    }

    public void setGelenkwelle(String gelenkwelle) {
        this.gelenkwelle = gelenkwelle;
    }

    public String getLenkungseinheit() {
        return lenkungseinheit;
    }

    public void setLenkungseinheit(String lenkungseinheit) {
        this.lenkungseinheit = lenkungseinheit;
    }

    public String getBremsanlage() {
        return bremsanlage;
    }

    public void setBremsanlage(String bremsanlage) {
        this.bremsanlage = bremsanlage;
    }

    public String getBremswirkung() {
        return bremswirkung;
    }

    public void setBremswirkung(String bremswirkung) {
        this.bremswirkung = bremswirkung;
    }

    public String getBremsstarke() {
        return bremsstarke;
    }

    public void setBremsstarke(String bremsstarke) {
        this.bremsstarke = bremsstarke;
    }

    public String getBcheibenbremsen() {
        return bcheibenbremsen;
    }

    public void setBcheibenbremsen(String bcheibenbremsen) {
        this.bcheibenbremsen = bcheibenbremsen;
    }

    public String getBeitungen() {
        return beitungen;
    }

    public void setBeitungen(String beitungen) {
        this.beitungen = beitungen;
    }

    public String getSchlauche_und_anschlusse() {
        return schlauche_und_anschlusse;
    }

    public void setSchlauche_und_anschlusse(String schlauche_und_anschlusse) {
        this.schlauche_und_anschlusse = schlauche_und_anschlusse;
    }

    public String getProfiltiefe_und_verschleissmuster() {
        return profiltiefe_und_verschleissmuster;
    }

    public void setProfiltiefe_und_verschleissmuster(String profiltiefe_und_verschleissmuster) {
        this.profiltiefe_und_verschleissmuster = profiltiefe_und_verschleissmuster;
    }

    public String getAufhangung() {
        return aufhangung;
    }

    public void setAufhangung(String aufhangung) {
        this.aufhangung = aufhangung;
    }

    public String getStossdampfer() {
        return stossdampfer;
    }

    public void setStossdampfer(String stossdampfer) {
        this.stossdampfer = stossdampfer;
    }

    public String getKugelgelenke() {
        return kugelgelenke;
    }

    public void setKugelgelenke(String kugelgelenke) {
        this.kugelgelenke = kugelgelenke;
    }

    public String getReifendruck() {
        return reifendruck;
    }

    public void setReifendruck(String reifendruck) {
        this.reifendruck = reifendruck;
    }

    public String getAnlasser() {
        return anlasser;
    }

    public void setAnlasser(String anlasser) {
        this.anlasser = anlasser;
    }

    public String getAussenleuchten() {
        return aussenleuchten;
    }

    public void setAussenleuchten(String aussenleuchten) {
        this.aussenleuchten = aussenleuchten;
    }

    public String getScheinwerfen_ausrichtung() {
        return scheinwerfen_ausrichtung;
    }

    public void setScheinwerfen_ausrichtung(String scheinwerfen_ausrichtung) {
        this.scheinwerfen_ausrichtung = scheinwerfen_ausrichtung;
    }

    public String getKofferraumbeleuchtung() {
        return kofferraumbeleuchtung;
    }

    public void setKofferraumbeleuchtung(String kofferraumbeleuchtung) {
        this.kofferraumbeleuchtung = kofferraumbeleuchtung;
    }

    public String getHupe() {
        return hupe;
    }

    public void setHupe(String hupe) {
        this.hupe = hupe;
    }

    public String getKombifilter() {
        return kombifilter;
    }

    public void setKombifilter(String kombifilter) {
        this.kombifilter = kombifilter;
    }

    public String getWindschutzscheibe() {
        return windschutzscheibe;
    }

    public void setWindschutzscheibe(String windschutzscheibe) {
        this.windschutzscheibe = windschutzscheibe;
    }

    public String getWischer_und_waschanlage() {
        return wischer_und_waschanlage;
    }

    public void setWischer_und_waschanlage(String wischer_und_waschanlage) {
        this.wischer_und_waschanlage = wischer_und_waschanlage;
    }

    public String getWischblatter() {
        return wischblatter;
    }

    public void setWischblatter(String wischblatter) {
        this.wischblatter = wischblatter;
    }

    public String getFahrzeugboden() {
        return fahrzeugboden;
    }

    public void setFahrzeugboden(String fahrzeugboden) {
        this.fahrzeugboden = fahrzeugboden;
    }

    public String getStossstange_vorne() {
        return stossstange_vorne;
    }

    public void setStossstange_vorne(String stossstange_vorne) {
        this.stossstange_vorne = stossstange_vorne;
    }

    public String getMotorhaube() {
        return motorhaube;
    }

    public void setMotorhaube(String motorhaube) {
        this.motorhaube = motorhaube;
    }

    public String getLinker_kotflugel_vorne() {
        return linker_kotflugel_vorne;
    }

    public void setLinker_kotflugel_vorne(String linker_kotflugel_vorne) {
        this.linker_kotflugel_vorne = linker_kotflugel_vorne;
    }

    public String getRechter_kotflugel_vorne() {
        return rechter_kotflugel_vorne;
    }

    public void setRechter_kotflugel_vorne(String rechter_kotflugel_vorne) {
        this.rechter_kotflugel_vorne = rechter_kotflugel_vorne;
    }

    public String getLinke_tuer_vorne() {
        return linke_tuer_vorne;
    }

    public void setLinke_tuer_vorne(String linke_tuer_vorne) {
        this.linke_tuer_vorne = linke_tuer_vorne;
    }

    public String getRechte_tuer_vorne() {
        return rechte_tuer_vorne;
    }

    public void setRechte_tuer_vorne(String rechte_tuer_vorne) {
        this.rechte_tuer_vorne = rechte_tuer_vorne;
    }

    public String getDach() {
        return dach;
    }

    public void setDach(String dach) {
        this.dach = dach;
    }

    public String getLinke_tuer_hinten() {
        return linke_tuer_hinten;
    }

    public void setLinke_tuer_hinten(String linke_tuer_hinten) {
        this.linke_tuer_hinten = linke_tuer_hinten;
    }

    public String getRechte_tuer_hinten() {
        return rechte_tuer_hinten;
    }

    public void setRechte_tuer_hinten(String rechte_tuer_hinten) {
        this.rechte_tuer_hinten = rechte_tuer_hinten;
    }

    public String getLinker_kotflugel_hinten() {
        return linker_kotflugel_hinten;
    }

    public void setLinker_kotflugel_hinten(String linker_kotflugel_hinten) {
        this.linker_kotflugel_hinten = linker_kotflugel_hinten;
    }

    public String getRechter_kotflugel_hinten() {
        return rechter_kotflugel_hinten;
    }

    public void setRechter_kotflugel_hinten(String rechter_kotflugel_hinten) {
        this.rechter_kotflugel_hinten = rechter_kotflugel_hinten;
    }

    public String getHeckklappe() {
        return heckklappe;
    }

    public void setHeckklappe(String heckklappe) {
        this.heckklappe = heckklappe;
    }

    public String getStossstange_hinten() {
        return stossstange_hinten;
    }

    public void setStossstange_hinten(String stossstange_hinten) {
        this.stossstange_hinten = stossstange_hinten;
    }
}