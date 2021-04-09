package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

public class MemoryMemberRepositoryTests {
	
	MemberRepository repository = new MemoryMemberRepository();
		
		@Test
		public void save() {
			Member member = new Member();
			member.setName("Spring");
			
			repository.save(member);
			
			Member result = repository.findById(member.getId()).get();
			
//			System.out.println("result = " + (result == member));
//			Assertions.assertEquals(member,	result);
			Assertions.assertThat(member).isEqualTo(result);
			assertThat(member).isEqualTo(result);
		}
		
		
		@Test
		public void findByName() {
			Member member1 = new Member();
			member1.setName("spring1");
			repository.save(member1);
			
			Member member2 = new Member();
			member2.setName("spring2");
			repository.save(member2);
			
			Member result = repository.findByName("spring2").get();
			assertThat(result).isEqualTo(member1);

		}
		
		@Test
		public void findAll() {
			Member member1 = new Member();
			member1.setName("spring1");
			repository.save(member1);
			
			Member member2 = new Member();
			member2.setName("spring2");
			repository.save(member2);
			
			List<Member> res = repository.findAll();
			
			assertThat(res.size()).isEqualTo(3);

		}
		
	}
