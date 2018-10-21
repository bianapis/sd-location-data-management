/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LocationDataManagementApiServiceImpl implements LocationDataManagementApiService {

	public LocationDataRecordResponse record(String crReferenceId, LocationDataRecordRequest request){
		return JsonReader.read("record-LocationDataRecordResponse.json",new TypeReference<LocationDataRecordResponse>(){});
	}
	
	public LocationDataDirectoryBase registerAt(){
		return JsonReader.read("registerAt-LocationDataDirectoryBase.json",new TypeReference<LocationDataDirectoryBase>(){});
	}
	
	public LocationBaseWithIdAndRoot registerAtLocations(String crReferenceId, LocationBase request){
		return JsonReader.read("registerAt-LocationBaseWithIdAndRoot.json",new TypeReference<LocationBaseWithIdAndRoot>(){});
	}
	
	public OccupancyBaseWithIdAndRoot registerAtOccupancies(String crReferenceId, OccupancyBase request){
		return JsonReader.read("registerAt-OccupancyBaseWithIdAndRoot.json",new TypeReference<OccupancyBaseWithIdAndRoot>(){});
	}
	
	public UsesBaseWithIdAndRoot registerAtUses(String crReferenceId, UsesBase request){
		return JsonReader.read("registerAt-UsesBaseWithIdAndRoot.json",new TypeReference<UsesBaseWithIdAndRoot>(){});
	}
	
	public DirectoryEntryRefreshResponse requestPut(String crReferenceId){
		return JsonReader.read("requestPut-DirectoryEntryRefreshResponse.json",new TypeReference<DirectoryEntryRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public OccupancyBaseWithIdAndRoot retrieveDirectories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OccupancyBaseWithIdAndRoot.json",new TypeReference<OccupancyBaseWithIdAndRoot>(){});
	}
	
	public LocationBaseWithIdAndRoot retrieveLocations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-LocationBaseWithIdAndRoot.json",new TypeReference<LocationBaseWithIdAndRoot>(){});
	}
	
	public OccupancyBaseWithIdAndRoot retrieveOccupancies(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OccupancyBaseWithIdAndRoot.json",new TypeReference<OccupancyBaseWithIdAndRoot>(){});
	}
	
	public UsesBaseWithIdAndRoot retrieveUses(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-UsesBaseWithIdAndRoot.json",new TypeReference<UsesBaseWithIdAndRoot>(){});
	}
	
	public LocationBaseWithIdAndRoot updateLocations(String crReferenceId, String bqReferenceId, LocationBase request){
		return JsonReader.read("update-LocationBaseWithIdAndRoot.json",new TypeReference<LocationBaseWithIdAndRoot>(){});
	}
	
	public OccupancyBaseWithIdAndRoot updateOccupancies(String crReferenceId, String bqReferenceId, OccupancyBase request){
		return JsonReader.read("update-OccupancyBaseWithIdAndRoot.json",new TypeReference<OccupancyBaseWithIdAndRoot>(){});
	}
	
	public UsesBaseWithIdAndRoot updateUses(String crReferenceId, String bqReferenceId, UsesBase request){
		return JsonReader.read("update-UsesBaseWithIdAndRoot.json",new TypeReference<UsesBaseWithIdAndRoot>(){});
	}
	
}
