package pr12;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfiguration.class);
        ctx.refresh();

        MyBean mb1 = ctx.getBean(MyBean.class);
        ctx.close();
    }
}
