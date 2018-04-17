/**
 * ListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netroxtech.webservice;

public class ListResponse  implements java.io.Serializable {
    private java.lang.Object[] listReturn;

    public ListResponse() {
    }

    public ListResponse(
           java.lang.Object[] listReturn) {
           this.listReturn = listReturn;
    }


    /**
     * Gets the listReturn value for this ListResponse.
     * 
     * @return listReturn
     */
    public java.lang.Object[] getListReturn() {
        return listReturn;
    }


    /**
     * Sets the listReturn value for this ListResponse.
     * 
     * @param listReturn
     */
    public void setListReturn(java.lang.Object[] listReturn) {
        this.listReturn = listReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListResponse)) return false;
        ListResponse other = (ListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listReturn==null && other.getListReturn()==null) || 
             (this.listReturn!=null &&
              java.util.Arrays.equals(this.listReturn, other.getListReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getListReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.netroxtech.com", ">listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.netroxtech.com", "listReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservice.netroxtech.com", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
