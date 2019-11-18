/*
 * An XML document type.
 * Localname: request
 * Namespace: http://hotel.com/reservations
 * Java type: com.hotel.reservations.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.hotel.reservations;


/**
 * A document containing one request(@http://hotel.com/reservations) element.
 *
 * This is a complex type.
 */
public interface RequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB4B5E6B0F80837FE31F745C387D8121E").resolveHandle("request86b7doctype");
    
    /**
     * Gets the "request" element
     */
    com.hotel.reservations.RequestDocument.Request getRequest();
    
    /**
     * Sets the "request" element
     */
    void setRequest(com.hotel.reservations.RequestDocument.Request request);
    
    /**
     * Appends and returns a new empty "request" element
     */
    com.hotel.reservations.RequestDocument.Request addNewRequest();
    
    /**
     * An XML request(@http://hotel.com/reservations).
     *
     * This is a complex type.
     */
    public interface Request extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Request.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB4B5E6B0F80837FE31F745C387D8121E").resolveHandle("request3eb2elemtype");
        
        /**
         * Gets the "checkin" element
         */
        java.util.Calendar getCheckin();
        
        /**
         * Gets (as xml) the "checkin" element
         */
        org.apache.xmlbeans.XmlDate xgetCheckin();
        
        /**
         * Sets the "checkin" element
         */
        void setCheckin(java.util.Calendar checkin);
        
        /**
         * Sets (as xml) the "checkin" element
         */
        void xsetCheckin(org.apache.xmlbeans.XmlDate checkin);
        
        /**
         * Gets the "checkout" element
         */
        java.util.Calendar getCheckout();
        
        /**
         * Gets (as xml) the "checkout" element
         */
        org.apache.xmlbeans.XmlDate xgetCheckout();
        
        /**
         * Sets the "checkout" element
         */
        void setCheckout(java.util.Calendar checkout);
        
        /**
         * Sets (as xml) the "checkout" element
         */
        void xsetCheckout(org.apache.xmlbeans.XmlDate checkout);
        
        /**
         * Gets the "cuarto" element
         */
        int getCuarto();
        
        /**
         * Gets (as xml) the "cuarto" element
         */
        org.apache.xmlbeans.XmlInt xgetCuarto();
        
        /**
         * Sets the "cuarto" element
         */
        void setCuarto(int cuarto);
        
        /**
         * Sets (as xml) the "cuarto" element
         */
        void xsetCuarto(org.apache.xmlbeans.XmlInt cuarto);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.hotel.reservations.RequestDocument.Request newInstance() {
              return (com.hotel.reservations.RequestDocument.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.hotel.reservations.RequestDocument.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.hotel.reservations.RequestDocument.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.hotel.reservations.RequestDocument newInstance() {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.hotel.reservations.RequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.hotel.reservations.RequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.hotel.reservations.RequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.hotel.reservations.RequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.hotel.reservations.RequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.hotel.reservations.RequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hotel.reservations.RequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hotel.reservations.RequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hotel.reservations.RequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
