package com.kenny.minbatistest.ui;

import com.kenny.minbatistest.domain.DemoTable;
import com.kenny.minbatistest.domain.DemoTableRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    private final DemoTableRepository demoTableRepository;

    public DemoController(DemoTableRepository demoTableRepository) {
        this.demoTableRepository = demoTableRepository;
    }

    @GetMapping("/demo")
    public void getDemoTable() {
        DemoTable demoTable = demoTableRepository.selectByPK("kenny");
        log.debug( "__KENNY__ demoTable : {}", demoTable );
    }
}
