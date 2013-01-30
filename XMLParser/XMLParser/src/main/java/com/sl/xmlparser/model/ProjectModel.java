package com.sl.xmlparser.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;

public class ProjectModel {

    protected String projectName;
    protected String fullDescription;
    protected String shortDescription;
    protected String category;
    protected String categoryForSearcher;
    protected BigDecimal priceWithVat;
    protected Integer Amount;
    protected URI[] imgMain;
    protected URI[] imgProjection;
    protected URI[] imgElevation;
    protected URI[] imgLocation;
    protected Integer active;
    protected BigDecimal usableSpace;
    protected String usableSpace2;
    protected String floors;
    protected String floors2;
    protected String garage;
    protected String garage2;
    protected String technology;
    protected String technology2;
    protected String roofType;
    protected String roofType2;
    protected String minimumPlot;
    protected String minimumPlot2;
    protected String buildInArea;
    protected String volume;
    protected String buildingHeight;
    protected String slopeOfTheRoof;
    protected String basement;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryForSearcher() {
        return categoryForSearcher;
    }

    public void setCategoryForSearcher(String categoryForSearcher) {
        this.categoryForSearcher = categoryForSearcher;
    }

    public BigDecimal getPriceWithVat() {
        return priceWithVat;
    }
    
    public void setPriceWithVat(String priceWithVat) {
        if(priceWithVat != null && !priceWithVat.isEmpty()) {
            this.priceWithVat = new BigDecimal(priceWithVat);
        }
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public URI[] getImgMain() {
        return imgMain;
    }

    public void setImgMain(URI[] imgMain) {
        this.imgMain = imgMain;
    }

    public URI[] getImgProjection() {
        return imgProjection;
    }

    public void setImgProjection(URI[] imgProjection) {
        this.imgProjection = imgProjection;
    }

    public URI[] getImgElevation() {
        return imgElevation;
    }

    public void setImgElevation(URI[] imgElevation) {
        this.imgElevation = imgElevation;
    }

    public URI[] getImgLocation() {
        return imgLocation;
    }

    public void setImgLocation(URI[] imgLocation) {
        this.imgLocation = imgLocation;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public BigDecimal getUsableSpace() {
        return usableSpace;
    }

    public void setUsableSpace(String usableSpace) {
         if(usableSpace != null && !usableSpace.isEmpty()) {
            this.usableSpace = new BigDecimal(usableSpace);
        }
    }

    public String getUsableSpace2() {
        return usableSpace2;
    }

    public void setUsableSpace2(String usableSpace2) {
        this.usableSpace2 = usableSpace2;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getFloors2() {
        return floors2;
    }

    public void setFloors2(String floors2) {
        this.floors2 = floors2;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getGarage2() {
        return garage2;
    }

    public void setGarage2(String garage2) {
        this.garage2 = garage2;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
    
    public String getTechnology2() {
        return technology2;
    }

    public void setTechnology2(String technology2) {
        this.technology2 = technology;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getRoofType2() {
        return roofType2;
    }

    public void setRoofType2(String roofType2) {
        this.roofType2 = roofType2;
    }

    public String getMinimumPlot() {
        return minimumPlot;
    }

    public void setMinimumPlot(String minimumPlot) {
        this.minimumPlot = minimumPlot;
    }

    public String getMinimumPlot2() {
        return minimumPlot2;
    }

    public void setMinimumPlot2(String minimumPlot2) {
        this.minimumPlot2 = minimumPlot2;
    }

    public String getBuildInArea() {
        return buildInArea;
    }

    public void setBuildInArea(String buildInArea) {
        this.buildInArea = buildInArea;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getBuildingHeight() {
        return buildingHeight;
    }

    public void setBuildingHeight(String buildingHeight) {
        this.buildingHeight = buildingHeight;
    }

    public String getSlopeOfTheRoof() {
        return slopeOfTheRoof;
    }

    public void setSlopeOfTheRoof(String slopeOfTheRoof) {
        this.slopeOfTheRoof = slopeOfTheRoof;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public String toString() {
        return "ProjectModel{" + "projectName=" + projectName + "\n\t fullDescription=" + fullDescription + "\n\t shortDescription=" + shortDescription + "\n\t category=" + category + "\n\t categoryForSearcher=" + categoryForSearcher + "\n\t priceWithVat=" + priceWithVat + "\n\t Amount=" + Amount + "\n\t imgMain=" + Arrays.toString(imgMain) + "\n\t imgProjection=" + Arrays.toString(imgProjection) + "\n\t imgElevation=" + Arrays.toString(imgElevation) + "\n\t imgLocation=" + Arrays.toString(imgLocation) + "\n\t active=" + active + "\n\t usableSpace=" + usableSpace + "\n\t usableSpace2=" + usableSpace2 + "\n\t floors=" + floors + "\n\t floors2=" + floors2 + "\n\t garage=" + garage + "\n\t garage2=" + garage2 + "\n\t technology=" + technology + "\n\t technology2=" + technology2 + "\n\t roofType=" + roofType + "\n\t roofType2=" + roofType2 + "\n\t minimumPlot=" + minimumPlot + "\n\t minimumPlot2=" + minimumPlot2 + "\n\t buildInArea=" + buildInArea + "\n\t volume=" + volume + "\n\t buildingHeight=" + buildingHeight + "\n\t slopeOfTheRoof=" + slopeOfTheRoof + "\n\t basement=" + basement + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.projectName != null ? this.projectName.hashCode() : 0);
        hash = 59 * hash + (this.fullDescription != null ? this.fullDescription.hashCode() : 0);
        hash = 59 * hash + (this.shortDescription != null ? this.shortDescription.hashCode() : 0);
        hash = 59 * hash + (this.category != null ? this.category.hashCode() : 0);
        hash = 59 * hash + (this.categoryForSearcher != null ? this.categoryForSearcher.hashCode() : 0);
        hash = 59 * hash + (this.priceWithVat != null ? this.priceWithVat.hashCode() : 0);
        hash = 59 * hash + (this.Amount != null ? this.Amount.hashCode() : 0);
        hash = 59 * hash + Arrays.deepHashCode(this.imgMain);
        hash = 59 * hash + Arrays.deepHashCode(this.imgProjection);
        hash = 59 * hash + Arrays.deepHashCode(this.imgElevation);
        hash = 59 * hash + Arrays.deepHashCode(this.imgLocation);
        hash = 59 * hash + (this.active != null ? this.active.hashCode() : 0);
        hash = 59 * hash + (this.usableSpace != null ? this.usableSpace.hashCode() : 0);
        hash = 59 * hash + (this.usableSpace2 != null ? this.usableSpace2.hashCode() : 0);
        hash = 59 * hash + (this.floors != null ? this.floors.hashCode() : 0);
        hash = 59 * hash + (this.floors2 != null ? this.floors2.hashCode() : 0);
        hash = 59 * hash + (this.garage != null ? this.garage.hashCode() : 0);
        hash = 59 * hash + (this.garage2 != null ? this.garage2.hashCode() : 0);
        hash = 59 * hash + (this.technology != null ? this.technology.hashCode() : 0);
        hash = 59 * hash + (this.technology2 != null ? this.technology2.hashCode() : 0);
        hash = 59 * hash + (this.roofType != null ? this.roofType.hashCode() : 0);
        hash = 59 * hash + (this.roofType2 != null ? this.roofType2.hashCode() : 0);
        hash = 59 * hash + (this.minimumPlot != null ? this.minimumPlot.hashCode() : 0);
        hash = 59 * hash + (this.minimumPlot2 != null ? this.minimumPlot2.hashCode() : 0);
        hash = 59 * hash + (this.buildInArea != null ? this.buildInArea.hashCode() : 0);
        hash = 59 * hash + (this.volume != null ? this.volume.hashCode() : 0);
        hash = 59 * hash + (this.buildingHeight != null ? this.buildingHeight.hashCode() : 0);
        hash = 59 * hash + (this.slopeOfTheRoof != null ? this.slopeOfTheRoof.hashCode() : 0);
        hash = 59 * hash + (this.basement != null ? this.basement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProjectModel other = (ProjectModel) obj;
        if ((this.projectName == null) ? (other.projectName != null) : !this.projectName.equals(other.projectName)) {
            return false;
        }
        if ((this.fullDescription == null) ? (other.fullDescription != null) : !this.fullDescription.equals(other.fullDescription)) {
            return false;
        }
        if ((this.shortDescription == null) ? (other.shortDescription != null) : !this.shortDescription.equals(other.shortDescription)) {
            return false;
        }
        if ((this.category == null) ? (other.category != null) : !this.category.equals(other.category)) {
            return false;
        }
        if ((this.categoryForSearcher == null) ? (other.categoryForSearcher != null) : !this.categoryForSearcher.equals(other.categoryForSearcher)) {
            return false;
        }
        if (this.priceWithVat != other.priceWithVat && (this.priceWithVat == null || !this.priceWithVat.equals(other.priceWithVat))) {
            return false;
        }
        if (this.Amount != other.Amount && (this.Amount == null || !this.Amount.equals(other.Amount))) {
            return false;
        }
        if (!Arrays.deepEquals(this.imgMain, other.imgMain)) {
            return false;
        }
        if (!Arrays.deepEquals(this.imgProjection, other.imgProjection)) {
            return false;
        }
        if (!Arrays.deepEquals(this.imgElevation, other.imgElevation)) {
            return false;
        }
        if (!Arrays.deepEquals(this.imgLocation, other.imgLocation)) {
            return false;
        }
        if (this.active != other.active && (this.active == null || !this.active.equals(other.active))) {
            return false;
        }
        if ((this.usableSpace == null) ? (other.usableSpace != null) : !this.usableSpace.equals(other.usableSpace)) {
            return false;
        }
        if ((this.usableSpace2 == null) ? (other.usableSpace2 != null) : !this.usableSpace2.equals(other.usableSpace2)) {
            return false;
        }
        if ((this.floors == null) ? (other.floors != null) : !this.floors.equals(other.floors)) {
            return false;
        }
        if ((this.floors2 == null) ? (other.floors2 != null) : !this.floors2.equals(other.floors2)) {
            return false;
        }
        if ((this.garage == null) ? (other.garage != null) : !this.garage.equals(other.garage)) {
            return false;
        }
        if ((this.garage2 == null) ? (other.garage2 != null) : !this.garage2.equals(other.garage2)) {
            return false;
        }
        if ((this.technology == null) ? (other.technology != null) : !this.technology.equals(other.technology)) {
            return false;
        }
        if ((this.technology2 == null) ? (other.technology2 != null) : !this.technology2.equals(other.technology2)) {
            return false;
        }
        if ((this.roofType == null) ? (other.roofType != null) : !this.roofType.equals(other.roofType)) {
            return false;
        }
        if ((this.roofType2 == null) ? (other.roofType2 != null) : !this.roofType2.equals(other.roofType2)) {
            return false;
        }
        if ((this.minimumPlot == null) ? (other.minimumPlot != null) : !this.minimumPlot.equals(other.minimumPlot)) {
            return false;
        }
        if ((this.minimumPlot2 == null) ? (other.minimumPlot2 != null) : !this.minimumPlot2.equals(other.minimumPlot2)) {
            return false;
        }
        if ((this.buildInArea == null) ? (other.buildInArea != null) : !this.buildInArea.equals(other.buildInArea)) {
            return false;
        }
        if ((this.volume == null) ? (other.volume != null) : !this.volume.equals(other.volume)) {
            return false;
        }
        if ((this.buildingHeight == null) ? (other.buildingHeight != null) : !this.buildingHeight.equals(other.buildingHeight)) {
            return false;
        }
        if ((this.slopeOfTheRoof == null) ? (other.slopeOfTheRoof != null) : !this.slopeOfTheRoof.equals(other.slopeOfTheRoof)) {
            return false;
        }
        if ((this.basement == null) ? (other.basement != null) : !this.basement.equals(other.basement)) {
            return false;
        }
        return true;
    }
    
    
}