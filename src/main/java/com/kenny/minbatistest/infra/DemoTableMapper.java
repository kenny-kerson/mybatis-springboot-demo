package com.kenny.minbatistest.infra;

import com.kenny.minbatistest.domain.DemoTable;
import com.kenny.minbatistest.domain.DemoTableRepository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTableMapper extends DemoTableRepository {
    DemoTable selectByPK( String key1 );
}