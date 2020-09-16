package com.bmsso.sages.sages.app;

import com.bmsso.sages.api.WealthListApp;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;
import java.util.Map;

/**
 * @Descrition: TODO
 * @Author:bmsso
 * @Data: 2020/8/27
 */
@Service
public class WealthListAppImpl implements WealthListApp {
    @Override
    public List<Map<String, Object>> wealthRank() {
        return null;
    }
}
