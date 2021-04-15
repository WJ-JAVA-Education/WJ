/**
 * 
 */
package hello.hellospring.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import hello.hellospring.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    /* curong 2021. 4. 15. 오전 3:17:29 TODO -> 데이터베이스 연결을 위함 */
    
    @Autowired
    public JdbcTemplateMemberRepository(DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Member save(Member member) {
	/* curong 2021. 4. 15. 오전 3:10:41 TODO -> 데이터베이스에 저장하는 쿼리문 */

	SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
	jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");

	Map<String, Object> parameters = new HashMap<>();
	parameters.put("name", member.getName());

	Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
	member.setId(key.longValue());
	return member;
    }

    /* curong 2021. 4. 15. 오전 3:42:00 TODO ->    ID로 조회      */
    @Override
    public Optional<Member> findById(Long id) {
	List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(), id);
			return result.stream().findAny();
    }

    /* curong 2021. 4. 15. 오전 3:42:15 TODO ->     전체조회     */
    @Override
    public List<Member> findAll() {
	return jdbcTemplate.query("select * from member", memberRowMapper());
    }

    @Override
    public Optional<Member> findByName(String name) {
	List<Member> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(), name);
			return result.stream().findAny();
    }

    /* curong 2021. 4. 15. 오전 3:41:26 TODO ->     객체생성     */
    private RowMapper<Member> memberRowMapper() {
	return (rs, rowNum) -> {
	    Member member = new Member();
	    member.setId(rs.getLong("id"));
	    member.setName(rs.getString("name"));
	    return member;
	};
    }
}