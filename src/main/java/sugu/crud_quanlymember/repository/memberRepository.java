package sugu.crud_quanlymember.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sugu.crud_quanlymember.entity.members;

@Repository
public interface memberRepository extends JpaRepository<members,Long> {
}
