////<!DOCTYPE html>
////        html>
////        <head>
////        <title>TODO supply a title</title>
////        <meta charset="UTF-8">
////        <meta name="viewport" content="width=device-width, initial-scale=1.0">
////        </head>
////        <body>
////        <form method="get" action="CookieServlet">
////        Name: <input type="text" name="name"><br><br>
////        Age: <input type="text" name="age">
////        <input type="submit">
////        </form>
////        </body>
////        </html>
////        HelloServlet.java
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//public class HelloServlet extends HttpServlet {
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try ( PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            int age = Integer.parseInt(request.getParameter("age"));
//            String res="";
//            if(age>18)
//                res = " can have beer";
//            else
//                res = " cant have beer";
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet HelloServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Hello "+ request.getParameter("name")+ res + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//}
