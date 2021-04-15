package hello.hellospring.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;


/* curong 2021 2021. 4. 12. 오전 11:20:46  TODO Spring과 엮어서 Test 파일을 만들기 위함 */
@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {
    /* 테스트는 과감하게 한글로 작성해도 무리가 없다. */
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;
    
    
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

}
