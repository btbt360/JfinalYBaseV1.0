package org.apache.jsp.pages.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>基础框架</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".hoverimg{filter:alpha(Opacity=80);-moz-opacity:0.8;opacity: 0.8} \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div style=\"margin-top: 3%; margin-left: 10%; margin-right: 10%\"\n");
      out.write("\t\tclass=\"row\">\n");
      out.write("\n");
      out.write("\t\t<div class=\".col-xs-12 .col-sm-12 .col-md-12 .col-lg-12\">\n");
      out.write("\t\t\t<!-- block -->\n");
      out.write("\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t<div class=\"navbar navbar-inner block-header\">\n");
      out.write("\t\t\t\t\t<div class=\"muted pull-left\">\n");
      out.write("\t\t\t\t\t占位统计 <small>统计图</small>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-warning\">更多数据</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"block-content collapse in\">\n");
      out.write("\t\t\t\t\t首页要加载图表\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /block -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\" style=\"margin-left: 10%; margin-right: 10%\">\n");
      out.write("\t\t<div class=\"pull-left\" style=\"width: 30%\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<!-- block -->\n");
      out.write("\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar navbar-inner block-header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"muted pull-left\">快捷入口</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"block-content collapse in\">\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"100px\">\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../file/add\"><img alt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"../static/img/1.png\" width=\"80px\" class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\"><img alt=\"\" src=\"../static/img/2.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"80px\"  class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"100px\">\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\"><img alt=\"\" src=\"../static/img/3.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"80px\" class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../weixin/menu\"><img alt=\"\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"../static/img/4.png\" width=\"80px\" class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"110px\">\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\"><img alt=\"\" src=\"../static/img/5.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"80px\" class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\"><img alt=\"\" src=\"../static/img/6.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth=\"80px\" class=\"img-rounded\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /block -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"pull-left\" style=\"margin-left: 3%; width: 67%\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t\t<!-- block -->\n");
      out.write("\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar navbar-inner block-header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"muted pull-left\">内容列表</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"muted pull-right\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/bbs/getPostingAll\">更多..</a></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"block-content collapse in\">\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /block -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- block -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$(\".flagbtn\").click(function(){\n");
      out.write("\t\t\t\tvar id=this.id;\n");
      out.write("\t\t\t\tvar url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/bbs/updateis_check\";\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype : 'post',\n");
      out.write("\t\t\t\t\turl : url,\n");
      out.write("\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\tid : id\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tcache : false,\n");
      out.write("\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t$(\"#\"+id).hide();\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror : function() {\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".img-rounded\").mouseover(function(){\n");
      out.write("\t\t\t\t$(this).addClass(\"hoverimg\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\".img-rounded\").mouseout(function(){\n");
      out.write("\t\t\t\t$(this).removeClass(\"hoverimg\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t// Morris Line Chart\n");
      out.write("\t\t\tvar tax_data = [ {\n");
      out.write("\t\t\t\t\"period\" : \"2016-01\",\n");
      out.write("\t\t\t\t\"visits\" : 2407,\n");
      out.write("\t\t\t\t\"signups\" : 660\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-02\",\n");
      out.write("\t\t\t\t\"visits\" : 3351,\n");
      out.write("\t\t\t\t\"signups\" : 729\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-03\",\n");
      out.write("\t\t\t\t\"visits\" : 2469,\n");
      out.write("\t\t\t\t\"signups\" : 1318\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-04\",\n");
      out.write("\t\t\t\t\"visits\" : 2246,\n");
      out.write("\t\t\t\t\"signups\" : 461\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-05\",\n");
      out.write("\t\t\t\t\"visits\" : 3171,\n");
      out.write("\t\t\t\t\"signups\" : 1676\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-06\",\n");
      out.write("\t\t\t\t\"visits\" : 2155,\n");
      out.write("\t\t\t\t\"signups\" : 681\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-07\",\n");
      out.write("\t\t\t\t\"visits\" : 1226,\n");
      out.write("\t\t\t\t\"signups\" : 620\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\t\"period\" : \"2016-08\",\n");
      out.write("\t\t\t\t\"visits\" : 2245,\n");
      out.write("\t\t\t\t\"signups\" : 500\n");
      out.write("\t\t\t} ];\n");
      out.write("\t\t\tMorris.Line({\n");
      out.write("\t\t\t\telement : 'hero-graph',\n");
      out.write("\t\t\t\tdata : tax_data,\n");
      out.write("\t\t\t\txkey : 'period',\n");
      out.write("\t\t\t\txLabels : \"month\",\n");
      out.write("\t\t\t\tykeys : [ 'visits', 'signups' ],\n");
      out.write("\t\t\t\tlabels : [ '新闻量', '发帖量' ]\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /pages/sys/main.jsp(14,1) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/pages/include/pageNavigation.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/sys/main.jsp(98,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/sys/main.jsp(98,8) '${postlist }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${postlist }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/sys/main.jsp(98,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("postmodel");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr style=\"height:42px !important;\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"50%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postmodel.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td  width=\"30%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postmodel.create_date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<td  width=\"20%\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /pages/sys/main.jsp(103,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postmodel.is_check==0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"flagbtn\" id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postmodel.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">审核</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
