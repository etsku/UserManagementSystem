package UserManagementApplication.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
// READ ABOUT THREAD HANDLING IN JAVA
public class DatabaseOpener {
    private static SessionFactory sessionFactory = buildSessionFactory();

    // Build SessionFactory
    private static SessionFactory buildSessionFactory() {

        if (sessionFactory != null) {
            return sessionFactory;
        }

        if (sessionFactory == null) {
            try {

                // Hold different services by registybuilder
                StandardServiceRegistry standard_registry = new StandardServiceRegistryBuilder()
                        .configure()
                        .build();
                Metadata meta_data = new MetadataSources(standard_registry)
                        .getMetadataBuilder()
                        .build();
                sessionFactory = meta_data.getSessionFactoryBuilder().build();
            } catch (Throwable error) {
                error.printStackTrace();
                throw new ExceptionInInitializerError(error);

        }
    }
    return sessionFactory;
}





    // Object is not needed when static-keyword is used, just call class and function ( int result = Calculation.add(5,5)
    // Creates one copy, can still be given values multiple times without creating separate object
    // Reason to use static in SessionFactory is to access it without creating separate objects
    // GetSessionFactory provide access to SessionFactory, does not open it
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            sessionFactory = buildSessionFactory();
        }

        return sessionFactory;
    }

    // Close SessionFactory
    /*public static void shutdown(){
        if (sessionFactory != null) {
            sessionFactory.close();
            sessionFactory = null;
        }
    }*/
}
