package in.ashokIt.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokIt.binding.SignIn;
import in.ashokIt.binding.SignUp;
import in.ashokIt.binding.UnlockAccForm;
import in.ashokIt.entity.CityMasterEntity;
import in.ashokIt.entity.CountryMasterEntity;
import in.ashokIt.entity.UserDtlsEntity;
import in.ashokIt.repository.CountryMasterRepo;
import in.ashokIt.repository.StateMasterRepo;
import in.ashokIt.repository.UserDtlsRepo;

@Service
public class userMgmtImpl implements userMgmtservice {

	@Autowired
	private UserDtlsRepo userRepo;

	@Autowired
	private CountryMasterRepo countryRepo;

	@Autowired
	private StateMasterRepo stateRepo;

	@Autowired
	private CityMasterEntity cityEntity;

	@Override
	public String login(SignIn form) {

		UserDtlsEntity entity = userRepo.findByEmailAndPassword(form.getEmail(), form.getPwd());

		if (entity == null) {
			return "Credentials are valid ";
		}

		if (entity != null && entity.getAccStatus().equals("LOCKED")) {
			return "Your Account is locked";
		}

		return "success";
	}

	@Override
	public String isEmailUnique(String email) {

		UserDtlsEntity mail = userRepo.findByEmail(email);
		if (mail == null) {
			return "Unique";
		}
		return "Duplicate";
	}

	@Override
	public Map<Integer, String> getCountries() {
		List<CountryMasterEntity> countries = countryRepo.findAll();
		HashMap<Integer, String> countri = new HashMap<>();

		for (CountryMasterEntity entity : countries) {
			countri.put(entity.getCountryId(), entity.getCountryName());
		}

		return countri;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
                
		      
		             
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
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
