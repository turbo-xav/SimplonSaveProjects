
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFoodCategories_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodCategories");
    private final static QName _Ping2_QNAME = new QName("http://soap.workshop.java.simplon.co/", "ping2");
    private final static QName _GetFoodAttributeById_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeById");
    private final static QName _PingResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "pingResponse");
    private final static QName _CreateFoodAttribute_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createFoodAttribute");
    private final static QName _GetFoodAttributeByIdResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeByIdResponse");
    private final static QName _Ping2Response_QNAME = new QName("http://soap.workshop.java.simplon.co/", "ping2Response");
    private final static QName _GetFoodAttributeListByName_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeListByName");
    private final static QName _GetFoodAttributeListByNameResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodAttributeListByNameResponse");
    private final static QName _CreateFoodAttributeResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "createFoodAttributeResponse");
    private final static QName _GetFoodCategoriesResponse_QNAME = new QName("http://soap.workshop.java.simplon.co/", "getFoodCategoriesResponse");
    private final static QName _Ping_QNAME = new QName("http://soap.workshop.java.simplon.co/", "ping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ping2Response }
     * 
     */
    public Ping2Response createPing2Response() {
        return new Ping2Response();
    }

    /**
     * Create an instance of {@link GetFoodAttributeListByName }
     * 
     */
    public GetFoodAttributeListByName createGetFoodAttributeListByName() {
        return new GetFoodAttributeListByName();
    }

    /**
     * Create an instance of {@link GetFoodAttributeListByNameResponse }
     * 
     */
    public GetFoodAttributeListByNameResponse createGetFoodAttributeListByNameResponse() {
        return new GetFoodAttributeListByNameResponse();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link CreateFoodAttributeResponse }
     * 
     */
    public CreateFoodAttributeResponse createCreateFoodAttributeResponse() {
        return new CreateFoodAttributeResponse();
    }

    /**
     * Create an instance of {@link GetFoodCategoriesResponse }
     * 
     */
    public GetFoodCategoriesResponse createGetFoodCategoriesResponse() {
        return new GetFoodCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetFoodAttributeById }
     * 
     */
    public GetFoodAttributeById createGetFoodAttributeById() {
        return new GetFoodAttributeById();
    }

    /**
     * Create an instance of {@link GetFoodCategories }
     * 
     */
    public GetFoodCategories createGetFoodCategories() {
        return new GetFoodCategories();
    }

    /**
     * Create an instance of {@link Ping2 }
     * 
     */
    public Ping2 createPing2() {
        return new Ping2();
    }

    /**
     * Create an instance of {@link CreateFoodAttribute }
     * 
     */
    public CreateFoodAttribute createCreateFoodAttribute() {
        return new CreateFoodAttribute();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link GetFoodAttributeByIdResponse }
     * 
     */
    public GetFoodAttributeByIdResponse createGetFoodAttributeByIdResponse() {
        return new GetFoodAttributeByIdResponse();
    }

    /**
     * Create an instance of {@link FoodAttribute }
     * 
     */
    public FoodAttribute createFoodAttribute() {
        return new FoodAttribute();
    }

    /**
     * Create an instance of {@link FoodCategory }
     * 
     */
    public FoodCategory createFoodCategory() {
        return new FoodCategory();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodCategories")
    public JAXBElement<GetFoodCategories> createGetFoodCategories(GetFoodCategories value) {
        return new JAXBElement<GetFoodCategories>(_GetFoodCategories_QNAME, GetFoodCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "ping2")
    public JAXBElement<Ping2> createPing2(Ping2 value) {
        return new JAXBElement<Ping2>(_Ping2_QNAME, Ping2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeById")
    public JAXBElement<GetFoodAttributeById> createGetFoodAttributeById(GetFoodAttributeById value) {
        return new JAXBElement<GetFoodAttributeById>(_GetFoodAttributeById_QNAME, GetFoodAttributeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFoodAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createFoodAttribute")
    public JAXBElement<CreateFoodAttribute> createCreateFoodAttribute(CreateFoodAttribute value) {
        return new JAXBElement<CreateFoodAttribute>(_CreateFoodAttribute_QNAME, CreateFoodAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeByIdResponse")
    public JAXBElement<GetFoodAttributeByIdResponse> createGetFoodAttributeByIdResponse(GetFoodAttributeByIdResponse value) {
        return new JAXBElement<GetFoodAttributeByIdResponse>(_GetFoodAttributeByIdResponse_QNAME, GetFoodAttributeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "ping2Response")
    public JAXBElement<Ping2Response> createPing2Response(Ping2Response value) {
        return new JAXBElement<Ping2Response>(_Ping2Response_QNAME, Ping2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeListByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeListByName")
    public JAXBElement<GetFoodAttributeListByName> createGetFoodAttributeListByName(GetFoodAttributeListByName value) {
        return new JAXBElement<GetFoodAttributeListByName>(_GetFoodAttributeListByName_QNAME, GetFoodAttributeListByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodAttributeListByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodAttributeListByNameResponse")
    public JAXBElement<GetFoodAttributeListByNameResponse> createGetFoodAttributeListByNameResponse(GetFoodAttributeListByNameResponse value) {
        return new JAXBElement<GetFoodAttributeListByNameResponse>(_GetFoodAttributeListByNameResponse_QNAME, GetFoodAttributeListByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFoodAttributeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "createFoodAttributeResponse")
    public JAXBElement<CreateFoodAttributeResponse> createCreateFoodAttributeResponse(CreateFoodAttributeResponse value) {
        return new JAXBElement<CreateFoodAttributeResponse>(_CreateFoodAttributeResponse_QNAME, CreateFoodAttributeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "getFoodCategoriesResponse")
    public JAXBElement<GetFoodCategoriesResponse> createGetFoodCategoriesResponse(GetFoodCategoriesResponse value) {
        return new JAXBElement<GetFoodCategoriesResponse>(_GetFoodCategoriesResponse_QNAME, GetFoodCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.workshop.java.simplon.co/", name = "ping")
    public JAXBElement<Ping> createPing(Ping value) {
        return new JAXBElement<Ping>(_Ping_QNAME, Ping.class, null, value);
    }

}
