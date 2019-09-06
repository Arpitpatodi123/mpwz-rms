package com.mpwz.rmsnew.controller;

import org.slf4j.Logger;
import com.mpwz.rmsnew.interfaces.CustomInterface;
import com.mpwz.rmsnew.service.rms.RmonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RequestMapping(value = "rms")
public class RmonController
{
    @Autowired
    private RmonService rmonService;

    @RequestMapping(value = "rms/locationCode/{locCd}/cons-no/{consNo}",
            method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getAllUsers(@PathVariable String locCd, @PathVariable String consNo)
    {
        System.out.println( "Inside rmon contorller" );
        ResponseEntity<?> response = null;
        CustomInterface customInterface = null;
        if (locCd != null && consNo != null)
        {
            customInterface = rmonService.getAllUsers( Integer.parseInt( locCd ), Integer.parseInt( consNo ) );
            //System.out.println( "outside Rms if contorller" + customInterface );
            if (customInterface != null) {
                response = new ResponseEntity<>( customInterface, HttpStatus.OK );
            }
            else
            {
                response = new ResponseEntity<>( "No Content", HttpStatus.NO_CONTENT );
            }
        }
        return response;
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/rms/locationCode/{locCd}/cons-no/{consNo}/file-format/{fileFormat}")
//    public ResponseEntity getConsumerDetail(@PathVariable String locationCode, @PathVariable String consumerNo, @PathVariable String fileFormat) {
//        String methodName = "getConsumerDetail : ";
//        logger.info(methodName + "called");
//        if (StringUtils.isEmpty(locationCode) || StringUtils.isEmpty(consumerNo) || StringUtils.isEmpty(fileFormat)) {
//            logger.error(methodName + "Input param(s) is null");
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        if (!billService.existsByConsumerNoAndDeleted(consumerNo, MISConstants.FALSE))
//        {
//            final ErrorMessageInterface errorMessage = new ErrorMessage("Consumer not found");
//            logger.error(methodName + errorMessage.getErrorMessage());
//            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
//        }
//        MasterReport report = null;
//        ResponseEntity<?> responseEntity = null;
//        try {
//            report = billReportService.getConsumerDetailReport(consumerNo);
//            responseEntity = ReportUtility.getResponseFromReport(report, fileFormat);
//        } finally {
//            ReportUtility.cleanup(report);
//        }
//        return responseEntity;
//    }
}