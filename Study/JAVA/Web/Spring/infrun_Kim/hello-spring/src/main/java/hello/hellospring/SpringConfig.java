/**
 * 
 */
package hello.hellospring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;

@Configuration
/* WooJ  2021. 4. 13. 오후 12:43:49  TODO  수동으로 빈 생성을 위함  */
public class SpringConfig {
    
    private DataSource dataSource;
    
    
    @Autowired
    public SpringConfig(DataSource dataSource) {
	this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
	return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//	return new MemoryMemberRepository();
	return new JdbcMemberRepository(dataSource);
    }
    
//    처음 스프링이 올라 올 때 스프링 빈에 서비스와 레파지토리를 서비스에 넣어준다.
}
