
package NhanVien;

import java.util.List;
import javax.jws.Oneway;
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
@WebService(name = "nv_ws", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NvWs {


    /**
     * 
     * @param a
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCheck", targetNamespace = "http://ws/", className = "NhanVien.GetCheck")
    @ResponseWrapper(localName = "getCheckResponse", targetNamespace = "http://ws/", className = "NhanVien.GetCheckResponse")
    @Action(input = "http://ws/nv_ws/getCheckRequest", output = "http://ws/nv_ws/getCheckResponse")
    public boolean getCheck(
        @WebParam(name = "a", targetNamespace = "")
        String a);

    /**
     * 
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "getUpdatenv", targetNamespace = "http://ws/", className = "NhanVien.GetUpdatenv")
    @Action(input = "http://ws/nv_ws/getUpdatenv")
    public void getUpdatenv(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b,
        @WebParam(name = "c", targetNamespace = "")
        String c,
        @WebParam(name = "d", targetNamespace = "")
        String d,
        @WebParam(name = "e", targetNamespace = "")
        String e,
        @WebParam(name = "f", targetNamespace = "")
        String f);

    /**
     * 
     * @param a
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "getDeletenv", targetNamespace = "http://ws/", className = "NhanVien.GetDeletenv")
    @Action(input = "http://ws/nv_ws/getDeletenv")
    public void getDeletenv(
        @WebParam(name = "a", targetNamespace = "")
        String a);

    /**
     * 
     * @param a
     * @return
     *     returns java.util.List<NhanVien.Nvmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findnv", targetNamespace = "http://ws/", className = "NhanVien.Findnv")
    @ResponseWrapper(localName = "findnvResponse", targetNamespace = "http://ws/", className = "NhanVien.FindnvResponse")
    @Action(input = "http://ws/nv_ws/findnvRequest", output = "http://ws/nv_ws/findnvResponse")
    public List<Nvmodel> findnv(
        @WebParam(name = "a", targetNamespace = "")
        String a);

    /**
     * 
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "getThemnv", targetNamespace = "http://ws/", className = "NhanVien.GetThemnv")
    @Action(input = "http://ws/nv_ws/getThemnv")
    public void getThemnv(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b,
        @WebParam(name = "c", targetNamespace = "")
        String c,
        @WebParam(name = "d", targetNamespace = "")
        String d,
        @WebParam(name = "e", targetNamespace = "")
        String e,
        @WebParam(name = "f", targetNamespace = "")
        String f);

    /**
     * 
     * @return
     *     returns java.util.List<NhanVien.Nvmodel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNhanvien", targetNamespace = "http://ws/", className = "NhanVien.GetNhanvien")
    @ResponseWrapper(localName = "getNhanvienResponse", targetNamespace = "http://ws/", className = "NhanVien.GetNhanvienResponse")
    @Action(input = "http://ws/nv_ws/getNhanvienRequest", output = "http://ws/nv_ws/getNhanvienResponse")
    public List<Nvmodel> getNhanvien();

}
