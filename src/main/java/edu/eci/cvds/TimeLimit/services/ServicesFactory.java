package edu.eci.cvds.TimeLimit.services;

import com.google.inject.Injector;

import edu.eci.cvds.TimeLimit.Persistence.*;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.*;
import edu.eci.cvds.TimeLimit.authenticator.SessionLogger;
import edu.eci.cvds.TimeLimit.authenticator.ShiroSession;
import edu.eci.cvds.TimeLimit.services.impl.ElementoServicesImpl;
import edu.eci.cvds.TimeLimit.services.impl.LaboratoriosServiceImpl;
import edu.eci.cvds.TimeLimit.services.impl.EquipoServicesImpl;
import edu.eci.cvds.TimeLimit.services.impl.NovedadServicesImpl;
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
                bind(ElementoDao.class).to(MyBatisElemento.class);
                bind(ElementoServices.class).to(ElementoServicesImpl.class);
                bind(NovedadDao.class).to(MyBatisNovedad.class);
      
                bind(NovedadServices.class).to(NovedadServicesImpl.class);
                bind(EquipoDao.class).to(MyBatisEquipo.class);
                bind(EquipoServices.class).to(EquipoServicesImpl.class);
                bind(LaboratoriosDao.class).to(MyBatisLaboratorios.class);
                bind(LaboratorioServices.class).to(LaboratoriosServiceImpl.class);
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

    public ElementoServices getElementoServices(){
        if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
        }
        return optInjector.get().getInstance(ElementoServices.class);
    }
    
    public EquipoServices getEquipoServices(){
        if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("test","mybatis-config-h.xml"));
        }
        return optInjector.get().getInstance(EquipoServices.class);
    }
    public NovedadServices getNovedadServices(){
        if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
        }
        return optInjector.get().getInstance(NovedadServices.class);
    }
	public LaboratorioServices getLaboratorioServices() {
		if(!optInjector.isPresent()){
            optInjector=Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
        }
        return optInjector.get().getInstance(LaboratorioServices.class);
	}
}
