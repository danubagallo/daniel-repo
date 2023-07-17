package exercise2;

import exercise1.Exercise1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main2 {
    public static void main(String[] args) {
        // Use the test persistence unit to configure a new
// entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercise2");

// Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

        Student st1 = new Student();
        Student st2 = new Student();

        em.getTransaction().begin();

        em.persist(st1);
        em.persist(st2);

        st1.setName("Daniel");
        st1.setAddress("Rua do João", "Rio de Janeiro", "4700");

        st2.setName("Anita");
        st2.setAddress("Rua do Vinicius","Braga","4545");

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}