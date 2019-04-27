import com.infoshare.academy.model.User;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.core.UriBuilder;

public class Test {

    private static String SERVICE = "http://localhost:81/rest/";


    @org.junit.Test
    public void testGetUsersByProxy(){

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(UriBuilder.fromPath(SERVICE));

        UserService proxy = target.proxy(UserService.class);

        proxy.getUsers().forEach(
                user -> System.out.println(user.getName())
        );

    }

    @org.junit.Test
    public void testAddUsersByProxy(){

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(UriBuilder.fromPath(SERVICE));

        UserService proxy = target.proxy(UserService.class);

        proxy.addUser(new User());

    }

    @org.junit.Test
    public void deleterUsersByProxy(){

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(UriBuilder.fromPath(SERVICE));

        UserService proxy = target.proxy(UserService.class);

        proxy.deleteUser(6);

    }


}
