package sugu.crud_quanlymember.service;

import sugu.crud_quanlymember.entity.members;

import java.util.List;

public interface ImemberService {
    //add
    public members addMember(members members);
    //update
    public members updateMember(long id , members members);
    //delete
    public boolean deleteMember(long id);
    //list
    public List<members> getAllMember();
}
