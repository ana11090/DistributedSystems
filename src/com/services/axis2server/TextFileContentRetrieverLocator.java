/**
 * TextFileContentRetrieverLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.services.axis2server;

public class TextFileContentRetrieverLocator extends org.apache.axis.client.Service implements com.services.axis2server.TextFileContentRetriever {

    public TextFileContentRetrieverLocator() {
    }


    public TextFileContentRetrieverLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TextFileContentRetrieverLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TextFileContentRetrieverHttpSoap11Endpoint
    private java.lang.String TextFileContentRetrieverHttpSoap11Endpoint_address = "http://localhost:8080/Lab1_TextFileServicesServer/services/TextFileContentRetriever.TextFileContentRetrieverHttpSoap11Endpoint/";

    public java.lang.String getTextFileContentRetrieverHttpSoap11EndpointAddress() {
        return TextFileContentRetrieverHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TextFileContentRetrieverHttpSoap11EndpointWSDDServiceName = "TextFileContentRetrieverHttpSoap11Endpoint";

    public java.lang.String getTextFileContentRetrieverHttpSoap11EndpointWSDDServiceName() {
        return TextFileContentRetrieverHttpSoap11EndpointWSDDServiceName;
    }

    public void setTextFileContentRetrieverHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        TextFileContentRetrieverHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.services.axis2server.TextFileContentRetrieverPortType getTextFileContentRetrieverHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TextFileContentRetrieverHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTextFileContentRetrieverHttpSoap11Endpoint(endpoint);
    }

    public com.services.axis2server.TextFileContentRetrieverPortType getTextFileContentRetrieverHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.services.axis2server.TextFileContentRetrieverSoap11BindingStub _stub = new com.services.axis2server.TextFileContentRetrieverSoap11BindingStub(portAddress, this);
            _stub.setPortName(getTextFileContentRetrieverHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTextFileContentRetrieverHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        TextFileContentRetrieverHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.services.axis2server.TextFileContentRetrieverPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.services.axis2server.TextFileContentRetrieverSoap11BindingStub _stub = new com.services.axis2server.TextFileContentRetrieverSoap11BindingStub(new java.net.URL(TextFileContentRetrieverHttpSoap11Endpoint_address), this);
                _stub.setPortName(getTextFileContentRetrieverHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TextFileContentRetrieverHttpSoap11Endpoint".equals(inputPortName)) {
            return getTextFileContentRetrieverHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://axis2server.services.com", "TextFileContentRetriever");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://axis2server.services.com", "TextFileContentRetrieverHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TextFileContentRetrieverHttpSoap11Endpoint".equals(portName)) {
            setTextFileContentRetrieverHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
