/**
 * 
 */
package hello.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;

/*  WooJ  2021. 4. 13. 오후 12:23:16  TODO  */
@Controller
public class MemberController {
    
    private final MemberService memberService;

    @Autowired
    /*  WooJ  2021 2021. 4. 13. 오후 12:28:42 @param memberService TODO     */
    public MemberController(MemberService memberService) {
	this.memberService = memberService;
    }
    
    @GetMapping("members/new")
    public String createForm() {
	return "members/createMemberForm";
    }
    
    @PostMapping("members/new")
    public String create(MemberForm form) {
	Member member = new Member();
	member.setName(form.getName());
	
	memberService.join(member);
	
	return "redirect:/";
    }
    
    @GetMapping("/members")
    public String list(Model model) {
	List<Member> members = memberService.findMembers();
	model.addAttribute("members", members);
	return "members/memberList";
    }
    
    
}
