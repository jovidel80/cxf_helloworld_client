package com.joseoliveros.client;

import com.joseoliveros.HelloWorldService;
import com.joseoliveros.HelloWorldServiceImplService;
import com.joseoliveros.Mensaje;

public class App {

    public static void main(String[] args) {

        HelloWorldServiceImplService helloWorldServiceImplService = new HelloWorldServiceImplService();
        HelloWorldService helloWorldServiceImplPort = helloWorldServiceImplService.getHelloWorldServiceImplPort();
        Mensaje mensaje = helloWorldServiceImplPort.sayHello("Jovi");
        System.out.println(mensaje.getMensaje());
    }

}
