/*
 * An XML document type.
 * Localname: request
 * Namespace: http://hotel.com/reservations
 * Java type: com.hotel.reservations.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.hotel.reservations.impl;
/**
 * A document containing one request(@http://hotel.com/reservations) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.reservations.RequestDocument
{
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://hotel.com/reservations", "request");
    
    
    /**
     * Gets the "request" element
     */
    public com.hotel.reservations.RequestDocument.Request getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.RequestDocument.Request target = null;
            target = (com.hotel.reservations.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(com.hotel.reservations.RequestDocument.Request request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.RequestDocument.Request target = null;
            target = (com.hotel.reservations.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (com.hotel.reservations.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public com.hotel.reservations.RequestDocument.Request addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hotel.reservations.RequestDocument.Request target = null;
            target = (com.hotel.reservations.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    /**
     * An XML request(@http://hotel.com/reservations).
     *
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hotel.reservations.RequestDocument.Request
    {
        
        public RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHECKIN$0 = 
            new javax.xml.namespace.QName("", "checkin");
        private static final javax.xml.namespace.QName CHECKOUT$2 = 
            new javax.xml.namespace.QName("", "checkout");
        private static final javax.xml.namespace.QName CUARTO$4 = 
            new javax.xml.namespace.QName("", "cuarto");
        
        
        /**
         * Gets the "checkin" element
         */
        public java.util.Calendar getCheckin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "checkin" element
         */
        public org.apache.xmlbeans.XmlDate xgetCheckin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKIN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "checkin" element
         */
        public void setCheckin(java.util.Calendar checkin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKIN$0);
                }
                target.setCalendarValue(checkin);
            }
        }
        
        /**
         * Sets (as xml) the "checkin" element
         */
        public void xsetCheckin(org.apache.xmlbeans.XmlDate checkin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKIN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CHECKIN$0);
                }
                target.set(checkin);
            }
        }
        
        /**
         * Gets the "checkout" element
         */
        public java.util.Calendar getCheckout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "checkout" element
         */
        public org.apache.xmlbeans.XmlDate xgetCheckout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKOUT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "checkout" element
         */
        public void setCheckout(java.util.Calendar checkout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKOUT$2);
                }
                target.setCalendarValue(checkout);
            }
        }
        
        /**
         * Sets (as xml) the "checkout" element
         */
        public void xsetCheckout(org.apache.xmlbeans.XmlDate checkout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CHECKOUT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CHECKOUT$2);
                }
                target.set(checkout);
            }
        }
        
        /**
         * Gets the "cuarto" element
         */
        public int getCuarto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUARTO$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "cuarto" element
         */
        public org.apache.xmlbeans.XmlInt xgetCuarto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUARTO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cuarto" element
         */
        public void setCuarto(int cuarto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUARTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUARTO$4);
                }
                target.setIntValue(cuarto);
            }
        }
        
        /**
         * Sets (as xml) the "cuarto" element
         */
        public void xsetCuarto(org.apache.xmlbeans.XmlInt cuarto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUARTO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUARTO$4);
                }
                target.set(cuarto);
            }
        }
    }
}
