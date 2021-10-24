package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Team team = new Team();
            team.setName("Team_A");
//            team.getMembers().add(member); 2. 연관관계의 주인이 아닌곳에는 값을 뺐다.
            em.persist(team);

            Member member = new Member();
            member.setUsername("WooJ");
            member.setTeam(team); // 1. 연관관계의 주인인 곳에만 값을 넣고
            em.persist(member);


            em.flush();
            em.clear();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}

