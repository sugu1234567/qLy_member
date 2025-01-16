package sugu.crud_quanlymember.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sugu.crud_quanlymember.entity.members;
import sugu.crud_quanlymember.repository.memberRepository;

import java.util.List;


@Service
public class memberServiceImpl implements ImemberService{
    @Autowired
    private memberRepository memberRepository;


    @Override
    public members addMember(members members) {
        if (members != null){
            members = memberRepository.save(members);
        }

        return members;
    }

    @Override
    public members updateMember(long id, members members) {
        if (members != null){
            members members1 = memberRepository.findById(id).get();
            if (members1 != null){
                members1.setName(members.getName());
                members1.setAge(members.getAge());
                members1.setGender(members.getGender());
                members1.setJoinDay(members.getJoinDay());
                members1.setYearOfWork(members.getYearOfWork());
                return memberRepository.save(members1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteMember(long id) {
        if (id != 0){
            memberRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<members> getAllMember() {
        return memberRepository.findAll();
    }
}
