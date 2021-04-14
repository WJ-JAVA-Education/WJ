/**
 * 
 */
package hello.hellospring.service;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Test.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;


/* curong 2021 2021. 4. 12. 오전 11:20:46  TODO 멤버 서비스 테스트를 위한 Test 클래스 */
class MemberServiceTest {
    /* 테스트는 과감하게 한글로 작성해도 무리가 없다. */
    MemberService memberService;
    MemoryMemberRepository memberRepository;
    
    @BeforeEach
    /* WooJ 2021 2021. 4. 13. 오전 11:30:42 TODO -> 생성자 주입을 위함	*/
    private void beforEach() {
	memberRepository = new MemoryMemberRepository();
	memberService = new MemberService(memberRepository);

    }
    
    /* WooJ 2021 2021. 4. 13. 오전 11:18:06 TODO -> 테스트를 돌릴 때 초기화 */	
    @AfterEach
    private void afterEach() {
	memberRepository.clearStore();
    }
    
    @Test
    void 회원가입() {
	//given
	Member member = new Member();
	member.setName("hello");
	
	//when
	Long saveId = memberService.join(member);
	
	//then
	memberService.findOne(saveId).get();
	assertThat(member.getName()).isEqualTo(member.getName());
    }
    
    @Test
    public void 중복_회원_예외() {
	//given
	Member member1 = new Member();
	member1.setName("spring");
	
	Member member2 = new Member();
	member2.setName("spring");
	
	//when
	
	memberService.join(member1);	// 1까지는 정상작동
	IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
	
	assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
	/*
	 
	try {
	    memberService.join(member2);	// 2부터 예외가 터져야한다
	    fail(null);
	} catch (IllegalStateException e) {
	    assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다. 123123123");
	}
	
	*/
	
	//then 
    }

    @Test
    void testFindMembers() {
    }

    @Test
    void testFindOne() {
    }

}
