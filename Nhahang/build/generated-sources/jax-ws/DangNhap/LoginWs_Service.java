
package DangNhap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "login_ws", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/login_ws?WSDL")
public class LoginWs_Service
    extends Service
{

    private final static URL LOGINWS_WSDL_LOCATION;
    private final static WebServiceException LOGINWS_EXCEPTION;
    private final static QName LOGINWS_QNAME = new QName("http://ws/", "login_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/login_ws?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGINWS_WSDL_LOCATION = url;
        LOGINWS_EXCEPTION = e;
    }

    public LoginWs_Service() {
        super(__getWsdlLocation(), LOGINWS_QNAME);
    }

    public LoginWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGINWS_QNAME, features);
    }

    public LoginWs_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGINWS_QNAME);
    }

    public LoginWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGINWS_QNAME, features);
    }

    public LoginWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoginWs
     */
    @WebEndpoint(name = "login_wsPort")
    public LoginWs getLoginWsPort() {
        return super.getPort(new QName("http://ws/", "login_wsPort"), LoginWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginWs
     */
    @WebEndpoint(name = "login_wsPort")
    public LoginWs getLoginWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "login_wsPort"), LoginWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGINWS_EXCEPTION!= null) {
            throw LOGINWS_EXCEPTION;
        }
        return LOGINWS_WSDL_LOCATION;
    }

}
