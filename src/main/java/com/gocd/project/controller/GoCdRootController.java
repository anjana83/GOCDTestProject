package com.gocd.project.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




/**
 * Root service controller for servicesOrders calls.
 * 
 * @version 1.0 Build Oct 28, 2015
 */

@RestController
@RequestMapping("/GOCDProject")

public class GoCdRootController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(GoCdRootController.class);

	/*
	@RequestMapping(method = RequestMethod.POST, value = "/deviceAmendment", headers = "Accept=application/json", produces = "application/json")
	public PostActivationServiceResponse deviceAmendment(@RequestBody PostActivationServiceRequest postActivationServiceRequest) throws IOException {		
		
	}
	*/
	/**
	 *
	 * @return VersionDetails
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/getVersion", headers = "Accept=application/json", produces = "application/json")
	public VersionDetails getVersion() {
		VersionDetails versionDetails = new VersionDetails();
		versionDetails.setVersion("1");
		versionDetails.setDate(new Date());

		return versionDetails;
	}


	
}
