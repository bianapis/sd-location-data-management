/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Register;

@BianRestController
public class LocationDataManagementApiController {

	@Autowired
	LocationDataManagementApiService service;
	
	@Register.Record
	public BianResponse<LocationDataRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<LocationDataRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RegisterAt
	public BianResponse<LocationDataDirectoryBase> registerAt() {
		return BianResponse.forSuccess(service.registerAt());
	}
	
	@BQ("locations")
	@Register.RegisterAt
	public BianResponse<LocationBaseWithIdAndRoot> registerAtLocations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<LocationBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtLocations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("occupancies")
	@Register.RegisterAt
	public BianResponse<OccupancyBaseWithIdAndRoot> registerAtOccupancies(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OccupancyBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtOccupancies(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("uses")
	@Register.RegisterAt
	public BianResponse<UsesBaseWithIdAndRoot> registerAtUses(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<UsesBase> bianRequest) {
		return BianResponse.forSuccess(service.registerAtUses(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RequestPut
	public BianResponse<DirectoryEntryRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId));
	}
	
	@Register.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Register.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Register.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("directories")
	@Register.Retrieve
	public BianResponse<OccupancyBaseWithIdAndRoot> retrieveDirectories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDirectories(crReferenceId, bqReferenceId));
	}
	
	@BQ("locations")
	@Register.Retrieve
	public BianResponse<LocationBaseWithIdAndRoot> retrieveLocations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLocations(crReferenceId, bqReferenceId));
	}
	
	@BQ("occupancies")
	@Register.Retrieve
	public BianResponse<OccupancyBaseWithIdAndRoot> retrieveOccupancies(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOccupancies(crReferenceId, bqReferenceId));
	}
	
	@BQ("uses")
	@Register.Retrieve
	public BianResponse<UsesBaseWithIdAndRoot> retrieveUses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUses(crReferenceId, bqReferenceId));
	}
	
	@BQ("locations")
	@Register.Update
	public BianResponse<LocationBaseWithIdAndRoot> updateLocations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<LocationBase> bianRequest) {
		return BianResponse.forSuccess(service.updateLocations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("occupancies")
	@Register.Update
	public BianResponse<OccupancyBaseWithIdAndRoot> updateOccupancies(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<OccupancyBase> bianRequest) {
		return BianResponse.forSuccess(service.updateOccupancies(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("uses")
	@Register.Update
	public BianResponse<UsesBaseWithIdAndRoot> updateUses(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<UsesBase> bianRequest) {
		return BianResponse.forSuccess(service.updateUses(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
