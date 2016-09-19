package org.apache.jsp.pages.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sendEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\tvar editor = null;\n");
      out.write("\t\t$(\"#successmessage\").hide();\n");
      out.write("\t\t$(\"#errormessage\").hide();\n");
      out.write("\t\teditor = CKEDITOR.replace('content'); //参数‘content’是textarea元素的name属性值，而非id属性值\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction sendemail() {\n");
      out.write("\t\talert($(\"#content\").val());\n");
      out.write("\t\tvar mail = {\n");
      out.write("\t\t\ttoMail : $(\"#toMail\").val(),\n");
      out.write("\t\t\tccMail : $(\"#ccMail\").val(),\n");
      out.write("\t\t\tsubject : $(\"#subject\").val(),\n");
      out.write("\t\t\tcontent : $(\"#content\").val()\n");
      out.write("\t\t};\n");
      out.write("\n");
      out.write("\t\tif (confirm(\"确定发送邮件？\")) {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : 'post',\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/file/sendmail',\n");
      out.write("\t\t\t\tdata : mail,\n");
      out.write("\t\t\t\tcache : false,\n");
      out.write("\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif (data == '1') {\n");
      out.write("\t\t\t\t\t\t$(\"#successmessage\").hide();\n");
      out.write("\t\t\t\t\t\t$(\"#errormessage\").show();\n");
      out.write("\t\t\t\t\t\t$(\"#messageee\").text(\"发送失败！\");\n");
      out.write("\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t$(\"#errormessage\").hide();\n");
      out.write("\t\t\t\t\t\t$(\"#successmessage\").show();\n");
      out.write("\t\t\t\t\t\t$(\"#messagess\").text(\"发送成功！\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\treshcg();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t//使用input框打开ckfinder\n");
      out.write("\tfunction BrowseServer(inputId) {\n");
      out.write("\t\tvar finder = new CKFinder();\n");
      out.write("\t\tfinder.basePath = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/ckfinder'; //导入CKFinder的路径 \n");
      out.write("\t\tfinder.selectActionFunction = SetFileField; //设置文件被选中时的函数 \n");
      out.write("\t\tfinder.selectActionData = inputId; //接收地址的input ID \n");
      out.write("\t\tfinder.popup();\n");
      out.write("\t}\n");
      out.write("\t//文件选中时执行 \n");
      out.write("\tfunction SetFileField(fileUrl, data) {\n");
      out.write("\t\tdocument.getElementById(data[\"selectActionData\"]).value = fileUrl;\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- block -->\n");
      out.write("\t<div class=\"block\" style=\"margin: 5%;\">\n");
      out.write("\t<div class=\"navbar navbar-inner block-header\">\n");
      out.write("\t\t\t<div class=\"muted pull-left\">\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-chevron-left hide-sidebar\"><a href='#' title=\"Hide Sidebar\" rel='tooltip'>&nbsp;</a></i>\n");
      out.write("\t\t\t\t\t<i class=\"icon-chevron-right show-sidebar\" style=\"display: none;\"><a href='#' title=\"Show Sidebar\" rel='tooltip'>&nbsp;</a></i>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">我的面板</a> <span class=\"divider\">/</span></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\">邮件发送</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"block-content collapse in\">\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t<div class=\"alert alert-success\"\n");
      out.write("\t\t\t\t\tstyle=\"margin-right: 8%; text-align: center;\" id=\"successmessage\">\n");
      out.write("\t\t\t\t\t<button class=\"close\" onclick=\"$('#successmessage').hide();\">&times;</button>\n");
      out.write("\t\t\t\t\t<strong><span id=\"messagess\"></span></strong>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"alert alert-error\"\n");
      out.write("\t\t\t\t\tstyle=\"margin-right: 8%; text-align: center;\" id=\"errormessage\">\n");
      out.write("\t\t\t\t\t<button class=\"close\" onclick=\"$('#errormessage').hide();\">&times;</button>\n");
      out.write("\t\t\t\t\t<strong><span id=\"messageee\"></span></strong>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"span12\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basepath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/user/saveuserinfo\"\n");
      out.write("\t\t\t\t\tid=\"userform\" method=\"post\">\n");
      out.write("\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t<legend>邮件发送</legend>\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">收件人：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input-xlarge focused\" id=\"toMail\" name=\"toMail\"\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"请输入收件人！\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">抄送人：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input-xlarge focused\" id=\"ccMail\" name=\"ccMail\"\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"请输入抄送人！\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">主 题：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"input-xlarge focused\" id=\"subject\" name=\"subject\"\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" placeholder=\"请输入主题！\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">邮件内容：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<textarea id=\"content\" name=\"content\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">选择附件：</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"xFilePath\" name=\"FilePath\" type=\"text\" size=\"60\" />\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"btn btn-primary\" value=\"上传附件\"\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"BrowseServer('xFilePath');\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\"\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"sendemail();\">发送</button>\n");
      out.write("\t\t\t\t\t\t\t<button type=\"reset\" class=\"btn\">取消</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
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
    // /pages/sys/sendEmail.jsp(9,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/pages/include/pageNavigationFile.jsp");
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
}
