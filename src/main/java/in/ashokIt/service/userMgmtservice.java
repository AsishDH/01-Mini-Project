package in.ashokIt.service;

import java.util.Map;

import in.ashokIt.binding.SignIn;
import in.ashokIt.binding.SignUp;
import in.ashokIt.binding.UnlockAccForm;

public interface userMgmtservice {
	
	

    Map<Integer, String> getCountries();

    Map<Integer, String> getStates(Integer countryId);

    Map<Integer, String> getCities(Integer stateId);

    String registerUser(SignUp form);

    boolean unlockAccount(UnlockAccForm form);

    String login(SignIn form);

    String forgotPwd(String email);

    boolean isEmailUnique(String email);

}
