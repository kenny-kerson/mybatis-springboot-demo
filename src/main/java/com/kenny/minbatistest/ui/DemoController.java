package com.kenny.minbatistest.ui;

import com.kenny.minbatistest.domain.DemoTable;
import com.kenny.minbatistest.infra.DemoTableMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoTableMapper demoTableMapper;

    public DemoController(DemoTableMapper demoTableMapper) {
        this.demoTableMapper = demoTableMapper;
    }

    @GetMapping("/demo")
    public void getDemoTable() {
        DemoTable demoTable = demoTableMapper.selectByPK("123");
        System.out.println( "__KENNY__ demoTable : " + demoTable.toString() );
    }
}
