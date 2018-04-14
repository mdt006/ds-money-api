package com.ds.money;

import java.io.File;

import com.ds.money.service.MoneyLogService;

        import org.apache.log4j.PropertyConfigurator;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.jms.TextMessage;

public class Main
{
    private static ApplicationContext ac;

    public static void main(String[] args)
            throws Exception
    {

        PropertyConfigurator.configure("resources" + File.separator + "log4j.properties");
        ac =
                new FileSystemXmlApplicationContext("resources" + File.separator + "applicationContext.xml",
                        "resources" + File.separator + "activemq.xml");
        MoneyLogService logService = (MoneyLogService)ac.getBean("moneyLogService");
        logService.start();
    }
}
