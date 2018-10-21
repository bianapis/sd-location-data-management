package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LocationBaseWithIdAndRoot
 */
public class LocationBaseWithIdAndRoot   {
  private String locationDataDirectoryEntryReference = null;

  private String locationDirectoryEntryReference = null;

  private String locationReference = null;

  private String locationType = null;

  private String locationAddress = null;

  private String locationCoordinates = null;

  private String landmarkDescription = null;

  private String locationConstructionType = null;

  private String locationCapacity = null;

  private String locationStatus = null;

  private String locationNeighborhoodType = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return locationDataDirectoryEntryReference
  **/

  public String getLocationDataDirectoryEntryReference() {
    return locationDataDirectoryEntryReference;
  }

  public void setLocationDataDirectoryEntryReference(String locationDataDirectoryEntryReference) {
    this.locationDataDirectoryEntryReference = locationDataDirectoryEntryReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.LocationRegistry 
   * @return locationDirectoryEntryReference
  **/

  public String getLocationDirectoryEntryReference() {
    return locationDirectoryEntryReference;
  }

  public void setLocationDirectoryEntryReference(String locationDirectoryEntryReference) {
    this.locationDirectoryEntryReference = locationDirectoryEntryReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location 
   * @return locationReference
  **/

  public String getLocationReference() {
    return locationReference;
  }

  public void setLocationReference(String locationReference) {
    this.locationReference = locationReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as BuiltStructure) bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as Land) bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as AirRight) bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as NaturalResource) 
   * @return locationType
  **/

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_w8TGEeChad0JzLk7QA_1650940768/elements/_FNg_xcTGEeChad0JzLk7QA_1331688362)    bian-reference: LocationRegistryEntry.Location.Address 
   * @return locationAddress
  **/

  public String getLocationAddress() {
    return locationAddress;
  }

  public void setLocationAddress(String locationAddress) {
    this.locationAddress = locationAddress;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.Coordinates 
   * @return locationCoordinates
  **/

  public String getLocationCoordinates() {
    return locationCoordinates;
  }

  public void setLocationCoordinates(String locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.Description 
   * @return landmarkDescription
  **/

  public String getLandmarkDescription() {
    return landmarkDescription;
  }

  public void setLandmarkDescription(String landmarkDescription) {
    this.landmarkDescription = landmarkDescription;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as Building).ConstructionType 
   * @return locationConstructionType
  **/

  public String getLocationConstructionType() {
    return locationConstructionType;
  }

  public void setLocationConstructionType(String locationConstructionType) {
    this.locationConstructionType = locationConstructionType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding.HoldingCapacity 
   * @return locationCapacity
  **/

  public String getLocationCapacity() {
    return locationCapacity;
  }

  public void setLocationCapacity(String locationCapacity) {
    this.locationCapacity = locationCapacity;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.Status  
   * @return locationStatus
  **/

  public String getLocationStatus() {
    return locationStatus;
  }

  public void setLocationStatus(String locationStatus) {
    this.locationStatus = locationStatus;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.NeighborhoodType 
   * @return locationNeighborhoodType
  **/

  public String getLocationNeighborhoodType() {
    return locationNeighborhoodType;
  }

  public void setLocationNeighborhoodType(String locationNeighborhoodType) {
    this.locationNeighborhoodType = locationNeighborhoodType;
  }


}

