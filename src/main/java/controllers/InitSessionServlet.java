package controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;


/**
 * Servlet implementation class InitSessionServlet.
 */
@WebServlet("/index.html")
public final class InitSessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Creates a new InitSessionServlet.
     *
     * @see HttpServlet#HttpServlet()
     */
    public InitSessionServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        List<Locale> supported = Arrays.asList(new Locale("no") ,Locale.ENGLISH, Locale.GERMAN);

        // Locales supported by the client (ordered by preference):
        List<Locale> accepted = Collections.list(request.getLocales());

        // determine best locale for the client
        Locale locale = Locale.ENGLISH;  // fallback default
        outerloop:
        for (Locale a: accepted)
            for (Locale s: supported)
                if (s.equals(a)) {
                    locale = a;
                    break outerloop;
                }
        

        response.setContentType("text/plain; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setLocale(locale);    
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
