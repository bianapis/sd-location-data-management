package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * UsesBase
 */
public class UsesBase   {
  private String locationReference = null;

  private String locationZoningType = null;

  private String locationUsage = null;


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

