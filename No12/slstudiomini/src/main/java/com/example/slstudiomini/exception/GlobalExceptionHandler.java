package com.example.slstudiomini.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        ModelAndView mav = new ModelAndView("/error/custom-error");
        mav.addObject("errorMassage", "開発者の恥です。ごめんなさい。");
        return mav;
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public Object DataIntegrityViolationException(Exception ex) {
        ModelAndView mav = new ModelAndView("/error/custom-error");
        mav.addObject("errorMassage", "ユニーク性違反でエラーが出た可能性があります");
        return mav;
    }

    @ExceptionHandler(MyUniqueConstraintViolationException.class)
    public Object handleMyUniqueConstraintViolationException(Exception ex) {
        ModelAndView mav = new ModelAndView("error/custom-error");
        mav.addObject("errorMessage", ex.getMessage());
        return mav;
    }

    // @ExceptionHandler(NoResourceFoundException.class)
    // public Object NoResourceFoundException(Exception ex) {
    // ModelAndView mav = new ModelAndView("/error/custom-error");
    // mav.addObject("errorMassage", "存在しないコースです");
    // return mav;
    // }
}
