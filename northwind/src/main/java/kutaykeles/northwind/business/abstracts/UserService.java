package kutaykeles.northwind.business.abstracts;

import kutaykeles.northwind.core.entities.User;
import kutaykeles.northwind.core.utilities.results.DataResult;
import kutaykeles.northwind.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
