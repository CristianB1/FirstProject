package com.sda.example;

import com.sda.example.Production.Tool;
import com.sda.example.Production.Worker;
import com.sda.example.Production.WorkerConfig;
import com.sda.example.Production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FirstProject {

    public static void main(final String[] args) {
        String[] beans = new String[] {"tools.xml", "worker.xml", "workerMotto.xml"};

        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
        // ApplicationContext annotationApplicationContext = new ApplicationContext(AppConfig.class);
        Worker testWorker = xmlApplicationContext.getBean(Worker.class);
        System.out.println("\n\n" + testWorker + "\n\n");

        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(WorkerConfig.class);

        WorkerMotto annotationWorkerMotto = annotationApplicationContext.getBean(WorkerMotto.class);
        System.out.println("\n\n" + annotationWorkerMotto + "\n\n");

//        WorkerMotto testWorkerMotto = xmlApplicationContext.getBean(WorkerMotto.class);
//        Tool testTool = xmlApplicationContext.getBean(Tool.class);

//        List<Tool> tools = xmlApplicationContext.getBean("tools", ArrayList.class);
//        System.out.println("This is the set of tools created by Spring Ioc container from xml:\n " + Array.toString(tools.toArray()));
//
//        Worker worker1 = xmlApplicationContext.getBean(Worker.class);
//        System.out.println("This is a worker created by Spring container from xml:\n " + worker1);
//
//        Worker worker2 = xmlApplicationContext.getBean(Worker.class);
//        System.out.println("This is a worker created by Spring container from xml:\n " + worker2);

    }
}
