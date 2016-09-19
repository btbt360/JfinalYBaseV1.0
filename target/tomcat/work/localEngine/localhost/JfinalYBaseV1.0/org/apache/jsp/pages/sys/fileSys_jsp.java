package org.apache.jsp.pages.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fileSys_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"robots\" content=\"noindex, nofollow\" />\n");
      out.write("\n");
      out.write("<title>文件管理</title>\n");
      out.write("\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<style type=\"text/css\">body, html, iframe, #ckfinder {margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;}</style>\n");
      out.write("</head>\n");
      out.write("<body class=\"CKFinderFrameWindow\">\n");
      out.write("\t<div id=\"ckfinder\" style=\"margin-top: 3%\"></div>\n");
      out.write("\t<!-- block -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t//<![CDATA[\n");
      out.write("\t(function()\n");
      out.write("\t{\n");
      out.write("\t\tvar config = {};\n");
      out.write("\t\tvar get = CKFinder.tools.getUrlParam;\n");
      out.write("\t\tvar getBool = function( v )\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar t = get( v );\n");
      out.write("\n");
      out.write("\t\t\tif ( t === null )\n");
      out.write("\t\t\t\treturn null;\n");
      out.write("\n");
      out.write("\t\t\treturn t == '0' ? false : true;\n");
      out.write("\t\t};\n");
      out.write("\n");
      out.write("\t\tvar tmp;\n");
      out.write("\t\tif ( tmp = get( 'configId' ) )\n");
      out.write("\t\t{\n");
      out.write("\t\t\tvar win = window.opener || window;\n");
      out.write("\t\t\ttry\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\twhile ( ( !win.CKFinder || !win.CKFinder._.instanceConfig[ tmp ] ) && win != window.top )\n");
      out.write("\t\t\t\t\twin = win.parent;\n");
      out.write("\n");
      out.write("\t\t\t\tif ( win.CKFinder._.instanceConfig[ tmp ] )\n");
      out.write("\t\t\t\t\tconfig = CKFINDER.tools.extend( {}, win.CKFinder._.instanceConfig[ tmp ] );\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcatch(e) {}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'basePath' ) )\n");
      out.write("\t\t\tCKFINDER.basePath = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'startupPath' ) || get( 'start' ) )\n");
      out.write("\t\t\tconfig.startupPath = decodeURIComponent( tmp );\n");
      out.write("\t\t\n");
      out.write("\t\tconfig.id = get( 'id' ) || '';\n");
      out.write("\n");
      out.write("\t\tif ( ( tmp = getBool( 'rlf' ) ) !== null )\n");
      out.write("\t\t\tconfig.rememberLastFolder = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( ( tmp = getBool( 'dts' ) ) !== null )\n");
      out.write("\t\t\tconfig.disableThumbnailSelection = tmp;\n");
      out.write("\t\t\n");
      out.write("\t\tif ( ( tmp = getBool( 'sm' ) ) !== null )\n");
      out.write("\t\t\tconfig.selectMultiple = tmp;\n");
      out.write("\t\t\n");
      out.write("\t\tif ( tmp = get( 'data' ) )\n");
      out.write("\t\t\tconfig.selectActionData = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'tdata' ) )\n");
      out.write("\t\t\tconfig.selectThumbnailActionData = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'type' ) )\n");
      out.write("\t\t\tconfig.resourceType = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'skin' ) )\n");
      out.write("\t\t\tconfig.skin = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( tmp = get( 'langCode' ) )\n");
      out.write("\t\t\tconfig.language = tmp;\n");
      out.write("\n");
      out.write("\t\tif ( typeof( config.selectActionFunction ) == 'undefined' )\n");
      out.write("\t\t{\n");
      out.write("\t\t\t// Try to get desired \"File Select\" action from the URL.\n");
      out.write("\t\t\tvar action;\n");
      out.write("\t\t\tif ( tmp = get( 'CKEditor' ) )\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tif ( tmp.length )\n");
      out.write("\t\t\t\t\taction = 'ckeditor';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif ( !action )\n");
      out.write("\t\t\t\taction = get( 'action' );\n");
      out.write("\n");
      out.write("\t\t\tvar parentWindow = ( window.parent == window ) ? window.opener : window.parent;\n");
      out.write("\t\t\tif (!parentWindow) parentWindow = window.parent.document;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif ( tmp = get( 'pwMf' ) )\n");
      out.write("\t\t\t\tparentWindow = parentWindow.mainFrame;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tswitch ( action )\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tcase 'js':\n");
      out.write("\t\t\t\t\tvar actionFunction = get( 'func' );\n");
      out.write("\t\t\t\t\tif ( actionFunction && actionFunction.length > 0 )\n");
      out.write("\t\t\t\t\t\tconfig.selectActionFunction = parentWindow[ actionFunction ];\n");
      out.write("\n");
      out.write("\t\t\t\t\tactionFunction = get( 'thumbFunc' );\n");
      out.write("\t\t\t\t\tif ( actionFunction && actionFunction.length > 0 )\n");
      out.write("\t\t\t\t\t\tconfig.selectThumbnailActionFunction = parentWindow[ actionFunction ];\n");
      out.write("\t\t\t\t\tbreak ;\n");
      out.write("\n");
      out.write("\t\t\t\tcase 'ckeditor':\n");
      out.write("\t\t\t\t\tvar funcNum = get( 'CKEditorFuncNum' );\n");
      out.write("\t\t\t\t\tif ( parentWindow['CKEDITOR'] )\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tconfig.selectActionFunction = function( fileUrl, data )\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\tparentWindow['CKEDITOR'].tools.callFunction( funcNum, fileUrl, data );\n");
      out.write("\t\t\t\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tconfig.selectThumbnailActionFunction = config.selectActionFunction;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tbreak;\n");
      out.write("\n");
      out.write("\t\t\t\tdefault:\n");
      out.write("\t\t\t\t\tif ( parentWindow && parentWindow['FCK'] && parentWindow['SetUrl'] )\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\taction = 'fckeditor' ;\n");
      out.write("\t\t\t\t\t\tconfig.selectActionFunction = parentWindow['SetUrl'];\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tif ( !config.disableThumbnailSelection )\n");
      out.write("\t\t\t\t\t\t\tconfig.selectThumbnailActionFunction = parentWindow['SetUrl'];\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse\n");
      out.write("\t\t\t\t\t\taction = null ;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tconfig.action = action;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar callback = get( 'cb' );\n");
      out.write("\t\t\tif ( callback && callback.length > 0 )\n");
      out.write("\t\t\t\tconfig.callback = parentWindow[ callback ];\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// Always use 100% width and height when nested using this middle page.\n");
      out.write("\t\tconfig.width = config.height = '100%';\n");
      out.write("\n");
      out.write("\t\tvar ckfinder = new CKFinder( config );\n");
      out.write("\t\tckfinder.replace( 'ckfinder', config );\n");
      out.write("\t\t\n");
      out.write("\t})();\n");
      out.write("\t//]]>\n");
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
    // /pages/sys/fileSys.jsp(12,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
