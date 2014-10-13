/*
 * Copyright (c) 2013-2014, Arjuna Technologies Limited, Newcastle-upon-Tyne, England. All rights reserved.
 */

package com.arjuna.dbplugins.ckan.filestore.dataflownodes;

import java.io.Serializable;

public class ResourceUpdaterResponceDTO implements Serializable
{
	private static final long serialVersionUID = -5571259199998367286L;

	public ResourceUpdaterResponceDTO()
    {
    }

    public ResourceUpdaterResponceDTO(Boolean success)
    {
        _success = success;
    }

    public Boolean getSuccess()
    {
        return _success;
    }

    public void setSuccess(Boolean success)
    {
        _success = success;
    }

    private Boolean _success;
}