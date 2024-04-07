package com.services.axis2server;

public class TextFileContentRetrieverPortTypeProxy implements com.services.axis2server.TextFileContentRetrieverPortType {
  private String _endpoint = null;
  private com.services.axis2server.TextFileContentRetrieverPortType textFileContentRetrieverPortType = null;
  
  public TextFileContentRetrieverPortTypeProxy() {
    _initTextFileContentRetrieverPortTypeProxy();
  }
  
  public TextFileContentRetrieverPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTextFileContentRetrieverPortTypeProxy();
  }
  
  private void _initTextFileContentRetrieverPortTypeProxy() {
    try {
      textFileContentRetrieverPortType = (new com.services.axis2server.TextFileContentRetrieverLocator()).getTextFileContentRetrieverHttpSoap11Endpoint();
      if (textFileContentRetrieverPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)textFileContentRetrieverPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)textFileContentRetrieverPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (textFileContentRetrieverPortType != null)
      ((javax.xml.rpc.Stub)textFileContentRetrieverPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.services.axis2server.TextFileContentRetrieverPortType getTextFileContentRetrieverPortType() {
    if (textFileContentRetrieverPortType == null)
      _initTextFileContentRetrieverPortTypeProxy();
    return textFileContentRetrieverPortType;
  }
  
  
}