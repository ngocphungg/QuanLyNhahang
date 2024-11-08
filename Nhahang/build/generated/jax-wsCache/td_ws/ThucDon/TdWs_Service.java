
package ThucDon;

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
@WebServiceClient(name = "td_ws", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/td_ws?WSDL")
public class TdWs_Service
    extends Service
{

    private final static URL TDWS_WSDL_LOCATION;
    private final static WebServiceException TDWS_EXCEPTION;
    private final static QName TDWS_QNAME = new QName("http://ws/", "td_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/td_ws?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TDWS_WSDL_LOCATION = url;
        TDWS_EXCEPTION = e;
    }

    public TdWs_Service() {
        super(__getWsdlLocation(), TDWS_QNAME);
    }

    public TdWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TDWS_QNAME, features);
    }

    public TdWs_Service(URL wsdlLocation) {
        super(wsdlLocation, TDWS_QNAME);
    }

    public TdWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TDWS_QNAME, features);
    }

    public TdWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TdWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TdWs
     */
    @WebEndpoint(name = "td_wsPort")
    public TdWs getTdWsPort() {
        return super.getPort(new QName("http://ws/", "td_wsPort"), TdWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TdWs
     */
    @WebEndpoint(name = "td_wsPort")
    public TdWs getTdWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "td_wsPort"), TdWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TDWS_EXCEPTION!= null) {
            throw TDWS_EXCEPTION;
        }
        return TDWS_WSDL_LOCATION;
    }

}
