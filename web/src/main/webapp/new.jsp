<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Book</title>
</head>
<body>
<f:view>
  <h:form>
    <h:panelGrid columns="2">
      <h:outputLabel value="Title"></h:outputLabel>
      <h:inputText  value="#{bookBean.title}"></h:inputText>
      
      <h:outputLabel value="Author"></h:outputLabel>
      <h:inputText  value="#{bookBean.author}"></h:inputText>
      
      <h:outputLabel value="ISBN"></h:outputLabel>
      <h:inputText  value="#{bookBean.isbn}"></h:inputText>
    </h:panelGrid>
    <h:commandButton action="#{bookBean.save}" value="save"></h:commandButton>
    <h:messages layout="table"></h:messages>
  </h:form>  
</f:view>
</body>
</html> 