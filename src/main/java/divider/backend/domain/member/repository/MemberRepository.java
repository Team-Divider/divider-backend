package divider.backend.domain.member.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import divider.backend.domain.member.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    public boolean existsByUsername(String username);

}