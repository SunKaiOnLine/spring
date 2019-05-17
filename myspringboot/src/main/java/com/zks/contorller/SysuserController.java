package com.zks.contorller;




import com.zks.domain.Sysuser;
import com.zks.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class SysuserController {

    @Autowired
    SysuserService sysuserService;


    @PostMapping("login")
    @ResponseBody
    public Object login(@RequestBody Sysuser sysuser){


        return sysuserService.findByUsernameAndPassword(sysuser.getUsername(),sysuser.getPassword());
    }


}
