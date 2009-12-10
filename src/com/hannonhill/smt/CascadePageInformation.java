/*
 * Created on Dec 9, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt;

/**
 * Object containing necessary information about page for logging - skipping rest of fields from {@link com.hannonhill.www.ws.ns.AssetOperationService.Page}
 * to save the memory.
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class CascadePageInformation
{
    private final String id;
    private final String path;

    /**
     * Constructor
     * 
     * @param id
     * @param path
     */
    public CascadePageInformation(String id, String path)
    {
        this.id = id;
        this.path = path;
    }

    /**
     * @return Returns the id.
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return Returns the path.
     */
    public String getPath()
    {
        return path;
    }
}
