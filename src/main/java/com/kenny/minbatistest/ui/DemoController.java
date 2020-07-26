package com.kenny.minbatistest.ui;

import com.kenny.minbatistest.domain.DemoTable;
import com.kenny.minbatistest.domain.DemoTableRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoTableRepository demoTableRepository;

    public DemoController(DemoTableRepository demoTableRepository) {
        this.demoTableRepository = demoTableRepository;
    }

    @GetMapping("/demo")
    public void getDemoTable() {
        DemoTable demoTable = demoTableRepository.selectByPK("123");
        System.out.println( "__KENNY__ demoTable : " + demoTable.toString() );
    }
}
