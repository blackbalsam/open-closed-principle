package com.example.openclosedprinciple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenClosedPrincipleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenClosedPrincipleApplication.class, args);

		InsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		InsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

		ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();

		claimApprovalManager.processClaim(healthInsuranceSurveyor);
		claimApprovalManager.processClaim(vehicleInsuranceSurveyor);
	}

}
