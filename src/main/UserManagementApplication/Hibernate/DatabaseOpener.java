package UserManagementApplication.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DatabaseOpener {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            if (sessionFactory == null) {
                // Hold different services by registybuilder
                StandardServiceRegistry standard_registry = new StandardServiceRegistryBuilder()
                        .configure()
                        .build()
                Metadata meta_data = new MetadataSources(standard_registry)
                        .getMetadataBuilder()
                        .build()
                SessionFactory = meta_data.getSessionFactoryBuilder().build();


            }
            return SessionFactory;

        } catch (Throwable error) {
            throw new ExceptionInInitializerError(error);
        }


    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void shutdown(){
        getSessionFactory().close();
    }
}
