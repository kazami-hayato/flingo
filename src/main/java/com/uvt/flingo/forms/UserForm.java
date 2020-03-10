package com.uvt.flingo.forms;

import com.uvt.flingo.common.FormFromEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class UserForm implements FormFromEntity<User> {

    private String userName;
    private String password;

    @Override
    public UserForm fromEntity() {
        return UserForm.builder().build();
    }
}
