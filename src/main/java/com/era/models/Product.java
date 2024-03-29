/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Index;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "prods", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id_id")})
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_id", nullable = false)
    private int id;
    
    @Index(name = "prods_prod_index")
    @Column(name = "code", nullable = false, length = 255)
    private String code;
    
    @Column(name = "prodop1", length = 30)
    private String codeProductOptional1 = "";
    
    @Column(name = "prodop2", length = 30)
    private String codeProductOptional2 = "";
    
    @Column(name = "provop1", length = 30)
    private String providerOptional1 = "";
    
    @Column(name = "provop2", length = 30)
    private String providerOptional2 = "";
    
    @Column(name = "codmed", length = 30)
    private String codeMeasure = "";
        
    @Column(name = "garan", length = 30)
    private String warranty = "";
    
    @Column(name = "clasjera", length = 2028)
    private String classJerarchy = "";
    
    @Column(name = "descrip", nullable = false, length = 1000)
    private String description;
    
    @Column(name = "descripcort", length = 255)
    private String shortDescription = "";
    
    @Column(name = "lin", length = 30)
    private String codeLine = "";
                        
    @Column(name = "metcost",  length = 10)
    private String costMethod = "ultcost";
    
    @Column(name = "tip", length = 30)
    private String tip = "";
    
    @Column(name = "solmaxmin", length = 11, columnDefinition = "int default false")
    private boolean askMaxMin = false;
    
    @Column(name = "marc", length = 30)
    private String brand = "";
    
    @Column(name = "codubi", length = 30)
    private String codeUbication = "";
    
    @Column(name = "mode", length = 30)
    private String model = "";
    
    @Column(name = "fab", length = 30)
    private String maker = "";
    
    @Column(name = "colo", length = 30)
    private String color = "";
                        
    @Column(name = "name", length = 30)
    private String name = "";
    
    @Column(name = "solser", columnDefinition = "boolean default false")
    private boolean askSerie = false;
    
    @Column(name = "codext", length = 30)
    private String codeExtra = "";
    
    @Column(name = "noser", length = 30)
    private String serialNumber = "";
    
    @Column(name = "comenser", length = 600)
    private String comentSerial = "";
    
    @Column(name = "rutimg", length = 500)
    private String pathIMG = "";
        
    @Column(name = "impue", length = 30)
    private String codeTax = "";
    
    @Column(name = "pes", length = 30)
    private String weight = "";
    
    @Column(name = "pesman", columnDefinition = "float default 0")
    private float weightMan = 0;
    
    @Column(name = "prelist1", columnDefinition = "float default 0")
    private float priceList1 = 0;
    
    @Column(name = "prelist2", columnDefinition = "float default 0")
    private float priceList2 = 0;
                
    @Column(name = "prelist3", columnDefinition = "float default 0")
    private float priceList3 = 0;
    
    @Column(name = "prelist4", columnDefinition = "float default 0")
    private float priceList4 = 0;
    
    @Column(name = "prelist5", columnDefinition = "float default 0")
    private float priceList5 = 0;
    
    @Column(name = "prelist6", columnDefinition = "float default 0")
    private float priceList6 = 0;
    
    @Column(name = "prelist7", columnDefinition = "float default 0")
    private float priceList7 = 0;
    
    @Column(name = "prelist8", columnDefinition = "float default 0")
    private float priceList8 = 0;
    
    @Column(name = "prelist9", columnDefinition = "float default 0")
    private float priceList9 = 0;
    
    @Column(name = "prelist10", columnDefinition = "float default 0")
    private float priceList10 = 0;
    
    @Column(name = "utilvta1", columnDefinition = "float default 0")
    private float utilSales1 = 0;
    
    @Column(name = "utilvta2", columnDefinition = "float default 0")
    private float utilSales2 = 0;
    
    @Column(name = "utilvta3", columnDefinition = "float default 0")
    private float utilSales3 = 0;
    
    @Column(name = "utilvta4", columnDefinition = "float default 0")
    private float utilSales4 = 0;
    
    @Column(name = "utilvta5", columnDefinition = "float default 0")
    private float utilSales5 = 0;
    
    @Column(name = "utilvta6", columnDefinition = "float default 0")
    private float utilSales6 = 0;
    
    @Column(name = "utilvta7", columnDefinition = "float default 0")
    private float utilSales7 = 0;
    
    @Column(name = "utilvta8", columnDefinition = "float default 0")
    private float utilSales8 = 0;
    
    @Column(name = "utilvta9", columnDefinition = "float default 0")
    private float utilSales9 = 0;
    
    @Column(name = "utilvta10", columnDefinition = "float default 0")
    private float utilSales10 = 0;        
    
    @Column(name = "utility1", columnDefinition = "float default 0")
    private float utility1 = 0;
    
    @Column(name = "utility2", columnDefinition = "float default 0")
    private float utility2 = 0;
    
    @Column(name = "utility3", columnDefinition = "float default 0")
    private float utility3 = 0;
    
    @Column(name = "utility4", columnDefinition = "float default 0")
    private float utility4 = 0;
    
    @Column(name = "utility5", columnDefinition = "float default 0")
    private float utility5 = 0;
    
    @Column(name = "utility6", columnDefinition = "float default 0")
    private float utility6 = 0;
    
    @Column(name = "utility7", columnDefinition = "float default 0")
    private float utility7 = 0;
    
    @Column(name = "utility8", columnDefinition = "float default 0")
    private float utility8 = 0;
    
    @Column(name = "utility9", columnDefinition = "float default 0")
    private float utility9 = 0;
    
    @Column(name = "utility10", columnDefinition = "float default 0")
    private float utility10 = 0;
    
    @Column(name = "med", columnDefinition = "float default 0")
    private float measure = 0;
    
    @Column(name = "cost", columnDefinition = "float default 0")
    private float cost = 0;
    
    @Column(name = "costre", columnDefinition = "float default 0")
    private float recolectionCost = 0;
    
    @Column(name = "exist", columnDefinition = "float default 0")
    private float existence = 0;
            
    @Column(name = "unid", length = 30)
    private String unit = "";
    
    @Column(name = "anaq", length = 30)
    private String shelf = "";
    
    @Column(name = "lug", length = 30)
    private String place = "";
    
    @Column(name = "alma", length = 30)
    private String wharehouse = "";
    
    @Column(name = "descprov", length = 100)
    private String discountProvider = "0";
    
    @Column(name = "infor", length = 255)
    private String information = "";
                    
    @Column(name = "min", length = 11, columnDefinition = "int default 0")
    private int minimun = 1;
    
    @Column(name = "max", length = 11, columnDefinition = "int default 0")
    private int maximum = 1;
    
    @Column(name = "bajcost", length = 11, columnDefinition = "int default false")
    private boolean lowerCost = false;
    
    @Column(name = "esvta", length = 11, columnDefinition = "int default true")
    private boolean isForSale = true;
    
    @Column(name = "compue", length = 11, columnDefinition = "int default false")
    private boolean compound = false;
    
    @Column(name = "invent", length = 11, columnDefinition = "int default true")
    private boolean iventory = true;
    
    @Column(name = "estac", nullable = false, length = 30)
    private String estac;
    
    @Column(name = "estaccrea", length = 30)
    private String creationStation = "";
    
    @Column(name = "sucu", nullable = false, length = 30)
    private String sucu;
    
    @Column(name = "nocaj", nullable = false, length = 30)
    private String nocaj;
    
    @Column(name = "lote", length = 30)
    private String lot = "";
    
    @Column(name = "pedimen", length = 30, columnDefinition = "boolean default false")
    private boolean pediment = false;
               
    @Column(name = "servi", columnDefinition = "boolean default false")
    private boolean service = false;
    
    @Column(name = "lotped", columnDefinition = "boolean default false")
    private boolean lotPediment = false;
    
    @Column(name = "export", columnDefinition = "boolean default false")
    private boolean export = false;
            
    @Column(name = "fcadu")
    private Date expirationDate = new Date();
    
    @Column(name = "falt", nullable = true)
    private Date falt;
    
    @Column(name = "fmod", nullable = false)
    private Date fmod;
    
    @Column(name = "clavesat", nullable = false, length = 25)
    private String keySAT;
    
    @Column(name = "provprincipal", length = 1, columnDefinition = "int default 0")
    private int principalProvider = 0;
    
    @Column(name = "id_garan", length = 1, columnDefinition = "int default 0")
    private int warrantyID = 0;
    
    @Column(name = "id_lin", length = 1, columnDefinition = "int default 0")
    private int lineID = 0;
    
    @Column(name = "id_tip", length = 1, columnDefinition = "int default 0")
    private int typeID = 0;
    
    @Column(name = "id_marc", length = 1, columnDefinition = "int default 0")
    private int brandID = 0;
    
    @Column(name = "id_mode", length = 1, columnDefinition = "int default 0")
    private int modelID = 0;
    
    @Column(name = "id_fab", length = 1, columnDefinition = "int default 0")
    private int makerID = 0;
    
    @Column(name = "id_colo", length = 1, columnDefinition = "int default 0")
    private int colorID = 0;
    
    @Column(name = "id_pes", length = 1, columnDefinition = "int default 0")
    private int weightID = 0;
    
    @Column(name = "id_unid", length = 1, columnDefinition = "int default 0")
    private int unitID = 0;
    
    @Column(name = "id_lug", length = 1, columnDefinition = "int default 0")
    private int placeID = 0;
    
    @Column(name = "id_alma", length = 1, columnDefinition = "int default 0")
    private int warehouseID = 0;

    @Transient
    private List<String> taxes;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeProductOptional1() {
        return codeProductOptional1;
    }

    public void setCodeProductOptional1(String codeProductOptional1) {
        this.codeProductOptional1 = codeProductOptional1;
    }

    public String getCodeProductOptional2() {
        return codeProductOptional2;
    }

    public void setCodeProductOptional2(String codeProductOptional2) {
        this.codeProductOptional2 = codeProductOptional2;
    }

    public String getProviderOptional1() {
        return providerOptional1;
    }

    public void setProviderOptional1(String providerOptional1) {
        this.providerOptional1 = providerOptional1;
    }

    public String getProviderOptional2() {
        return providerOptional2;
    }

    public void setProviderOptional2(String providerOptional2) {
        this.providerOptional2 = providerOptional2;
    }

    public String getCodeMeasure() {
        return codeMeasure;
    }

    public void setCodeMeasure(String codeMeasure) {
        this.codeMeasure = codeMeasure;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getClassJerarchy() {
        return classJerarchy;
    }

    public void setClassJerarchy(String classJerarchy) {
        this.classJerarchy = classJerarchy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(String codeLine) {
        this.codeLine = codeLine;
    }

    public String getCostMethod() {
        return costMethod;
    }

    public void setCostMethod(String costMethod) {
        this.costMethod = costMethod;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public boolean getAskMaxMin() {
        return askMaxMin;
    }

    public void setAskMaxMin(boolean askMaxMin) {
        this.askMaxMin = askMaxMin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCodeUbication() {
        return codeUbication;
    }

    public void setCodeUbication(String codeUbication) {
        this.codeUbication = codeUbication;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAskSerie() {
        return askSerie;
    }

    public void setAskSerie(boolean askSerie) {
        this.askSerie = askSerie;
    }

    public String getCodeExtra() {
        return codeExtra;
    }

    public void setCodeExtra(String codeExtra) {
        this.codeExtra = codeExtra;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getComentSerial() {
        return comentSerial;
    }

    public void setComentSerial(String comentSerial) {
        this.comentSerial = comentSerial;
    }

    public String getPathIMG() {
        return pathIMG;
    }

    public void setPathIMG(String pathIMG) {
        this.pathIMG = pathIMG;
    }

    public String getCodeTax() {
        return codeTax;
    }

    public void setCodeTax(String codeTax) {
        this.codeTax = codeTax;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public float getWeightMan() {
        return weightMan;
    }

    public void setWeightMan(float weightMan) {
        this.weightMan = weightMan;
    }

    public float getPriceList1() {
        return priceList1;
    }

    public void setPriceList1(float priceList1) {
        this.priceList1 = priceList1;
    }

    public float getPriceList2() {
        return priceList2;
    }

    public void setPriceList2(float priceList2) {
        this.priceList2 = priceList2;
    }

    public float getPriceList3() {
        return priceList3;
    }

    public void setPriceList3(float priceList3) {
        this.priceList3 = priceList3;
    }

    public float getPriceList4() {
        return priceList4;
    }

    public void setPriceList4(float priceList4) {
        this.priceList4 = priceList4;
    }

    public float getPriceList5() {
        return priceList5;
    }

    public void setPriceList5(float priceList5) {
        this.priceList5 = priceList5;
    }

    public float getPriceList6() {
        return priceList6;
    }

    public void setPriceList6(float priceList6) {
        this.priceList6 = priceList6;
    }

    public float getPriceList7() {
        return priceList7;
    }

    public void setPriceList7(float priceList7) {
        this.priceList7 = priceList7;
    }

    public float getPriceList8() {
        return priceList8;
    }

    public void setPriceList8(float priceList8) {
        this.priceList8 = priceList8;
    }

    public float getPriceList9() {
        return priceList9;
    }

    public void setPriceList9(float priceList9) {
        this.priceList9 = priceList9;
    }

    public float getPriceList10() {
        return priceList10;
    }

    public void setPriceList10(float priceList10) {
        this.priceList10 = priceList10;
    }

    public float getUtilSales1() {
        return utilSales1;
    }

    public void setUtilSales1(float utilSales1) {
        this.utilSales1 = utilSales1;
    }

    public float getUtilSales2() {
        return utilSales2;
    }

    public void setUtilSales2(float utilSales2) {
        this.utilSales2 = utilSales2;
    }

    public float getUtilSales3() {
        return utilSales3;
    }

    public void setUtilSales3(float utilSales3) {
        this.utilSales3 = utilSales3;
    }

    public float getUtilSales4() {
        return utilSales4;
    }

    public void setUtilSales4(float utilSales4) {
        this.utilSales4 = utilSales4;
    }

    public float getUtilSales5() {
        return utilSales5;
    }

    public void setUtilSales5(float utilSales5) {
        this.utilSales5 = utilSales5;
    }

    public float getUtilSales6() {
        return utilSales6;
    }

    public void setUtilSales6(float utilSales6) {
        this.utilSales6 = utilSales6;
    }

    public float getUtilSales7() {
        return utilSales7;
    }

    public void setUtilSales7(float utilSales7) {
        this.utilSales7 = utilSales7;
    }

    public float getUtilSales8() {
        return utilSales8;
    }

    public void setUtilSales8(float utilSales8) {
        this.utilSales8 = utilSales8;
    }

    public float getUtilSales9() {
        return utilSales9;
    }

    public void setUtilSales9(float utilSales9) {
        this.utilSales9 = utilSales9;
    }

    public float getUtilSales10() {
        return utilSales10;
    }

    public void setUtilSales10(float utilSales10) {
        this.utilSales10 = utilSales10;
    }

    public float getMeasure() {
        return measure;
    }

    public void setMeasure(float measure) {
        this.measure = measure;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getRecolectionCost() {
        return recolectionCost;
    }

    public void setRecolectionCost(float recolectionCost) {
        this.recolectionCost = recolectionCost;
    }

    public float getExistence() {
        return existence;
    }

    public void setExistence(float existence) {
        this.existence = existence;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWharehouse() {
        return wharehouse;
    }

    public void setWharehouse(String wharehouse) {
        this.wharehouse = wharehouse;
    }

    public String getDiscountProvider() {
        return discountProvider;
    }

    public void setDiscountProvider(String discountProvider) {
        this.discountProvider = discountProvider;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getMinimun() {
        return minimun;
    }

    public void setMinimun(int minimun) {
        this.minimun = minimun;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public boolean getLowerCost() {
        return lowerCost;
    }

    public void setLowerCost(boolean lowerCost) {
        this.lowerCost = lowerCost;
    }

    public boolean getIsForSale() {
        return isForSale;
    }

    public void setIsForSale(boolean isForSale) {
        this.isForSale = isForSale;
    }

    public boolean getCompound() {
        return compound;
    }

    public void setCompound(boolean compound) {
        this.compound = compound;
    }

    public boolean getIventory() {
        return iventory;
    }

    public void setIventory(boolean iventory) {
        this.iventory = iventory;
    }

    public String getEstac() {
        return estac;
    }

    public void setEstac(String estac) {
        this.estac = estac;
    }

    public String getCreationStation() {
        return creationStation;
    }

    public void setCreationStation(String creationStation) {
        this.creationStation = creationStation;
    }

    public String getSucu() {
        return sucu;
    }

    public void setSucu(String sucu) {
        this.sucu = sucu;
    }

    public String getNocaj() {
        return nocaj;
    }

    public void setNocaj(String nocaj) {
        this.nocaj = nocaj;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public boolean getPediment() {
        return pediment;
    }

    public void setPediment(boolean pediment) {
        this.pediment = pediment;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    public boolean isLotPediment() {
        return lotPediment;
    }

    public void setLotPediment(boolean lotPediment) {
        this.lotPediment = lotPediment;
    }

    public boolean isExport() {
        return export;
    }

    public void setExport(boolean export) {
        this.export = export;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getFalt() {
        return falt;
    }

    public void setFalt(Date falt) {
        this.falt = falt;
    }

    public Date getFmod() {
        return fmod;
    }

    public void setFmod(Date fmod) {
        this.fmod = fmod;
    }

    public String getKeySAT() {
        return keySAT;
    }

    public void setKeySAT(String keySAT) {
        this.keySAT = keySAT;
    }

    public int getPrincipalProvider() {
        return principalProvider;
    }

    public void setPrincipalProvider(int principalProvider) {
        this.principalProvider = principalProvider;
    }

    public int getWarrantyID() {
        return warrantyID;
    }

    public void setWarrantyID(int warrantyID) {
        this.warrantyID = warrantyID;
    }

    public int getLineID() {
        return lineID;
    }

    public void setLineID(int lineID) {
        this.lineID = lineID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public int getMakerID() {
        return makerID;
    }

    public void setMakerID(int makerID) {
        this.makerID = makerID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public int getWeightID() {
        return weightID;
    }

    public void setWeightID(int weightID) {
        this.weightID = weightID;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUtility1() {
        return utility1;
    }

    public void setUtility1(float utility1) {
        this.utility1 = utility1;
    }

    public float getUtility2() {
        return utility2;
    }

    public void setUtility2(float utility2) {
        this.utility2 = utility2;
    }

    public float getUtility3() {
        return utility3;
    }

    public void setUtility3(float utility3) {
        this.utility3 = utility3;
    }

    public float getUtility4() {
        return utility4;
    }

    public void setUtility4(float utility4) {
        this.utility4 = utility4;
    }

    public float getUtility5() {
        return utility5;
    }

    public void setUtility5(float utility5) {
        this.utility5 = utility5;
    }

    public float getUtility6() {
        return utility6;
    }

    public void setUtility6(float utility6) {
        this.utility6 = utility6;
    }

    public float getUtility7() {
        return utility7;
    }

    public void setUtility7(float utility7) {
        this.utility7 = utility7;
    }

    public float getUtility8() {
        return utility8;
    }

    public void setUtility8(float utility8) {
        this.utility8 = utility8;
    }

    public float getUtility9() {
        return utility9;
    }

    public void setUtility9(float utility9) {
        this.utility9 = utility9;
    }

    public float getUtility10() {
        return utility10;
    }

    public void setUtility10(float utility10) {
        this.utility10 = utility10;
    }

    public List<String> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<String> taxes) {
        this.taxes = taxes;
    }
}
