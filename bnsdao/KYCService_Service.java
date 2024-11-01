
package ca.homedepot.customerreview.bnsdao;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.Service;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "KYCService", targetNamespace = "http://xsd.bns.com/msgs/kycservice/v001", wsdlLocation = "file:/C:/All%20Accounts/JOB/Learning/Project/WSDL2JAVA/maven-modules/maven-plugins/jaxws/src/main/resources/KYCService.wsdl")
public class KYCService_Service
    extends Service
{

    private static final URL KYCSERVICE_WSDL_LOCATION;
    private static final WebServiceException KYCSERVICE_EXCEPTION;
    private static final QName KYCSERVICE_QNAME = new QName("http://xsd.bns.com/msgs/kycservice/v001", "KYCService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/All%20Accounts/JOB/Learning/Project/WSDL2JAVA/maven-modules/maven-plugins/jaxws/src/main/resources/KYCService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KYCSERVICE_WSDL_LOCATION = url;
        KYCSERVICE_EXCEPTION = e;
    }

    public KYCService_Service() {
        super(__getWsdlLocation(), KYCSERVICE_QNAME);
    }

    public KYCService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), KYCSERVICE_QNAME, features);
    }

    public KYCService_Service(URL wsdlLocation) {
        super(wsdlLocation, KYCSERVICE_QNAME);
    }

    public KYCService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KYCSERVICE_QNAME, features);
    }

    public KYCService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KYCService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KYCService
     */
    @WebEndpoint(name = "KYCService")
    public KYCService getKYCService() {
        return super.getPort(new QName("http://xsd.bns.com/msgs/kycservice/v001", "KYCService"), KYCService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KYCService
     */
    @WebEndpoint(name = "KYCService")
    public KYCService getKYCService(WebServiceFeature... features) {
        return super.getPort(new QName("http://xsd.bns.com/msgs/kycservice/v001", "KYCService"), KYCService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KYCSERVICE_EXCEPTION!= null) {
            throw KYCSERVICE_EXCEPTION;
        }
        return KYCSERVICE_WSDL_LOCATION;
    }

}
