/**
 * 
 */
package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

/*  curong 2021. 4. 12. 오전 10:17:19  TODO 회원 서비스  */
public class MemberService {
    
    // 회원가입
    private final MemberRepository memberRepository;
    
    public MemberService(MemberRepository memberRepository) {
	this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
	// 같은 이름이 있는 중복 회원 X
	validateDuplicateMember(member); // 중복 회원 검증
	memberRepository.save(member);
	return member.getId();
    }

    private void validateDuplicateMember(Member member) {
	memberRepository.findByName(member.getName()).	ifPresent(m -> {
	    throw new IllegalStateException("이미 존재하는 회원입니다.");
	});
    }
	    
    /* curong 2021 2021. 4. 12. 오전 11:14:47 TODO 전체 회원 조회 */
    public List<Member> findMembers(){
	return memberRepository.findAll();
    }
    
    public Optional<Member> findOne(Long memberId){
	return memberRepository.findById(memberId);
    }
}
