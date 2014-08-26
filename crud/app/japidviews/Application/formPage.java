//version: 0.9.5.2
package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static play.templates.JavaExtensions.*;
import play.data.validation.Error;
import play.i18n.Messages;
import play.mvc.Scope.*;
import play.data.validation.Validation;
import play.i18n.Lang;
import controllers.*;
import japidviews._layouts.*;
import models.*;
import play.mvc.Http.*;
//
// NOTE: This file was generated from: japidviews/Application/formPage.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class formPage extends main
{
	public static final String sourceTemplate = "japidviews/Application/formPage.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public formPage() {
	super((StringBuilder)null);
	initHeaders();
	}
	public formPage(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public formPage(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pageType", "d",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"Integer", "SxData",  };
	public static final Object[] argDefaults= new Object[] {null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.formPage.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private Integer pageType; // line 2, japidviews/Application/formPage.html
	private SxData d; // line 2, japidviews/Application/formPage.html
	public cn.bran.japid.template.RenderResult render(Integer pageType,SxData d) {
		this.pageType = pageType;
		this.d = d;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 2, japidviews/Application/formPage.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(Integer pageType,SxData d) {
		return new formPage().render(pageType, d);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, formPage.html
		;// line 1, formPage.html
		p("<form method=\"post\" action=\"");// line 2, formPage.html
		p(lookup("save", new Object[]{}));// line 4, formPage.html
		p("\">\n" + 
"	<input type=\"hidden\" name=\"d.id\" value=\"");// line 4, formPage.html
		p(d.id);// line 5, formPage.html
		p("\">\n" + 
"	Name: <input name=\"d.name\" value=\"");// line 5, formPage.html
		p(d.name);// line 6, formPage.html
		p("\"> <br>\n" + 
"	Val: <input name=\"d.val\" value=\"");// line 6, formPage.html
		p(d.val);// line 7, formPage.html
		p("\"> <br>\n" + 
"	Status: <input name=\"d.status\" value=\"");// line 7, formPage.html
		p(d.status);// line 8, formPage.html
		p("\"> <br>\n" + 
"	<input type=\"submit\" value=\"保存\"> <a href=\"");// line 8, formPage.html
		p(lookup("index", new Object[]{}));// line 9, formPage.html
		p("\">返回</a>\n" + 
"</form>");// line 9, formPage.html
		
		endDoLayout(sourceTemplate);
	}

}