package ru.ac.uniyar.mf.summer;
import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Web-приложение в котором регистрируются все ресурсы.
 */
public class WebApplication extends Application {

    private List<String> list = new ArrayList<>();
    private Node root;

    public WebApplication() {
        root = new Node("Корень");
        root.add_node(new Node("Лист"));
        root.addl("aaa");
        root.addl("bbb");
        root.addl("ccc");
        root.addl("ddd");
    }
    /**
     * Возвращает список всех ресурсов web-приложения.
     * @return список всех ресурсов web-приложения.
     */
    @Override
    public Set<Object> getSingletons() {
        Set<Object> resources = new HashSet<>();
        resources.add(new ListPresentationController(list, root));
        return resources;
    }
}
