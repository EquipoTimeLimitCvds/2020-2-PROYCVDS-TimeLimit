package edu.eci.cvds.TimeLimit.services;

import com.google.inject.Injector;

import edu.eci.cvds.TimeLimit.Persistence.UserDAO;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.MyBatisUser;
import edu.eci.cvds.TimeLimit.authenticator.SessionLogger;
import edu.eci.cvds.TimeLimit.authenticator.ShiroSession;
import edu.eci.cvds.TimeLimit.services.impl.UserServicesImpl;
import org.mybatis.guice.XMLMyBatisModule;

import java.util.Optional;

import static com.google.inject.Guice.createInjector;

public class ServicesFactory {

    private static ServicesFactory instance= new ServicesFactory();

    private static Optional<Injector> optInjector=Optional.empty();


    private Injector myBatisInjector(final String env, final String pathResource) {
        return createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(UserDAO.class).to(MyBatisUser.class);
                bind(UserServices.class).to(UserServicesImpl.class);
                bind(SessionLogger.class).to(ShiroSession.class);
            }
        });
    }
    public SessionLogger getLoginServices(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(SessionLogger.class);
    }

    public static ServicesFactory getInstance(){
        return instance;
    }
    public UserServices getUserServices(){
        if (!optInjector.isPresent()) {
            optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }

        return optInjector.get().getInstance(UserServices.class);
    }
}
