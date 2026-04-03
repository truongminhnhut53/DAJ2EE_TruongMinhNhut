package com.example.medcare.controller;

import com.example.medcare.model.User;
import com.example.medcare.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserRepository repo;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user,
                           @RequestParam("confirmPassword") String confirmPassword,
                           Model model) {
        if (!user.getPassword().equals(confirmPassword)) {
            model.addAttribute("error", "Mật khẩu nhập lại không khớp!");
            return "register";
        }
        
        if (repo.existsByUsername(user.getUsername())) {
            model.addAttribute("error", "Tên đăng nhập này đã tồn tại!");
            return "register";
        }
        
        if (user.getEmail() != null && !user.getEmail().isEmpty() && repo.existsByEmail(user.getEmail())) {
            model.addAttribute("error", "Email này đã được đăng ký cho tài khoản khác!");
            return "register";
        }
        
        if (user.getPhone() != null && !user.getPhone().isEmpty() && repo.existsByPhone(user.getPhone())) {
            model.addAttribute("error", "Số điện thoại này đã được đăng ký!");
            return "register";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        repo.save(user);
        return "redirect:/login";
    }

    @GetMapping("/forgot-password")
    public String forgotPasswordForm() {
        return "forgot-password";
    }

    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestParam("username") String username,
                                 @RequestParam("phone") String phone,
                                 @RequestParam("newPassword") String newPassword,
                                 @RequestParam("confirmNewPassword") String confirmNewPassword,
                                 Model model) {
        if (!newPassword.equals(confirmNewPassword)) {
            model.addAttribute("error", "Mật khẩu mới nhập lại không khớp!");
            model.addAttribute("enteredUsername", username);
            model.addAttribute("enteredPhone", phone);
            return "forgot-password";
        }
        if (newPassword.length() < 6) {
            model.addAttribute("error", "Mật khẩu mới phải có ít nhất 6 ký tự!");
            model.addAttribute("enteredUsername", username);
            model.addAttribute("enteredPhone", phone);
            return "forgot-password";
        }
        var userOpt = repo.findByUsernameAndPhone(username, phone);
        if (userOpt.isEmpty()) {
            model.addAttribute("error", "Không tìm thấy tài khoản với tên đăng nhập và số điện thoại này!");
            model.addAttribute("enteredUsername", username);
            model.addAttribute("enteredPhone", phone);
            return "forgot-password";
        }
        User foundUser = userOpt.get();
        foundUser.setPassword(passwordEncoder.encode(newPassword));
        repo.save(foundUser);
        return "redirect:/login?resetSuccess";
    }
}