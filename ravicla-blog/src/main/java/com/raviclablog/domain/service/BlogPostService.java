package com.raviclablog.domain.service;

import com.raviclablog.domain.BlogPost;
import com.raviclablog.domain.repository.BlogPostRepository;
import com.raviclablog.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    private static final Logger log = LoggerFactory.getLogger(BlogPostService.class);

    @Autowired
    private JsonUtil jsonUtil;


}
