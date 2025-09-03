package in.ashokIt.service;

import java.util.Map;

import in.ashokIt.binding.SignIn;
import in.ashokIt.binding.SignUp;
import in.ashokIt.binding.UnlockAccForm;

public interface userMgmtservice {

	public String login(SignIn form);

	public String isEmailUnique(String email);

	public Map<Integer, String> getCountries();

	public Map<Integer, String> getStates(Integer countryId);

	public Map<Integer, String> getCities(Integer stateId);

	public String registerUser(SignUp form);

	public boolean unlockAccount(UnlockAccForm form);

	public String forgotPwd(String email);

}
