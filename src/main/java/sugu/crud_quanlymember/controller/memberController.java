package sugu.crud_quanlymember.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sugu.crud_quanlymember.entity.members;
import sugu.crud_quanlymember.service.ImemberService;

import java.util.List;

@RestController
@RequestMapping("/member")
public class memberController {
    @Autowired
    private ImemberService imemberService;

    @PostMapping("/add")
    public members addMember(@RequestBody members members) {
        return imemberService.addMember(members);
    }
    @PutMapping("/update")
    public members updateMember(@RequestParam("id") long id, @RequestBody members members) {
        return imemberService.updateMember(id ,members);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteMember(@PathVariable("id") long id) {
        return imemberService.deleteMember(id);
    }

    @GetMapping("/list")
    public List<members> getListMember() {
        return imemberService.getAllMember();
    }

}
