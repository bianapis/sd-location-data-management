package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OccupancyBaseWithIdAndRoot
 */
public class OccupancyBaseWithIdAndRoot   {
  private String locationDataDirectoryEntryReference = null;

  private String occupancyDirectoryEntryReference = null;

  private String locationReference = null;

  private String customerReference = null;

  private String locationOwnerTitle = null;

  private String locationValue = null;

  private String locationOccupierType = null;

  private String locationOccupierReference = null;

  private String locationOccupierTerms = null;

  private String alliancePartnerReference = null;


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
   * @return occupancyDirectoryEntryReference
  **/

  public String getOccupancyDirectoryEntryReference() {
    return occupancyDirectoryEntryReference;
  }

  public void setOccupancyDirectoryEntryReference(String occupancyDirectoryEntryReference) {
    this.occupancyDirectoryEntryReference = occupancyDirectoryEntryReference;
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
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.CurrentOwner bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.CurrentOccupier bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding.CurrentOccupier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.CurrentOwner 
   * @return locationOwnerTitle
  **/

  public String getLocationOwnerTitle() {
    return locationOwnerTitle;
  }

  public void setLocationOwnerTitle(String locationOwnerTitle) {
    this.locationOwnerTitle = locationOwnerTitle;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as AssetHolding).MarketValue bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding(as AssetHolding).BookValue 
   * @return locationValue
  **/

  public String getLocationValue() {
    return locationValue;
  }

  public void setLocationValue(String locationValue) {
    this.locationValue = locationValue;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.RealPropertyHolding.CurrentOccupier 
   * @return locationOccupierType
  **/

  public String getLocationOccupierType() {
    return locationOccupierType;
  }

  public void setLocationOccupierType(String locationOccupierType) {
    this.locationOccupierType = locationOccupierType;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_FEHzN8TGEeChad0JzLk7QA_1608854558)       bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.CurrentOccupier.OwnerOccupierRelationship(as PartyRelationship).RelationshipAgreement.TermsAndConditions 
   * @return locationOccupierReference
  **/

  public String getLocationOccupierReference() {
    return locationOccupierReference;
  }

  public void setLocationOccupierReference(String locationOccupierReference) {
    this.locationOccupierReference = locationOccupierReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: LocationRegistryEntry.Location.RealPropertyAsset.CurrentOccupier.OwnerOccupierRelationship(as PartyRelationship).RelationshipAgreement.TermsAndConditions 
   * @return locationOccupierTerms
  **/

  public String getLocationOccupierTerms() {
    return locationOccupierTerms;
  }

  public void setLocationOccupierTerms(String locationOccupierTerms) {
    this.locationOccupierTerms = locationOccupierTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return alliancePartnerReference
  **/

  public String getAlliancePartnerReference() {
    return alliancePartnerReference;
  }

  public void setAlliancePartnerReference(String alliancePartnerReference) {
    this.alliancePartnerReference = alliancePartnerReference;
  }


}

