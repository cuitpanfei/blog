package com.pf.blog.entity.withblobs;

import com.pf.blog.entity.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserWithBLOBs extends User {
    private String hobbies;

    private String birthday;

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies == null ? null : hobbies.trim();
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 如果两个用户的用户名、用户id、用户注册邮箱以及用户年龄相同，就认为两个用户是相同的
     */
    public boolean equals(UserWithBLOBs user){
        boolean flag = false;
        if(this.getUsername().equals(user.getUsername())&&//用户名相同
                this.getUserid()==user.getUserid()&&      //用户id相同
                this.getEmail().equals(user.getEmail())&& //用户注册邮箱相同
                this.getAge() == user.getAge()) {         //用户年龄相同
            flag = true;
        }
        return flag;
    }
}
