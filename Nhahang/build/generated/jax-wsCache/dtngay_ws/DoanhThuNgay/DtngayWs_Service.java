
package DoanhThuNgay;

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
@WebServiceClient(name = "dtngay_ws", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/dtngay_ws?WSDL")
public class DtngayWs_Service
    extends Service
{

    private final static URL DTNGAYWS_WSDL_LOCATION;
    private final static WebServiceException DTNGAYWS_EXCEPTION;
    private final static QName DTNGAYWS_QNAME = new QName("http://ws/", "dtngay_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/dtngay_ws?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DTNGAYWS_WSDL_LOCATION = url;
        DTNGAYWS_EXCEPTION = e;
    }

    public DtngayWs_Service() {
        super(__getWsdlLocation(), DTNGAYWS_QNAME);
    }

    public DtngayWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DTNGAYWS_QNAME, features);
    }

    public DtngayWs_Service(URL wsdlLocation) {
        super(wsdlLocation, DTNGAYWS_QNAME);
    }

    public DtngayWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DTNGAYWS_QNAME, features);
    }

    public DtngayWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DtngayWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DtngayWs
     */
    @WebEndpoint(name = "dtngay_wsPort")
    public DtngayWs getDtngayWsPort() {
        return super.getPort(new QName("http://ws/", "dtngay_wsPort"), DtngayWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DtngayWs
     */
    @WebEndpoint(name = "dtngay_wsPort")
    public DtngayWs getDtngayWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "dtngay_wsPort"), DtngayWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DTNGAYWS_EXCEPTION!= null) {
            throw DTNGAYWS_EXCEPTION;
        }
        return DTNGAYWS_WSDL_LOCATION;
    }

}
