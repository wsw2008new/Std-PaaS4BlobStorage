//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.27 at 11:18:15 PM EET 
//


package fci.cu.std.paas.api.xml.services.persistent.storage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import fci.cu.std.paas.api.xml.manifest.Blob;
import fci.cu.std.paas.api.xml.manifest.Container;
import fci.cu.std.paas.api.xml.manifest.StorageServiceAccount;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fci.cu.std.paas.api.xml.services.persistent.storage package. 
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

    private final static QName _StorageServiceType_QNAME = new QName("http://www.example.org/storageservice", "storage_service_type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fci.cu.std.paas.api.xml.services.persistent.storage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StorageServiceType }
     * 
     */
    public StorageServiceType createStorageServiceType() {
        return new StorageServiceType();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link Blob }
     * 
     */
    public Blob createBlob() {
        return new Blob();
    }

    /**
     * Create an instance of {@link StorageAccount }
     * 
     */
    public StorageServiceAccount createStorageAccount() {
        return new StorageServiceAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/storageservice", name = "storage_service_type")
    public JAXBElement<StorageServiceType> createStorageServiceType(StorageServiceType value) {
        return new JAXBElement<StorageServiceType>(_StorageServiceType_QNAME, StorageServiceType.class, null, value);
    }

}
