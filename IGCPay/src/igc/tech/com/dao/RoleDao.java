package igc.tech.com.dao;

import java.util.List;


public interface RoleDao {

	public List procRole(String roleId, String roleDesc,String createdBy,String updatedBy, String flag);
	
}
