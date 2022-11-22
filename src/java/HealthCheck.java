/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Health;
import model.HealthCheckLogic;

/**
 *
 * @author abi05
 */
@WebServlet(urlPatterns = {"/HealthCheck"})
public class HealthCheck extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        
        
    }

    // <editor-fold defaultstate="expand" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");        
       
        //healthCheck.jspにフォワード
        RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");//絶対パス
       dispatcher.forward(request,response);        

        
//        
//        String height = request.getParameter("height");
//        String weight = request.getParameter("weight");
//        
//        //属性の設定方法
//        request.setAttribute("bmi", 19.5);
//        
//        //属性の取得
//        Double d= (Double)request.getAttribute("bmi");
        
           }
        
        
    
    
    
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        double height = Double.parseDouble(request.getParameter("height"));
        double weight = Double.parseDouble(request.getParameter("weight"));        
//        double bmi = weight / Math.pow(height, 2.0);
//        
//        //属性の設定方法
//        request.setAttribute("bmi", bmi); //bmiはdouble
//        //                                              ↓「ボクシング」昨日で自動的にラッパークラスに変換
//        //request.setAttribute("bmi", new Double(bmi));        
//        
//        
//        //属性の取得
////        Double d= (Double)request.getAttribute("bmi");
        
//Health JavaBeansのインスタンス作成
        Health health = new Health(height, weight);
        
//BMIの計算        
        HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
        healthCheckLogic.execute(health);

//リクエストスコープに health JavaBeansを追加        
        request.setAttribute("health",health);

        //healthCheckResult.jspにフォワード
        RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");//絶対パス
       dispatcher.forward(request,response);             
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
