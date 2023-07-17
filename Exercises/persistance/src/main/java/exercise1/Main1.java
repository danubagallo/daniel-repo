package exercise1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
    public static void main(String[] args) {
        // Use the test persistence unit to configure a new
// entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercise1");

// Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

// Used to test the database connection, should return 2
        System.out.println("Result: " +
                em.createNativeQuery("select 1 + 1").getSingleResult());

        em.getTransaction().begin();

        Exercise1 ex1 = new Exercise1();
        Exercise1 ex2 = new Exercise1();

        em.persist(ex1);
        em.persist(ex2);

        ex1.setAge(25);
        ex1.setName("Anita");

        ex2.setName("Daniel");
        ex2.setAge(34);

        em.getTransaction().commit();

        System.out.println(em.find(Exercise1.class, 1));
        System.out.println(em.find(Exercise1.class, 2));


// Close the database connection
        em.close();

// Shutdown JPA
        emf.close();
    }
}
