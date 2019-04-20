package com.sda.example;

import com.sda.example.Production.Tool;
import com.sda.example.Production.Worker;
import com.sda.example.Production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class FirstProject {

    public static void main(final String[] args) {
        String[] beans = new String[] {"tools.xml", "worker.xml", "workerMotto.xml"};

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        // ApplicationContext annotationApplicationContext = new ApplicationContext(AppConfig.class);
        Worker testWorker = xmlApplicationContext.getBean(Worker.class);
        WorkerMotto testWorkerMotto = xmlApplicationContext.getBean(WorkerMotto.class);
        Tool testTool = xmlApplicationContext.getBean(Tool.class);

        List<Tool> tools = xmlApplicationContext.getBean("tools", ArrayList);

    }
}
