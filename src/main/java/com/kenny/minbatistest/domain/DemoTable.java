package com.kenny.minbatistest.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@RequiredArgsConstructor
public class DemoTable {
    private final String id;
    private final String amount;
    private final String count;
    private final String bcount;
    private final String name;
}
