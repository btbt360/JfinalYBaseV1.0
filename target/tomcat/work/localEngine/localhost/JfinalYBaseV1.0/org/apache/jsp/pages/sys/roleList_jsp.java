package org.apache.jsp.pages.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roleList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<title>Insert title here</title>\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction edit(ids) {\n");
      out.write("\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/addroleinfo?id=\" + ids;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction del(ids) {\n");
      out.write("\t\tif(confirm(\"确定要删除该角色？\")){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : 'post',\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/delroleinfo?id=' + ids,\n");
      out.write("\t\t\t\tcache : false,\n");
      out.write("\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif (data == '1') {\n");
      out.write("\t\t\t\t\t\t$(\"#successmessage\").hide();\n");
      out.write("\t\t\t\t\t\t$(\"#errormessage\").show();\n");
      out.write("\t\t\t\t\t\t$(\"#messageee\").text(\"当前角色已被用户使用中，无法删除！\");\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t$(\"#errormessage\").hide();\n");
      out.write("\t\t\t\t\t\t$(\"#successmessage\").show();\n");
      out.write("\t\t\t\t\t\t$(\"#messagess\").text(\"删除成功！\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\treshcg();\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- block -->\n");
      out.write("\t<div class=\"block\" style=\"margin: 5%;\">\n");
      out.write("\t\t<div class=\"navbar navbar-inner block-header\">\n");
      out.write("\t\t\t<div class=\"muted pull-left\">\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-chevron-left hide-sidebar\"> <a href='#'\n");
      out.write("\t\t\t\t\t\ttitle=\"Hide Sidebar\" rel='tooltip'>&nbsp;</a></i>\n");
      out.write("\t\t\t\t\t<i class=\"icon-chevron-right show-sidebar\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t\t<a href='#' title=\"Show Sidebar\" rel='tooltip'>&nbsp;</a>\n");
      out.write("\t\t\t\t\t</i>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">系统管理</a> <span class=\"divider\">/</span></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\">角色管理</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t<div class=\"block\" style=\"border: 0px;\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"block-content collapse in\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/add\">角色列表</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/addroleinfo\">角色添加</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-success\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-right: 8%; display: none; text-align: center; \" id=\"successmessage\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"close\" onclick=\"$('#successmessage').hide();\" >&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<strong><span id=\"messagess\"></span></strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"alert alert-error\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-right: 8%; display: none; text-align: center; \" id=\"errormessage\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"close\" onclick=\"$('#errormessage').hide();\" >&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<strong><span id=\"messageee\"></span></strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/exportRole\" method=\"post\"\n");
      out.write("\t\t\t\t\t\tid=\"roleform\">\n");
      out.write("\t\t\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"span3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"rolename\">角色名称：</label> <input\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-medium focused\" id=\"rolename\" name=\"rolename\"\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"span3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"usertype\">角色类型：</label> <select\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"span6 m-wrap\" id=\"roletype\" name=\"roletype\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">--全部--</option>\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"span3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"starttimes\"><a href='#'\n");
      out.write("\t\t\t\t\t\t\t\tid=\"ceatetimes\" style=\"color: black; text-decoration: none;\">创建时间：</a></label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input-medium datepicker\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"starttimes\" value=\"\" name=\"starttimes\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"span3\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\" for=\"endtimes\"><a href='#'\n");
      out.write("\t\t\t\t\t\t\t\tid=\"ceatetimee\" style=\"color: black; text-decoration: none;\">至：</a></label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"input-medium datepicker\" id=\"endtimes\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"\" name=\"endtimes\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"rolepages\" name=\"rolepages\" /><input\n");
      out.write("\t\t\t\t\t\t\ttype=\"hidden\" id=\"rolerp\" name=\"rolerp\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<div class=\"span12 text-right\" style=\"padding-right: 7%;\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-medium btn-primary\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\tid=\"query\">查询</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-medium btn-primary\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\tid=\"export\">导出</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table id=\"roleList\" class=\"table table-striped table-bordered\">\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>角色名称</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>角色类型</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建人</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建时间</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>拥有权限</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>操作</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t<!-- tbody是必须的 -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\".datepicker\").datepicker({\n");
      out.write("\t\t\tdateFormat : 'yyyy-mm-dd',\n");
      out.write("\t\t\tshowButtonPanel : true,\n");
      out.write("\t\t\tchangeMonth : true,\n");
      out.write("\t\t\tchangeYear : true\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\toTable = $('#roleList').initDT({\n");
      out.write("\t\t\tserverSide : true,\n");
      out.write("\t\t\t\"sAjaxSource\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/role/addinfo\"\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\"#query\").click(function() {\n");
      out.write("\t\t\treshcg();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('#ceatetimes').click(function() {\n");
      out.write("\t\t\t$('#starttimes').val('');\n");
      out.write("\t\t});\n");
      out.write("\t\t$('#ceatetimee').click(function() {\n");
      out.write("\t\t\t$('#endtimes').val('');\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#export\").click(function() {\n");
      out.write("\t\t\t$(\"#rolepages\").val(oTable.getCurrentPage());\n");
      out.write("\t\t\t$(\"#rolerp\").val(oTable.getPageSize());\n");
      out.write("\t\t\t$(\"#roleform\").submit();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\tfunction reshcg(){\n");
      out.write("\t\tvar rolename = $('#rolename').val();\n");
      out.write("\t\tvar roletype = $('#roletype').val();\n");
      out.write("\t\tvar starttimes = $('#starttimes').val();\n");
      out.write("\t\tvar endtimes = $('#endtimes').val();\n");
      out.write("\t\tvar oSettings = [ {\n");
      out.write("\t\t\t\"name\" : \"rolename\",\n");
      out.write("\t\t\t\"value\" : rolename\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\t\"name\" : \"roletype\",\n");
      out.write("\t\t\t\"value\" : roletype\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\t\"name\" : \"starttimes\",\n");
      out.write("\t\t\t\"value\" : starttimes\n");
      out.write("\t\t}, {\n");
      out.write("\t\t\t\"name\" : \"endtimes\",\n");
      out.write("\t\t\t\"value\" : endtimes\n");
      out.write("\t\t} ];\n");
      out.write("\t\toTable.gridSearch(this, oSettings);\n");
      out.write("\t}\n");
      out.write("</script>\n");
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
    // /pages/sys/roleList.jsp(9,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /pages/sys/roleList.jsp(88,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/sys/roleList.jsp(88,8) '${listdict}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listdict}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/sys/roleList.jsp(88,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dict");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dict.dictkey}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dict.dictvalue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
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
}
