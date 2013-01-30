<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<body>
	<f:view>
		<h:form id="select">
			<h:dataTable value="#{bookBean.list}" var="book">
				<h:column>
					<f:facet name="header">
						<h:outputText value="title" />
					</f:facet>
					<h:outputText value="#{book.title}" />
				</h:column>
				<h:column>
                    <f:facet name="header">
                        <h:outputText value="author" />
                    </f:facet>
                    <h:outputText value="#{book.author}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="isbn" />
                    </f:facet>
                    <h:outputText value="#{book.isbn}" />
                </h:column>
			</h:dataTable>
			<h:commandButton action="#{bookBean.newBook}" value="new" />
		</h:form>
	</f:view>
</body>
</html>