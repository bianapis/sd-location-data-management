/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LocationDataManagementApiService {

	LocationDataRecordResponse record(String crReferenceId, LocationDataRecordRequest request);
	
	LocationDataDirectoryBase registerAt();
	
	LocationBaseWithIdAndRoot registerAtLocations(String crReferenceId, LocationBase request);
	
	OccupancyBaseWithIdAndRoot registerAtOccupancies(String crReferenceId, OccupancyBase request);
	
	UsesBaseWithIdAndRoot registerAtUses(String crReferenceId, UsesBase request);
	
	DirectoryEntryRefreshResponse requestPut(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	OccupancyBaseWithIdAndRoot retrieveDirectories(String crReferenceId, String bqReferenceId);
	
	LocationBaseWithIdAndRoot retrieveLocations(String crReferenceId, String bqReferenceId);
	
	OccupancyBaseWithIdAndRoot retrieveOccupancies(String crReferenceId, String bqReferenceId);
	
	UsesBaseWithIdAndRoot retrieveUses(String crReferenceId, String bqReferenceId);
	
	LocationBaseWithIdAndRoot updateLocations(String crReferenceId, String bqReferenceId, LocationBase request);
	
	OccupancyBaseWithIdAndRoot updateOccupancies(String crReferenceId, String bqReferenceId, OccupancyBase request);
	
	UsesBaseWithIdAndRoot updateUses(String crReferenceId, String bqReferenceId, UsesBase request);
	
}
