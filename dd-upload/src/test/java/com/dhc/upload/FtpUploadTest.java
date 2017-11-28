package com.dhc.upload;

//import com.dhc.ddshop.common.util.FtpUtils;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//
///**
// * User: DHC
// * Date: 2017/11/16
// * Time: 11:22
// * Version:V1.0
// */
//public class FtpUploadTest {
////    @Test
////    public void testFTPClient() throws Exception {
////        //创建一个FTP客户端对象
////        FTPClient ftpClient = new FTPClient();
////        //发送链接
////        ftpClient.connect("10.31.161.26", 21);
////        //使用登录方法
////        ftpClient.login("ftpuser1", "dhc890dhc");
////        //封装一个输入流
////        FileInputStream fs = new FileInputStream(new File("d:\\87890.jpg"));
////        //配置上传参数
////        //配置上传到的路径
////        ftpClient.changeWorkingDirectory("/home/ftpuser1/www/images");
////        //设置文件类型为二进制
////        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
////        //执行上传方法,hello.jpg为上传的文件名称
////        ftpClient.storeFile("hello.jpg", fs);
////        //释放资源
////        fs.close();
////        ftpClient.logout();
////    }
//
//    @Test
//    public void testFtpUtils() throws Exception {
//        FileInputStream fs = new FileInputStream(new File("d:\\87890.jpg"));
//        boolean bool = FtpUtils.uploadFile("192.168.31.179", 21, "ftpuser1", "dhc890dhc", "/home/ftpuser1/www/images", "/2017/11/16", "hello2.jpg", fs);
//        System.out.println(bool);
//        fs.close();
//    }
//
//}
