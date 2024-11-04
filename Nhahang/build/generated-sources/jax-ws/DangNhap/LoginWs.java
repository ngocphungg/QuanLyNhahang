
package DangNhap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "login_ws", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoginWs {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws/", className = "DangNhap.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws/", className = "DangNhap.LoginResponse")
    @Action(input = "http://ws/login_ws/loginRequest", output = "http://ws/login_ws/loginResponse")
    public boolean login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns java.util.List<DangNhap.Loginmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDangnhap", targetNamespace = "http://ws/", className = "DangNhap.GetDangnhap")
    @ResponseWrapper(localName = "getDangnhapResponse", targetNamespace = "http://ws/", className = "DangNhap.GetDangnhapResponse")
    @Action(input = "http://ws/login_ws/getDangnhapRequest", output = "http://ws/login_ws/getDangnhapResponse")
    public List<Loginmodel> getDangnhap();

}
