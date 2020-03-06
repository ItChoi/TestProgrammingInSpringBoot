package hellojpa.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		try {
			
			Team team = new Team();
			team.setName("teamA");
			em.persist(team);
			
			Member member = new Member();
			member.setUsername("member1");
			member.setAge(10);
			member.setTeam(team);
			em.persist(member);
			
			em.flush();
			em.clear();
			
			// String query = "select m from Member m inner join m.team t";
			// String query = "select m from Member m left join m.team t on t.name = 'teamA'";
			String query = "select m from Member m left join Team t on m.username = t.name";
			
			List<Member> result = em.createQuery(query, Member.class)
									.setFirstResult(1)
									.setMaxResults(10)
									.getResultList();
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

	}

}
