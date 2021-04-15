package hello.hellospring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.hellospring.domain.Member;

/* curong 2021. 4. 15. 오후 5:45:21  TODO ->    Spring 데이터 JPA      */
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long> , MemberRepository{

    @Override 
    Optional<Member> findByName(String name);

    
    
}
