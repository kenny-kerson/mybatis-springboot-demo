package com.kenny.minbatistest.infra;

import com.kenny.minbatistest.domain.DemoTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoTableMapper {
    DemoTable selectByPK(String key1 );
}