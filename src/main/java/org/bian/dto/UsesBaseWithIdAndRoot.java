package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * UsesBaseWithIdAndRoot
 */
public class UsesBaseWithIdAndRoot   {
  private String locationDataDirectoryEntryReference = null;

  private String useDirectoryEntryReference = null;

  private String locationReference = null;

  private String locationZoningType = null;

  private String locationUsage = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return useDirectoryEntryReference
  **/

  public String getUseDirectoryEntryReference() {
    return useDirectoryEntryReference;
  }

  public void setUseDirectoryEntryReference(String useDirectoryEntryReference) {
    this.useDirectoryEntryReference = useDirectoryEntryReference;
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
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.ZoningType 
   * @return locationZoningType
  **/

  public String getLocationZoningType() {
    return locationZoningType;
  }

  public void setLocationZoningType(String locationZoningType) {
    this.locationZoningType = locationZoningType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding.CurrentUsage 
   * @return locationUsage
  **/

  public String getLocationUsage() {
    return locationUsage;
  }

  public void setLocationUsage(String locationUsage) {
    this.locationUsage = locationUsage;
  }


}

