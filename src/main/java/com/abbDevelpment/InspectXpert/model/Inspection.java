package com.abbDevelpment.InspectXpert.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "inspection")
public class Inspection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inspection_date")
    private LocalDateTime inspectionDate;

    @Column(name = "inspector")
    private String inspector;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "model")
    private String model;

    @Column(name = "construction_year")
    private Integer constructionYear;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "chassis_number")
    private String chassisNumber;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "selektive_katalytische_reduktion_scr")
    private String selektiveKatalytischeReduktionSCR;

    @Column(name = "motor_ol")
    private String motorOl;

    @Column(name = "olfilter")
    private String olfilter;

    @Column(name = "kuhlsystem")
    private String kuhlsystem;

    @Column(name = "kraftstofffilter")
    private String kraftstofffilter;

    @Column(name = "luftfilter")
    private String luftfilter;

    @Column(name = "getriebe")
    private String getriebe;

    @Column(name = "achsmanschetten")
    private String achsmanschetten;

    @Column(name = "gelenkwelle")
    private String gelenkwelle;

    @Column(name = "lenkungseinheit")
    private String lenkungseinheit;

    @Column(name = "bremsanlage")
    private String bremsanlage;

    @Column(name = "bremswirkung")
    private String bremswirkung;

    @Column(name = "bremsstarke")
    private String bremsstarke;

    @Column(name = "bcheibenbremsen")
    private String bcheibenbremsen;

    @Column(name = "beitungen")
    private String beitungen;

    @Column(name = "schlauche_und_anschlusse")
    private String schlaucheUndAnschlusse;

    @Column(name = "profiltiefe_und_verschleissmuster")
    private String profiltiefeUndVerschleissmuster;

    @Column(name = "aufhangung")
    private String aufhangung;

    @Column(name = "stossdampfer")
    private String stossdampfer;

    @Column(name = "kugelgelenke")
    private String kugelgelenke;

    @Column(name = "reifendruck")
    private String reifendruck;

    @Column(name = "anlasser")
    private String anlasser;

    @Column(name = "aussenleuchten")
    private String aussenleuchten;

    @Column(name = "scheinwerfen_ausrichtung")
    private String scheinwerfenAusrichtung;

    @Column(name = "kofferraumbeleuchtung")
    private String kofferraumbeleuchtung;

    @Column(name = "hupe")
    private String hupe;

    @Column(name = "kombifilter")
    private String kombifilter;

    @Column(name = "windschutzscheibe")
    private String windschutzscheibe;

    @Column(name = "wischer_und_waschanlage")
    private String wischerUndWaschanlage;

    @Column(name = "wischblatter")
    private String wischblatter;

    @Column(name = "fahrzeugboden")
    private String fahrzeugboden;

    @Column(name = "stossstange_vorne")
    private String stossstangeVorne;

    @Column(name = "motorhaube")
    private String motorhaube;

    @Column(name = "linker_kotflugel_vorne")
    private String linkerKotflugelVorne;

    @Column(name = "rechter_kotflugel_vorne")
    private String rechterKotflugelVorne;

    @Column(name = "linke_tuer_vorne")
    private String linkeTuerVorne;

    @Column(name = "rechte_tuer_vorne")
    private String rechteTuerVorne;

    @Column(name = "dach")
    private String dach;

    @Column(name = "linke_tuer_hinten")
    private String linkeTuerHinten;

    @Column(name = "rechte_tuer_hinten")
    private String rechteTuerHinten;

    @Column(name = "linker_kotflugel_hinten")
    private String linkerKotflugelHinten;

    @Column(name = "rechter_kotflugel_hinten")
    private String rechterKotflugelHinten;

    @Column(name = "heckklappe")
    private String heckklappe;

    @Column(name = "stossstange_hinten")
    private String stossstangeHinten;

    @PrePersist
    @PreUpdate
    public void prePersist() {
        this.inspectionDate = LocalDateTime.now();
    }

    // Getter und Setter Methoden

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDateTime inspectionDate) {
        this.inspectionDate = inspectionDate;
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

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
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

    public String getSelektiveKatalytischeReduktionSCR() {
        return selektiveKatalytischeReduktionSCR;
    }

    public void setSelektiveKatalytischeReduktionSCR(String selektiveKatalytischeReduktionSCR) {
        this.selektiveKatalytischeReduktionSCR = selektiveKatalytischeReduktionSCR;
    }

    public String getMotorOl() {
        return motorOl;
    }

    public void setMotorOl(String motorOl) {
        this.motorOl = motorOl;
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

    public String getSchlaucheUndAnschlusse() {
        return schlaucheUndAnschlusse;
    }

    public void setSchlaucheUndAnschlusse(String schlaucheUndAnschlusse) {
        this.schlaucheUndAnschlusse = schlaucheUndAnschlusse;
    }

    public String getProfiltiefeUndVerschleissmuster() {
        return profiltiefeUndVerschleissmuster;
    }

    public void setProfiltiefeUndVerschleissmuster(String profiltiefeUndVerschleissmuster) {
        this.profiltiefeUndVerschleissmuster = profiltiefeUndVerschleissmuster;
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

    public String getScheinwerfenAusrichtung() {
        return scheinwerfenAusrichtung;
    }

    public void setScheinwerfenAusrichtung(String scheinwerfenAusrichtung) {
        this.scheinwerfenAusrichtung = scheinwerfenAusrichtung;
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

    public String getWischerUndWaschanlage() {
        return wischerUndWaschanlage;
    }

    public void setWischerUndWaschanlage(String wischerUndWaschanlage) {
        this.wischerUndWaschanlage = wischerUndWaschanlage;
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

    public String getStossstangeVorne() {
        return stossstangeVorne;
    }

    public void setStossstangeVorne(String stossstangeVorne) {
        this.stossstangeVorne = stossstangeVorne;
    }

    public String getMotorhaube() {
        return motorhaube;
    }

    public void setMotorhaube(String motorhaube) {
        this.motorhaube = motorhaube;
    }

    public String getLinkerKotflugelVorne() {
        return linkerKotflugelVorne;
    }

    public void setLinkerKotflugelVorne(String linkerKotflugelVorne) {
        this.linkerKotflugelVorne = linkerKotflugelVorne;
    }

    public String getRechterKotflugelVorne() {
        return rechterKotflugelVorne;
    }

    public void setRechterKotflugelVorne(String rechterKotflugelVorne) {
        this.rechterKotflugelVorne = rechterKotflugelVorne;
    }

    public String getLinkeTuerVorne() {
        return linkeTuerVorne;
    }

    public void setLinkeTuerVorne(String linkeTuerVorne) {
        this.linkeTuerVorne = linkeTuerVorne;
    }

    public String getRechteTuerVorne() {
        return rechteTuerVorne;
    }

    public void setRechteTuerVorne(String rechteTuerVorne) {
        this.rechteTuerVorne = rechteTuerVorne;
    }

    public String getDach() {
        return dach;
    }

    public void setDach(String dach) {
        this.dach = dach;
    }

    public String getLinkeTuerHinten() {
        return linkeTuerHinten;
    }

    public void setLinkeTuerHinten(String linkeTuerHinten) {
        this.linkeTuerHinten = linkeTuerHinten;
    }

    public String getRechteTuerHinten() {
        return rechteTuerHinten;
    }

    public void setRechteTuerHinten(String rechteTuerHinten) {
        this.rechteTuerHinten = rechteTuerHinten;
    }

    public String getLinkerKotflugelHinten() {
        return linkerKotflugelHinten;
    }

    public void setLinkerKotflugelHinten(String linkerKotflugelHinten) {
        this.linkerKotflugelHinten = linkerKotflugelHinten;
    }

    public String getRechterKotflugelHinten() {
        return rechterKotflugelHinten;
    }

    public void setRechterKotflugelHinten(String rechterKotflugelHinten) {
        this.rechterKotflugelHinten = rechterKotflugelHinten;
    }

    public String getHeckklappe() {
        return heckklappe;
    }

    public void setHeckklappe(String heckklappe) {
        this.heckklappe = heckklappe;
    }

    public String getStossstangeHinten() {
        return stossstangeHinten;
    }

    public void setStossstangeHinten(String stossstangeHinten) {
        this.stossstangeHinten = stossstangeHinten;
    }
}