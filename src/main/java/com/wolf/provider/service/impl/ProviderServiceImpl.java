package com.wolf.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wolf.common.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service
@Component
public class ProviderServiceImpl implements ProviderService {
    private static Logger logger = LoggerFactory.getLogger(ProviderServiceImpl.class);
    @Override
    public void testDubbo() {
        logger.info("dubbo provider");
    }
}
