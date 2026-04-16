package com.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorSmokeTest {

    @Test
    @DisplayName("冒烟测试：加法核心路径")
    void smokeAdd() {
        System.out.println("[SMOKE] 执行加法核心路径");
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    @DisplayName("冒烟测试：乘法核心路径")
    void smokeMultiply() {
        System.out.println("[SMOKE] 执行乘法核心路径");
        assertEquals(12, Calculator.multiply(3, 4));
    }
}
