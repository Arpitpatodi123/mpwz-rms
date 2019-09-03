package com.mpwz.rmsnew.controller;

import com.mpwz.rmsnew.interfaces.CustomInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.mpwz.rmsnew.service.sybase.SybaseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value = "sybase")
public class SybaseController
{
    @Autowired
    SybaseService sybaseService;
    @RequestMapping(value = "sybase/locationCode/{locCd}/cons-no/{consNo}",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllUsers(@PathVariable String locCd, @PathVariable String consNo)
    {
        System.out.println("Inside sybase contorller");
        ResponseEntity<?> response = null;
        CustomInterface customInterface = null;
        if (locCd != null && consNo != null)
        {
            customInterface =  sybaseService.getAllUsers(locCd, consNo);
            //System.out.println("outside sybase if contorller" +customInterface.gettConsSybase());
            if (customInterface != null)
            {
                response = new ResponseEntity<>( customInterface, HttpStatus.OK );
            }
            else
            {
                response = new ResponseEntity<>( "No Content", HttpStatus.NO_CONTENT );
            }
        }
        return response;
    }
}
