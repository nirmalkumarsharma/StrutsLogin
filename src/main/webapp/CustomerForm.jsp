<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html xhtml="true">
<body>
<html:form action="/submitCustomerForm">
Put Customer First Name <html:text property="firstName" size="16" maxlength="16"/> <BR/>
Put Customer Last Name <html:text property="lastName" size="16" maxlength="16"/> <BR/> <P/>
<html:submit>Save</html:submit>
</html:form>
</body>
</html:html>