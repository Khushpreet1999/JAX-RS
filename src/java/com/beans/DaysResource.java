/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author khushpreetkaurgulati
 */
@Path("days")
public class DaysResource {

    @Context
    private UriInfo context;
    
    @EJB
    Week5 week5;

    /**
     * Creates a new instance of DaysResource
     */
    public DaysResource() {
    }

    /**
     * Retrieves representation of an instance of com.beans.DaysResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        //TODO return proper representation object
       return "<h1> Today is : " + week5.getCurrentDay() + "</h1>";
    }
    
   @POST
   @Produces(MediaType.TEXT_HTML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String searhByDay(@FormParam("day") String d)
    {
        return "<h1> Today is : " + week5.isItSunday(d)+ "</h1>";
    }
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("get")
    public String getDay(@QueryParam("gDay") @DefaultValue("Monday") String day)
    {
         return "<h1> Today is using query param Method : " + week5.isItSunday(day)+ "</h1>"; 
    }
  
    
}
