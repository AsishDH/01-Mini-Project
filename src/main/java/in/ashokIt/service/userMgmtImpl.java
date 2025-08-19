package in.ashokIt.service;

import java.util.Map;

import in.ashokIt.binding.SignIn;
import in.ashokIt.binding.SignUp;
import in.ashokIt.binding.UnlockAccForm;

public class userMgmtImpl implements userMgmtservice {

	@Override
	public Map<Integer, String> getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerUser(SignUp form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean unlockAccount(UnlockAccForm form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String login(SignIn form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmailUnique(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
