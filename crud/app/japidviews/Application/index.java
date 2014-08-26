//version: 0.9.5.2
package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import play.utils.*;
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
// NOTE: This file was generated from: japidviews/Application/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends main
{
	public static final String sourceTemplate = "japidviews/Application/index.html";
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


	public index() {
	super((StringBuilder)null);
	initHeaders();
	}
	public index(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public index(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"list",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"List<SxData>",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.index.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private List<SxData> list; // line 3, japidviews/Application/index.html
	public cn.bran.japid.template.RenderResult render(List<SxData> list) {
		this.list = list;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 3, japidviews/Application/index.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(List<SxData> list) {
		return new index().render(list);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, index.html
;// line 2, index.html
		p("<a href=\"");// line 3, index.html
		p(lookup("formPage", 1,  null));// line 4, index.html
		p("\">新增</a>\n" + 
"<table>\n" + 
"	<tr><td>ID</td><td>Name</td><td>Value</td><td>createTime</td><td>操作</td></tr>\n" + 
"	");// line 4, index.html
		for(SxData d: list) {// line 7, index.html
		p("	<tr><td>");// line 7, index.html
		p(d.id);// line 8, index.html
		p("</td><td>");// line 8, index.html
		p(d.name);// line 8, index.html
		p("</td><td>");// line 8, index.html
		p(d.val);// line 8, index.html
		p("</td><td>");// line 8, index.html
		p(d.createTime);// line 8, index.html
		p("</td><td><a href=\"");// line 8, index.html
		p(lookup("formPage", 2, d.id));// line 8, index.html
		p("\">修改</a>  |  <a href=\"");// line 8, index.html
		p(lookup("delete", d.id));// line 8, index.html
		p("\">删除</a></td></tr>\n" + 
"	");// line 8, index.html
		}// line 9, index.html
		p("</table>");// line 9, index.html
		
		endDoLayout(sourceTemplate);
	}

}