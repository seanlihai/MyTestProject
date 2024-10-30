
package ca.homedepot.customerreview.bnsdao;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "KYCService", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface


















KYCService {


    /**
     * 
     * @param request
     * @return
     *     returns com.bns.rest.ws.client.GetClientInfoRs
     */
    @WebMethod(operationName = "GetClientInfo", action = "GetClientInfo")
    @WebResult(name = "GetClientInfoRs", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "response")
    public GetClientInfoRs getClientInfo(
        @WebParam(name = "GetClientInfoRq", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "request")
        GetClientInfoRq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.bns.rest.ws.client.GetAccountListRs
     */
    @WebMethod(operationName = "GetAccountList", action = "GetAccountList")
    @WebResult(name = "GetAccountListRs", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "response")
    public GetAccountListRs getAccountList(
        @WebParam(name = "GetAccountListRq", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "request")
        GetAccountListRq request);

    /**
     * 
     * @param request
     * @return
     *     returns com.bns.rest.ws.client.GetAccountKycStatusRs
     */
    @WebMethod(operationName = "GetAccountKycStatus", action = "GetAccountKycStatus")
    @WebResult(name = "GetAccountKycStatusRs", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "response")
    public GetAccountKycStatusRs getAccountKycStatus(
        @WebParam(name = "GetAccountKycStatusRq", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", partName = "request")
        GetAccountKycStatusRq request);

}