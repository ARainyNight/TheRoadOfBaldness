package hn.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //数据的接收
        /**
         * 文件上传的基本操作
         * 1、创建一个磁盘文件项工厂对象
         * 2、创建一个核心解析类
         * 3、解析request请求，返回的是List集合，List集合中存放的是FileItem对象
         * 4、遍历集合，获得每个fileitem，判断是表单项还是文件上传项
         * */
            try{
                DiskFileItemFactory diskFileItemFactory =new DiskFileItemFactory();
                ServletFileUpload servletFileUpload =new ServletFileUpload(diskFileItemFactory);
                List<FileItem> list= servletFileUpload.parseRequest(request);

                //定义一个List集合，用于保存兴趣爱好数据
                List<String> hobbyList =new ArrayList<String>();

                for (FileItem fileItem :list){
                    if (fileItem.isFormField()){
                        //普通表单项
                        String name = fileItem.getFieldName();
                        String vlue = fileItem.getString("UTF-8");
                        System.out.println(name+":"+vlue);
                        //接收复选框的数据
                        if ("hobby".equals(name)){
                            String hobbyValue=fileItem.getString("UTF-8");
                            hobbyList.add(hobbyValue);

                        }
                    }else {
                        //文件上传项

                    }
                }
            }catch(FileUploadException e){
                e.printStackTrace();
            }
    }
}
