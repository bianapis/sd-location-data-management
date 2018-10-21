package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LocationDataDirectoryWithID
 */
public class LocationDataDirectoryWithID   {
  private String locationDataDirectoryReference = null;

  private String locationDataDirectoryVersion = null;

  private String locationDataDirectoryConfiguration = null;

  private String locationDataDirectoryReportReference = null;

  private String locationDataDirectoryReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return locationDataDirectoryReference
  **/

  public String getLocationDataDirectoryReference() {
    return locationDataDirectoryReference;
  }

  public void setLocationDataDirectoryReference(String locationDataDirectoryReference) {
    this.locationDataDirectoryReference = locationDataDirectoryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return locationDataDirectoryVersion
  **/

  public String getLocationDataDirectoryVersion() {
    return locationDataDirectoryVersion;
  }

  public void setLocationDataDirectoryVersion(String locationDataDirectoryVersion) {
    this.locationDataDirectoryVersion = locationDataDirectoryVersion;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return locationDataDirectoryConfiguration
  **/

  public String getLocationDataDirectoryConfiguration() {
    return locationDataDirectoryConfiguration;
  }

  public void setLocationDataDirectoryConfiguration(String locationDataDirectoryConfiguration) {
    this.locationDataDirectoryConfiguration = locationDataDirectoryConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return locationDataDirectoryReportReference
  **/

  public String getLocationDataDirectoryReportReference() {
    return locationDataDirectoryReportReference;
  }

  public void setLocationDataDirectoryReportReference(String locationDataDirectoryReportReference) {
    this.locationDataDirectoryReportReference = locationDataDirectoryReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return locationDataDirectoryReport
  **/

  public String getLocationDataDirectoryReport() {
    return locationDataDirectoryReport;
  }

  public void setLocationDataDirectoryReport(String locationDataDirectoryReport) {
    this.locationDataDirectoryReport = locationDataDirectoryReport;
  }


}

