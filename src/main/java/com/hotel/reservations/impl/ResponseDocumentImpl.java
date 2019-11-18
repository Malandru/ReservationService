/*
 * An XML document type.
 * Localname: response
 * Namespace: http://hotel.com/reservations
 * Java type: com.hotel.reservations.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.hotel.reservations.impl;
/**
 * A document containing one response(@http://hotel.com/reservations) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.reservations.ResponseDocument
{
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://hotel.com/reservations", "response");
    
    
    /**
     * Gets the "response" element
     */
    public com.hotel.reservations.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.ResponseDocument.Response target = null;
            target = (com.hotel.reservations.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(com.hotel.reservations.ResponseDocument.Response response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.ResponseDocument.Response target = null;
            target = (com.hotel.reservations.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (com.hotel.reservations.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public com.hotel.reservations.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.ResponseDocument.Response target = null;
            target = (com.hotel.reservations.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@http://hotel.com/reservations).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.reservations.ResponseDocument.Response
    {
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESERVADO$0 = 
            new javax.xml.namespace.QName("", "reservado");
        
        
        /**
         * Gets the "reservado" element
         */
        public boolean getReservado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVADO$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "reservado" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetReservado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESERVADO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "reservado" element
         */
        public void setReservado(boolean reservado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVADO$0);
                }
                target.setBooleanValue(reservado);
            }
        }
        
        /**
         * Sets (as xml) the "reservado" element
         */
        public void xsetReservado(org.apache.xmlbeans.XmlBoolean reservado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESERVADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESERVADO$0);
                }
                target.set(reservado);
            }
        }
    }
}
