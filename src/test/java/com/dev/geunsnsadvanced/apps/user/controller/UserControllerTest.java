package com.dev.geunsnsadvanced.apps.user.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.dev.geunsnsadvanced.apps.user.data.request.UserJoinRequest;
import com.dev.geunsnsadvanced.apps.user.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    UserService userService;

    @Test
    @DisplayName("회원가입")
    void 회원가입() throws Exception {

        String userName = "userName";
        String password = "password";

        mockMvc.perform(post("/api/v1/users/join")
                            .with(csrf())
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsBytes(new UserJoinRequest(userName, password)))
            ).andDo(print())
            .andExpect(status().isOk());
    }

    @Test
    @DisplayName("회원가입 실패 (Username 중복)")
    void 회원가입_실패_Username_중복() throws Exception {

        String userName = "userName";
        String password = "password";

        mockMvc.perform(post("/api/v1/users/join")
                            .with(csrf())
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(objectMapper.writeValueAsBytes(new UserJoinRequest(userName, password)))
            ).andDo(print())
            .andExpect(status().isConflict());
    }
}