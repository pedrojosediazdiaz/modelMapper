package com.example.modelMapper.demo.modelMapper.controllers;

import com.example.modelMapper.demo.modelMapper.models.User;
import jakarta.servlet.ServletContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(SettingsController.class)
class SettingsControllerTest {

    //@Autowired
    private MockMvc mockMvc;

    private SettingsController settingsController;

    @BeforeEach
    void setup () {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new SettingsController()).build();
    }

//    @Test
//    void getBuyerManualUnderwrittingSettings() throws Exception{
//
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/underwriting/settings/manual"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.result").exists())
//                .andReturn();
//    }
}