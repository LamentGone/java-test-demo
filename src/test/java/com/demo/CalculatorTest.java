package com.demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Calculator 功能测试用例
 * 可用于本地 test 任务完整回归。
 */
class CalculatorTest {
    
    @BeforeAll
    static void setUp() {
        System.out.println("=== 开始执行 Calculator 功能测试 ===");
        System.out.println("执行时间：" + java.time.LocalDateTime.now());
    }
    
    @AfterAll
    static void tearDown() {
        System.out.println("=== Calculator 功能测试执行完毕 ===");
    }
    
    // ========== 正常功能的测试 ==========
    
    @Test
    @DisplayName("测试加法功能 - 正常情况")
    void testAdd() {
        System.out.println(">>> 执行测试：加法");
        assertEquals(5, Calculator.add(2, 3), "2 + 3 应该等于 5");
        assertEquals(0, Calculator.add(-1, 1), "-1 + 1 应该等于 0");
        assertEquals(-5, Calculator.add(-2, -3), "-2 + -3 应该等于 -5");
    }
    
    @Test
    @DisplayName("测试减法功能 - 正常情况")
    void testSubtract() {
        System.out.println(">>> 执行测试：减法");
        assertEquals(2, Calculator.subtract(5, 3), "5 - 3 应该等于 2");
        assertEquals(-2, Calculator.subtract(1, 3), "1 - 3 应该等于 -2");
        assertEquals(0, Calculator.subtract(10, 10), "10 - 10 应该等于 0");
    }
    
    @Test
    @DisplayName("测试除法功能 - 除数为0时抛出异常")
    void testDivideByZero() {
        System.out.println(">>> 执行测试：除法（异常分支）");
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        }, "除数为0时应抛出 ArithmeticException");
    }
    
    @Test
    @DisplayName("测试除法功能 - 正常情况")
    void testDivideNormal() {
        System.out.println(">>> 执行测试：除法（正常分支）");
        assertEquals(2, Calculator.divide(6, 3), "6 / 3 应该等于 2");
        assertEquals(0, Calculator.divide(0, 5), "0 / 5 应该等于 0");
    }
    
    @Test
    @DisplayName("测试乘法功能 - 正常情况")
    void testMultiply() {
        System.out.println(">>> 执行测试：乘法");
        assertEquals(15, Calculator.multiply(3, 5), "3 * 5 应该等于 15");
        assertEquals(6, Calculator.multiply(2, 3), "2 * 3 应该等于 6");
        assertEquals(0, Calculator.multiply(5, 0), "5 * 0 应该等于 0");
        assertEquals(0, Calculator.multiply(0, 5), "0 * 5 应该等于 0");
    }
}