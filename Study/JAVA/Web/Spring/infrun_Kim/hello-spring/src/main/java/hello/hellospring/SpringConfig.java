/**
 * 
 */
package hello.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;

@Configuration
/* WooJ 2021. 4. 13. 오후 12:43:49 TODO 수동으로 빈 생성을 위함 */
public class SpringConfig {

    private final MemberRepository memberRepository;
//    private DataSource dataSource;
//    private EntityManager em;

    /* curong 2021. 4. 15. 오후 6:15:09 TODO -> */
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
	this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {return new MemberService(memberRepository); }

//    @Bean
//    public MemberRepository memberRepository() {
//	return new MemoryMemberRepository();
//	return new JdbcMemberRepository(dataSource);
//	return new JdbcTemplateMemberRepository(dataSource);
//	return new JpaMemberRepository(em);

//}
    
//    @Bean
//    public TimeTraceAop timeTraceAop(){
//	return new TimeTraceAop();
//    }

//    처음 스프링이 올라 올 때 스프링 빈에 서비스와 레파지토리를 서비스에 넣어준다.
}
