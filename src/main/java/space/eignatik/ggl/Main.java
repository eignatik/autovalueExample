package space.eignatik.ggl;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Main {

    @Inject public HelloService helloService;

    public static void main(String[] args) {
        Main main = new Main();
        Module module = new MainModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);

        main.start();
    }

    public void start() {
        // your actual point of application start
        helloService.doSomething();
    }

}
