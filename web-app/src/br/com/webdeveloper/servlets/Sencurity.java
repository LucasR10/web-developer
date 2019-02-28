package br.com.webdeveloper.servlets;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;

//@ServletSecurity(@HttpConstraint(transportGuarantee = TransportGuarantee.NONE  ))

//@ServletSecurity(@HttpConstraint(EmptyRoleSemantic.DENY))

//@ServletSecurity(@HttpConstraint(rolesAllowed = "R1"))


@ServletSecurity
public class Sencurity {

}
