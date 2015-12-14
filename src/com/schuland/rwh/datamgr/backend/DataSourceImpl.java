package com.schuland.rwh.datamgr.backend;

import com.schuland.rwh.datamgr.backend.api.DataSource;
import com.schuland.rwh.datamgr.backend.service.RwhDataService;


/**
 * The actual implementation of the DataSource interface.
 * Uses the RwhDataService to handle logic.
 * 
 * @author schuland
 *
 */
public class DataSourceImpl implements DataSource {

	/** Provides the logic handling **/
	private RwhDataService rwhDataService;

	/**
	 * Gets the RwhDataService instance used in this instance.
	 * 
	 * @return the uses RwhDataService instance
	 */
	public RwhDataService getRwhDataService() {
		return rwhDataService;
	}

	/**
	 * Sets the given RwhDataService instance as the new instance to use.
	 * 
	 * @param rwhDataService the new instance to use
	 */
	public void setRwhDataService(RwhDataService rwhDataService) {
		this.rwhDataService = rwhDataService;
	}
}
